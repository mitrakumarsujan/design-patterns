package org.practice.designpatterns.creational.builder.burger;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-26
 */
public class ChickenBurger extends Burger {

	@Override
	public String getName() {
		return "ChickenBurger";
	}

	@Override
	public double getPrice() {
		return 80.00D;
	}

}
