/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.I2C;
import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.SPI.Port;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
  //List of all PWM ports
	private final static int PWM_0 = 0;
	private final static int PWM_1 = 1;
	private final static int PWM_2 = 2;
	private final static int PWM_3 = 3;
	private final static int PWM_4 = 4;
	private final static int PWM_5 = 5;
	private final static int PWM_6 = 6;
	private final static int PWM_7 = 7;
	private final static int PWM_8 = 8;
	private final static int PWM_9 = 9;
	// see https://www.pdocs.kauailabs.com/navx-mxp/installation/io-expansion/
	private final static int PWM_MXP_0 = 10;
	private final static int PWM_MXP_1 = 11;
	private final static int PWM_MXP_2 = 12;
	private final static int PWM_MXP_3 = 13;
	private final static int PWM_MXP_4 = 14;
	private final static int PWM_MXP_5 = 15;
	private final static int PWM_MXP_6 = 16;
	private final static int PWM_MXP_7 = 17;
	private final static int PWM_MXP_8 = 18;
	private final static int PWM_MXP_9 = 19;

	// List of Talon SRX CAN IDs
	private final static int SRX_CAN_0 = 0;
	private final static int SRX_CAN_1 = 1;
	private final static int SRX_CAN_2 = 2;
	private final static int SRX_CAN_3 = 3;

	// List of CAN IDs
	private final static int CAN_0 = 0; 
	private final static int CAN_1 = 1; 
	private final static int CAN_2 = 2; 
	private final static int CAN_3 = 3; 
	private final static int CAN_4 = 4; 
	private final static int CAN_5 = 5;
	private final static int CAN_6 = 6; 
	private final static int CAN_7 = 7; 
	private final static int CAN_8 = 8;
	private final static int CAN_9 = 9; 
	private final static int CAN_10 = 10;
	private final static int CAN_11 = 11;
	private final static int CAN_12 = 12; 
	private final static int CAN_13 = 13; 
	private final static int CAN_14 = 14; 
	private final static int CAN_15 = 15; 
	private final static int CAN_16 = 16;
	private final static int CAN_17 = 17;
	private final static int CAN_18 = 18; 
	private final static int CAN_19 = 19; 
	private final static int CAN_20 = 20; 
	private final static int CAN_21 = 21;
	private final static int CAN_22 = 22;
	private final static int CAN_23 = 23;
	private final static int CAN_24 = 24; 
	private final static int CAN_25 = 25; 
	private final static int CAN_26 = 26; 
	private final static int CAN_27 = 27; 
	private final static int CAN_28 = 28; 
	private final static int CAN_29 = 29; 
	private final static int CAN_30 = 30; 
	private final static int CAN_31 = 31; 
	private final static int CAN_32 = 32; 
	private final static int CAN_33 = 33; 
	private final static int CAN_34 = 34; 
	private final static int CAN_35 = 35; 
	private final static int CAN_36 = 36; 
	private final static int CAN_37 = 37; 
	private final static int CAN_38 = 38; 
	private final static int CAN_39 = 39; 
	private final static int CAN_40 = 40; 
	private final static int CAN_41 = 41; 
	private final static int CAN_42 = 42; 
	private final static int CAN_43 = 43; 
	private final static int CAN_44 = 44; 
	private final static int CAN_45 = 45; 
	private final static int CAN_46 = 46; 
	private final static int CAN_47 = 47; 
	private final static int CAN_48 = 48; 
	private final static int CAN_49 = 49; 
	private final static int CAN_50 = 50; 
    
	// List of PCM CAN IDs
	public final static int PCM_CAN = CAN_16;
	public final static int PCM_CAN_2 = CAN_18;

	//List of all analog ports
	private final static int ANALOG_0 = 0;
	private final static int ANALOG_1 = 1;
	private final static int ANALOG_2 = 2;
	private final static int ANALOG_3 = 3;
	// see https://www.pdocs.kauailabs.com/navx-mxp/installation/io-expansion/
	private final static int ANALOG_MXP_0 = 4;
	private final static int ANALOG_MXP_1 = 5;
	private final static int ANALOG_MXP_2 = 6;
	private final static int ANALOG_MXP_3 = 7;

	//List of all relays
	private final static int RELAY_0 = 0;
	private final static int RELAY_1 = 1;
	private final static int RELAY_2 = 2;
	private final static int RELAY_3 = 3;

	//List of all DIO ports
	private final static int DIO_0 = 0;
	private final static int DIO_1 = 1;
	private final static int DIO_2 = 2;
	private final static int DIO_3 = 3;
	private final static int DIO_4 = 4;
	private final static int DIO_5 = 5;
	private final static int DIO_6 = 6;
	private final static int DIO_7 = 7;
	private final static int DIO_8 = 8;
	private final static int DIO_9 = 9;

	// see https://www.pdocs.kauailabs.com/navx-mxp/installation/io-expansion/
	private final static int DIO_MXP_0 = 10;
	private final static int DIO_MXP_1 = 11;
	private final static int DIO_MXP_2 = 12;
	private final static int DIO_MXP_3 = 13;
	private final static int DIO_MXP_4 = 18;
	private final static int DIO_MXP_5 = 19;
	private final static int DIO_MXP_6 = 20;
	private final static int DIO_MXP_7 = 21;
	private final static int DIO_MXP_8 = 22;
	private final static int DIO_MXP_9 = 23;

	//List of all USB ports
	private static final int USB_0 = 0;
	private static final int USB_1 = 1;
	private static final int USB_2 = 2;
	private static final int USB_3 = 3;

	// Pneumatic Control Module (PCM) ports
	private static final int PCM_0 = 0;
	private static final int PCM_1 = 1;
	private static final int PCM_2 = 2;
	private static final int PCM_3 = 3;
	private static final int PCM_4 = 4;
	private static final int PCM_5 = 5;
	private static final int PCM_6 = 6;
	private static final int PCM_7 = 7;

	//List of all PDP ports
	private static final int PDP_0 = 0;
	private static final int PDP_1 = 1;
	private static final int PDP_2 = 2;
	private static final int PDP_3 = 3;
	private static final int PDP_4 = 4;
	private static final int PDP_5 = 5;
	private static final int PDP_6 = 6;
	private static final int PDP_7 = 7;
	private static final int PDP_8 = 8;
	private static final int PDP_9 = 9;
	private static final int PDP_10 = 10;
	private static final int PDP_11 = 11;
	private static final int PDP_12 = 12;
	private static final int PDP_13 = 13;
	private static final int PDP_14 = 14;
	private static final int PDP_15 = 15;
	private static final int PDP_16 = 16;

	//[U]ser Input
	public static final int U_LEFT = 0;
	
	// [M]otor subsystems
	public static final int M_LEFT = PWM_1;
	public static final int M_RIGHT = PWM_0;
	public static final int M_LEFT_ENCODER_CCW = DIO_0;
	public static final int M_LEFT_ENCODER_CW = DIO_1;
	public static final int M_LEFT_POTENTIOMETER = ANALOG_3;

	//[A]rm subsystem 
	public static final int M_ELBOW_MOTOR = CAN_31;
	public static final int m_SHOULDER_MOTOR = CAN_32;
	public static final int M_TURRET_MOTOR = CAN_8;

	public static final int M_SHOULDER_POT = ANALOG_0;
	public static final int M_ELBOW_POT = ANALOG_1;
	public static final int M_TURRET_POT = ANALOG_2;

	public static final int M_SHOULDER_ENCODER_IN = DIO_4; 
	public static final int M_SHOULDER_ENCODER_OUT = DIO_5; 
	public static final int M_ELBOW_ENCODER_IN = DIO_8;
	public static final int M_ELBOW_ENCODER_OUT = DIO_9;
	public static final int M_TURRET_ENCODER_IN = DIO_2;
	public static final int M_TURRET_ENCODER_OUT = DIO_3;

	// [C]lock Subsystem
	public static final int H_HAND_MOTOR = CAN_33;
	public static final int H_HAND_ENCODER_A = DIO_6;
	public static final int H_HAND_ENCODER_B = DIO_7;
	
}
