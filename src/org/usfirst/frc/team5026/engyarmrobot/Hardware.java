package org.usfirst.frc.team5026.engyarmrobot;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;

public class Hardware {
	
	public static SpeedController armMotor;
	public static Encoder armEncoder;
	public static DigitalInput armHallEffect;
	public static DoubleSolenoid armGrabbyValve;
	
	public static void initialize() {
		armMotor = new Talon(Constants.ARM_MOTOR_PORT);
		armEncoder = new Encoder(Constants.ARM_ENCODER_PORT_A, Constants.ARM_ENCODER_PORT_B);
		armHallEffect = new DigitalInput(Constants.ARM_HALL_EFFECT_PORT);
		armGrabbyValve = new DoubleSolenoid(Constants.ARM_GRABBY_PORT_A, Constants.ARM_GRABBY_PORT_B);
	}

}
