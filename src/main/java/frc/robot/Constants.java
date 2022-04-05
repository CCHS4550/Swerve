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
    public static final double kWheelDiameterMeters = Units.inchesToMeters();
    public static final double kDriveMotorGearRatio;
    public static final double kTurningMotorGearRatio;
    public static final double kDriveEncoderRot2MMeter = kDriveMotorGearRatio * Math.PI * kWheelDiameterMeters;  
    public static final double kTurningEncoderRot2Rad;
    public static final double kDriveEncoderRPM2MeterPerSec;
    public static final double kTurningEncoderRPM2RadPerSec;
    public static final double kTurning;

}