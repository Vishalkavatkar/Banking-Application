package myOwnAutoShop;

/**
 * Super class car and we have declared variable speed, regularPrice and color
 * We have created a parameterized constructor with these inputs
 * We have also created a method getSalePrice
 *
 */
public class Car {
	private int speed;
	protected double regularPrice;
	private String color;

	/**
	 * Parameterized constructor with input speed, price and color
	 */
	public Car(int speed, double regularPrice, String color) {
		this.speed = speed;
		this.regularPrice = regularPrice;
		this.color = color;

	}

	/**
	 * In this method we return the regular price of the car
	 * @return
	 */
	public double getSalePrice() {
		return regularPrice;
	}
}