package frc.robot.subsystems;


import frc.robot.subsystems.SwerveModule;

import frc.robot.Constants;

public class SwerveSubsystem {
    private final SwerveModule frontLeftModule = new SwerveModule(
        Constants.kFrontLeftModuleAngle,
        Constants.kFrontLeftModuleToCenter,
        Constants.kFrontLeftModuleWheelRadius,
        Constants.kFrontLeftModuleWheelBase,
        Constants.kFrontLeftModuleMaxAngularVelocity,
        Constants.kFrontLeftModuleMaxLinearVelocity,
        Constants.kFrontLeftModuleMaxAcceleration,
        Constants.kFrontLeftModuleMaxAngularAcceleration,
        Constants.kFrontLeftModuleMaxLinearAcceleration,
        Constants.kFrontLeftModuleWheelDiameter,
        Constants.kFrontLeftModuleWheelGearRatio,
        Constants.kFrontLeftModuleWheelEncoderPPR,
        Constants.kFrontLeftModuleWheelEncoderReversed,
        Constants.kFrontLeftModuleWheelEncoderType,
        Constants.kFrontLeftModuleWheelEncoderTimeout,
        Constants.kFrontLeftModuleWheelEncoderSamplesToAverage,
        Constants.kFrontLeftModuleWheelEncoderDistancePerPulse,
        Constants.kFrontLeftModuleWheelEncoderDistancePerRotation
    );

    private final SwerveModule frontRightModule = new SwerveModule(
        Constants.kFrontRightModuleAngle,
        Constants.kFrontRightModuleToCenter,
        Constants.kFrontRightModuleWheelRadius,
        Constants.kFrontRightModuleWheelBase,
        Constants.kFrontRightModuleMaxAngularVelocity,
        Constants.kFrontRightModuleMaxLinearVelocity,
        Constants.kFrontRightModuleMaxAcceleration,
        Constants.kFrontRightModuleMaxAngularAcceleration,
        Constants.kFrontRightModuleMaxLinearAcceleration,
        Constants.kFrontRightModuleWheelDiameter,
        Constants.kFrontRightModuleWheelGearRatio,
        Constants.kFrontRightModuleWheelEncoderPPR,
        Constants.kFrontRightModuleWheelEncoderReversed,
        Constants.kFrontRightModuleWheelEncoderType,
        Constants.kFrontRightModuleWheelEncoderTimeout,
        Constants.kFrontRightModuleWheelEncoderSamplesToAverage,
        Constants.kFrontRightModuleWheelEncoderDistancePerPulse,
        Constants.kFrontRightModuleWheelEncoderDistancePerRotation
    );

    private final SwerveModule rearLeftModule = new SwerveModule(
        Constants.kRearLeftModuleAngle,
        Constants.kRearLeftModuleToCenter,
        Constants.kRearLeftModuleWheelRadius,
        Constants.kRearLeftModuleWheelBase,
        Constants.kRearLeftModuleMaxAngularVelocity,
        Constants.kRearLeftModuleMaxLinearVelocity,
        Constants.kRearLeftModuleMaxAcceleration,
        Constants.kRearLeftModuleMaxAngularAcceleration,
        Constants.kRearLeftModuleMaxLinearAcceleration,
        Constants.kRearLeftModuleWheelDiameter,
        Constants.kRearLeftModuleWheelGearRatio,
        Constants.kRearLeftModuleWheelEncoderPPR,
        Constants.kRearLeftModuleWheelEncoderReversed,
        Constants.kRearLeftModuleWheelEncoderType,
        Constants.kRearLeftModuleWheelEncoderTimeout,
        Constants.kRearLeftModuleWheelEncoderSamplesToAverage,
        Constants.kRearLeftModuleWheelEncoderDistancePerPulse,
        Constants.kRearLeftModuleWheelEncoderDistancePerRotation
    );

    private final SwerveModule rearRightModule = new SwerveModule(
        Constants.kRearRightModuleAngle,
        Constants.kRearRightModuleToCenter,
        Constants.kRearRightModuleWheelRadius,
        Constants.kRearRightModuleWheelBase,
        Constants.kRearRightModuleMaxAngularVelocity,
        Constants.kRearRightModuleMaxLinearVelocity,
        Constants.kRearRightModuleMaxAcceleration,
        Constants.kRearRightModuleMaxAngularAcceleration,
        Constants.kRearRightModuleMaxLinearAcceleration,
        Constants.kRearRightModuleWheelDiameter,
        Constants.kRearRightModuleWheelGearRatio,
        Constants.kRearRightModuleWheelEncoderPPR,
        Constants.kRearRightModuleWheelEncoderReversed,
        Constants.kRearRightModuleWheelEncoderType,
        Constants.kRearRightModuleWheelEncoderTimeout,
        Constants.kRearRightModuleWheelEncoderSamplesToAverage,
        Constants.kRearRightModuleWheelEncoderDistancePerPulse,
        Constants.kRearRightModuleWheelEncoderDistancePerRotation);


    public SwerveModule getFrontLeftModule() {
        return frontLeftModule;
    
    }

    public SwerveModule getFrontRightModule() {
        return frontRightModule;
    
    }

    public SwerveModule getRearLeftModule() {
        return rearLeftModule;
    
    }

    public SwerveModule getRearRightModule() {
        return rearRightModule;
    
    }
}
