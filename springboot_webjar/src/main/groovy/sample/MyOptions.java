package sample;

import org.springframework.stereotype.Component;

@Component
public class MyOptions {

	private int speed = 0;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
}