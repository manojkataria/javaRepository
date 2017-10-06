package main.java.threading;

import java.util.concurrent.Callable;

public class FactorialCalc implements Callable {

	private double number;

	FactorialCalc(double number) {

		this.number = number;
	}

	@Override
	public Double call() throws Exception {
		System.out.println("Calculating factorial with " + Thread.currentThread().getName());
		Thread.sleep(5000);
		double fact = 1;
		for (int i = 2; i <= number; i++) {
			fact *= i;
		}
		return fact;
	}
}