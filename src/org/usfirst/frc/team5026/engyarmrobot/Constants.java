package org.usfirst.frc.team5026.engyarmrobot;

public class Constants {

	public static final int ARM_ENCODER_PORT_A = 0;
	public static final int ARM_ENCODER_PORT_B = 1;
	public static final int ARM_HALL_EFFECT_PORT = 2;
	public static final int ARM_GRABBY_PORT_A = 4;
	public static final int ARM_GRABBY_PORT_B = 5;
	
	public static final int ARM_MOTOR_PORT = 0;
	
	public static final double ARM_P = 1; 
	public static final double ARM_I = 0;
	public static final double ARM_D = 0;
	public static final double ARM_F = 0;
	
	public static final double ARM_START = 0;
	public static final double ARM_END = 270;
	public static final double ARM_PID_TOLERANCE = 0.5/360.0;
	public static final double ARM_ENCODER_SCALING = 360/1024.0;

}
