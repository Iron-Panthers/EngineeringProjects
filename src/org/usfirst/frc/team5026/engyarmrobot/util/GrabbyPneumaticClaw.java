package org.usfirst.frc.team5026.engyarmrobot.util;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;

public class GrabbyPneumaticClaw {

	DoubleSolenoid grabbyValve;
	boolean grabbyState;
	
	public GrabbyPneumaticClaw(DoubleSolenoid grabbyValve) {
		this.grabbyValve = grabbyValve;
	}
	
	public void setClawOpen(boolean grabbyState) {
		grabbyValve.set(grabbyState ? Value.kForward : Value.kReverse);
		this.grabbyState = grabbyState;
	}
	
	public boolean getGrabbyState() {
		return grabbyState;
	}
	
}
