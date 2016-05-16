package org.usfirst.frc.team5026.engyarmrobot.util;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;

/**
 * An encoder with two hall effect sensors at the start and end nodes
 * for correcting the distance with.
 */
public class HallEffectEncoder {
	
	Encoder encoder;
	DigitalInput hallEffect;
	double startValue, endValue, currentValue, lastRecordedValue;
	
	public HallEffectEncoder(Encoder encoder, DigitalInput hallEffect, double startValue, double endValue) {
		this.hallEffect = hallEffect;
		this.encoder = encoder;
		this.startValue = startValue;
		this.endValue = endValue;
		encoder.reset();
		this.currentValue = encoder.getDistance();
		this.lastRecordedValue = currentValue;
	}
	
	public void update() {
		double value = encoder.getDistance();
		if (hallEffect.get()) {
			if (encoder.getDirection()) {
				currentValue = startValue;
			} else {
				currentValue = endValue;
			}
		} else {
			this.currentValue += value - lastRecordedValue;
		}
		this.lastRecordedValue = value;
	}
	
	public double getCurrentValue() {
		return currentValue;
	}
	
}
