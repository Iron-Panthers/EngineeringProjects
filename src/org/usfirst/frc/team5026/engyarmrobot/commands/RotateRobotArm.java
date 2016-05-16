package org.usfirst.frc.team5026.engyarmrobot.commands;

import org.usfirst.frc.team5026.engyarmrobot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class RotateRobotArm extends Command {

	private double angle;
	
	/**
	 * @param angle the angle to rotate the arm to
	 */
    public RotateRobotArm(double angle) {
        requires(Robot.robotArm);
        this.angle = angle;
    }

    protected void initialize() {
    	Robot.robotArm.enable();
    	Robot.robotArm.setSetpoint(angle);
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        return Robot.robotArm.onTarget();
    }

    protected void end() {
    	
    }

    protected void interrupted() {
    	
    }
}
