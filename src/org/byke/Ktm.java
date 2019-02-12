package org.byke;

public class Ktm implements Bike{

	@Override
	public void cost() {
		System.out.println("2558522");
	}

	@Override
	public void speed() {
		System.out.println("100km/hr");
	}
public static void main(String[] args) {
	Ktm k0 = new Ktm();
	k0.cost();
	k0.speed();
}
}
