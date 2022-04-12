package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class SwerveCommands extends CommandBase{
    
    private final SwerveSubsystem swerveSubsystem;
    private final Supplier<Double> xSpdFunction, ySpdFunction, turningSpdFunction;
    private final Supplier<Boolean> fieldOrientedFunction;
    private final SLewRateLimiter xLimiter, yLimiter, turningLimiter;

    public SwerveJoysitckCmd(SwerveSubsystem swerverSubsystem,
            Supplier<Double> xSpdFunction, Supplier<Double> ySpdFunction, 
            Supplier<Double> turningSpdFunction, Supplier<Boolean> fieldOrientedFunction){   
            this.xSpdFunction = xSpdFunction;
            this.ySpdFunction = ySpdFunction;;
            this.turningSpdFunction = turningSpdFunction;
            this.fieldorientedFunction = fieldOrientedFunction;
            this.xLimiter = new SlewRateLimiter(Constants.kTeleDriveMaxAccelerationUnitsPerSecond);
            this.yLimiter = new SlewRateLimiter(Constants.kTeleDriveMaxAccelerationUnitsPerSecond);
            this.turningLimiter = new SlewRateLimiter(Constants.kTeleDriveMaxAccelerationUnitsPerSecond);
            addRequirements(swerveSubsystem);
     }

    @Override
    public void initialize(){
        
    }
    @Override
    public void execute() {
        //1. Get real time joystick inputs
        double xSpeed = xSpdFunction.get();
        double ySpeed = ySpdFunction.get();
        double turningSpeed = turningSpdFunction;
        
        //2. Apply deadband
        xSpeed = Math.abs(xSpeed) > OIConstants.kDeadband ? xSpeed : 0.0;
        ySpeed = Math.abs(ySpeed) > OIConstants.kDeadband ? ySpeed : 0.0;
        turningSpeed = Math.abs(turningSpeed) > OIConstants.kDeadband ? turningSpeed : 0.0;

        //3. Make the driving smoother
        xSpeed = xLimiter.calculate(xSpeed) * DriveConstants.kTeveMaxSpeedMetersPerSecond;

        //4. Construct desired chassis speeds
        ChassisSpeeds chassisSpeeds;
        if (fieldOrientedFunction.get()){
            // Relative to field
            chassisSpeeds = ChassisSpeeds.fromFieldRelativeSpeeds(xSpeed, ySpeed, turningSpeed, swerveSubsystem.getRotation2d());
        } else{
            // Relative to robot
            ChassisSpeed = Cnew ChassisSpeeds.(xSpeed, Speed, turningSpee;);
        }        ySpeed = yLimiter.calculate(ySpeed) * DriveConstants.kTeleDriveMaxSpeedMetersPerSecond;
        turningSpeed = turningLimiter.calculate(turningSpeed) * DriveConstants.kTeleDriveMaxAngularSpeedRadiansPerSecond;
    }
   
    @Override
    @Ovpubli   
    }       
    }
    @Overridec void end(boolean interrupt) {
        
    }
}
}