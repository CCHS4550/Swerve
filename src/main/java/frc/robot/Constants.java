// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.math.util.Units;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    //MAKE SURE TO MAKE OUR NUMBERS
    public static final double kDriveWheelDiameterInches = 4.0;
    public static final double kWheelDiameterMeters = Units.inchesToMeters(kDriveWheelDiameterInches);
    public static final double kDriveMotorGearRatio = 8.15;
    public static final double kTurningMotorGearRatio = 12.9;
    public static final double kDriveEncoderRot2MMeter = kDriveMotorGearRatio * Math.PI * kWheelDiameterMeters;  
    public static final double kTurningEncoderRot2Rad = kTurningMotorGearRatio * Math.PI * 2.0;
    public static final double kDriveEncoderRPM2MeterPerSec = kDriveEncoderRot2MMeter * 60.0;
    public static final double kTurningEncoderRPM2RadPerSec= kTurningEncoderRot2Rad * 60.0;
    public static final double kTurning = 0.5; // i dont know if this is right
    

    public static final double kTrackWidthInches = 24.0;
    public static final double kEncoderCountsPerRevolution = 4096;
    public static final double kEncoderCountsPerInch = (kEncoderCountsPerRevolution * kDriveWheelDiameterInches) / (kTrackWidthInches * Math.PI);
    public static final double kMaxSpeedFeetPerSecond = 10.0;
    public static final double kMaxAccelerationFeetPerSecondSquared = 10.0;
    public static final double kMaxSpeedFeetPerSecondSquared = kMaxSpeedFeetPerSecond * kMaxSpeedFeetPerSecond;
    public static final double kMaxAccelerationFeetPerSecondSquaredSquared = kMaxAccelerationFeetPerSecondSquared * kMaxAccelerationFeetPerSecondSquared;
    public static final double kMaxSpeedFeetPerSecondCubed = kMaxSpeedFeetPerSecondSquared * kMaxSpeedFeetPerSecond;
    public static final double kMaxAccelerationFeetPerSecondCubed = kMaxAccelerationFeetPerSecondSquared * kMaxAccelerationFeetPerSecondSquared;
    public static final double kMaxSpeedFeetPerSecondQuartic = kMaxSpeedFeetPerSecondCubed * kMaxSpeedFeetPerSecond;
    public static final double kMaxAccelerationFeetPerSecondQuartic = kMaxAccelerationFeetPerSecondCubed * kMaxAccelerationFeetPerSecondCubed;
    public static final double kMaxSpeedFeetPerSecondQuintic = kMaxSpeedFeetPerSecondQuartic * kMaxSpeedFeetPerSecond;
    public static final double kMaxAccelerationFeetPerSecondQuintic = kMaxAccelerationFeetPerSecondQuartic * kMaxAccelerationFeetPerSecondCubed;
    public static final double kMaxSpeedFeetPerSecondSextic = kMaxSpeedFeetPerSecondQuintic * kMaxSpeedFeetPerSecond;
    public static final double kMaxAccelerationFeetPerSecond = kMaxAccelerationFeetPerSecondQuintic * kMaxAccelerationFeetPerSecondCubed;


    

}
