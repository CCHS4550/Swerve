
package frc.robot.subsystems;

import edu.wpi.first.*;
import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.math.kinematics.SwerveModuleState;
import edu.wpi.first.wpilibj.RobotController;
import frc.robot.Constants;

import com.revrobotics.RelativeEncoder;
import com.revrobotics.AnalogInput;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;


public class SwerveModule {

    private final CANSparkMax driveMotor;
    private final CANSparkMax turningMotor;

    //need like 8 total :)
    private final RelativeEncoder driveEncoder;
    private final RelativeEncoder turningEncoder;

    private final PIDController turningPidController;

    private final AnalogInput absoluteEncoder;
    private final boolean absoluteEncoderReversed;
    private final double absoluteEncoderOffsetRad;

    private double absoluteEncoderOffset;

    public SwerveModule(int driveMotorId, int turningMotorId, boolean driveMotorReversed, boolean turningMotorReversed, 
        int absoluteEncoderId, double absoluteEncoderOffset, boolean absoluteEncoderReversed) {

        this.absoluteEncoderOffset = absoluteEncoderOffset;
        this.absoluteEncoderReversed = absoluteEncoderReversed;
        absoluteEncoder = new AnalogInput(absoluteEncoderId);
        
        driveMotor = new CANSparkMax(driveMotorId, MotorType.kBrushless);
        turningMotor = new CANSparkMax(turningMotorId, MotorType.kBrushless);

        driveMotor.setInverted(driveMotorReversed);
        turningMotor.setInverted(turningMotorReversed);

        driveEncoder = driveMotor.getEncoder();
        turningEncoder = turningMotor.getEncoder();

        //Constants
        driveEncoder.setPositionConversionFactor(Constants.kDriveEncoderRot2Meter);
        driveEncoder.setVelocityConversionFactor(Constants.kDriveEncoderRPM2MeterPerSec);
        turningEncoder.setPositionConversionFactor(Constants.kTurningEncoderRot2Rad);
        turningEncoder.setVelocityConversionFactor(Constants.kRTurningEncoderRPMRadPerSec);

        turningPidController = new PIDController(Constants.kPTurning, 0, 0);
        turningPidController.enableContinuousInput(-Math.PI, Math.PI);

        resetEncoders();
        
    }

    
   


    public double getTurningPosition() {
        return turningEncoder.getPosition();
    }

    // get drive velocity
    public double getDriveVelocity() {
        return driveEncoder.getVelocity();
    }

    // get turning velocity
    public double getTurningVelocity() {
        return turningEncoder.getVelocity();
    }



    // get the absolute encoder position
    public double getAbsoluteEncoderPosition() {
        double angle = absoluteEncoder.getVoltage() / RobotController.getVoltage5V();
        angle *= 2.0 * Math.PI; //REMEMBER THE FUCKING (no cursing)  GOD DAMN 2
        angle -= absoluteEncoderOffsetRad;
        return angle * (absoluteEncoderReversed ? -1.0 : 1.0);
    }
    public void resetEncoders() {
        driveEncoder.setPosition(0);
        turningEncoder.setPosition(getAbsoluteEncoderPosition());
        
    }
    public SwerveModuleState getState() {
        return new SwerveModuleState(getDriveVelocity(), new Rotation2d(getTurningPosition()));
    }
    public void setDesiredState(SwerveModuleState state) {
        if (Math.abs(state.speedMetersPerSecond) < 0.001) {
            stop();
            return;
        }
            state = SwerveModuleState.optimize(state, getState().angle);
            driveMotor.set(state.speedMetersPerSecond / Constants.kPhysicalMaxSpeedMetersPerSecond);
            turningMotor.set(turningPidController.calculate(getTurningPosition(), state.angle.getRadians()));
            // SmartDashboard.putString("Swerve[" + absoluteEncoder.getChannel() + "] state", state.toString());
    }
    
    public void stop() {
        driveMotor.set(0);
        turningMotor.set(0);
    }
}
