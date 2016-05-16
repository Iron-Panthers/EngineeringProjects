package org.usfirst.frc.team5026.engyarmrobot.subsystems;

import org.usfirst.frc.team5026.engyarmrobot.Constants;
import org.usfirst.frc.team5026.engyarmrobot.Hardware;
import org.usfirst.frc.team5026.engyarmrobot.commands.RotateRobotArm;
import org.usfirst.frc.team5026.engyarmrobot.util.GrabbyPneumaticClaw;
import org.usfirst.frc.team5026.engyarmrobot.util.HallEffectEncoder;

import edu.wpi.first.wpilibj.command.PIDSubsystem;

/**
 *
 */
public class RobotArm extends PIDSubsystem {
	
	HallEffectEncoder encoder;
	GrabbyPneumaticClaw grabby;

    public RobotArm() {
    	super(Constants.ARM_P, Constants.ARM_I, Constants.ARM_D, Constants.ARM_F);
    	Hardware.armEncoder.setDistancePerPulse(Constants.ARM_ENCODER_SCALING);
    	encoder = new HallEffectEncoder(
    			Hardware.armEncoder, Hardware.armHallEffect,
    			Constants.ARM_START, Constants.ARM_END);
    	setAbsoluteTolerance(Constants.ARM_PID_TOLERANCE);
    }
    
    public void initDefaultCommand() {
    	setDefaultCommand(new RotateRobotArm(Constants.ARM_START));
    }
    
    protected double returnPIDInput() {
    	return encoder.getCurrentValue();
    }
    
    protected void usePIDOutput(double output) {
    	setMotorPower(output);
    }
    
    public void setMotorPower(double power) {
    	Hardware.armMotor.set(power);
    }
    
    public void setGrabbyState(boolean grabbyState) {
    	grabby.setClawOpen(grabbyState);
    }
    
    public boolean getGrabbyState() {
    	return grabby.getGrabbyState();
    }
    
}
