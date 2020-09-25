package org.practice.designpatterns.creational.abstractfactory;

/**
 * @author Sujan Kumar Mitra
 * @since 2020-09-25
 */
public class LinuxButton implements Button {

	@Override
	public void click() {
		System.out.println("clicked a linux button");
	}

}
