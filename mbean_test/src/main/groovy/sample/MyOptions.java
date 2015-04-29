package sample;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedResource;

@ManagedResource(objectName = "myapp:name=myOptions", description = "My Options MBean")
public class MyOptions {

	private int speed = 0;

	@ManagedAttribute(description = "get speed")
	public int getSpeed() {
		return speed;
	}

	@ManagedAttribute(description = "set speed")
	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
