package org.checkout.springbootwithassetpipeline.widget;

public class Widget {
	String color;
	private final int x;
	private final int y;

	public Widget(String color, int x, int y) {

		this.color = color;
		this.x = x;
		this.y = y;
	}

	public String getColor() {
		return color;
	}
}
