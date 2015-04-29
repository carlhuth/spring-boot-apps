package sample;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedResource;

@ManagedResource(objectName = "mbeans:name=myJmxDemoBean", description = "My managed bean")
public class JMXDemo {

	private long counter = 0;

	@ManagedAttribute(description = "get counter")
	public long getCounter() {
		return counter;
	}

	@ManagedAttribute(description = "set counter")
	public void setCounter(long counter) {
		this.counter = counter;
	}
}
