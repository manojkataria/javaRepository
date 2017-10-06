package main.java.threading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.Executors;

public class FutureCallableMain {

	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(4);
		System.out.println("Start : " + Runtime.getRuntime().availableProcessors());
		Future powerFuture20;
		Future factorialFuture20;
		Future powerFuture25;
		Future factorialFuture25;
		
		powerFuture20 = es.submit(new PowerCalc(2));
		factorialFuture25 = es.submit(new FactorialCalc(4));
		factorialFuture20 = es.submit(new FactorialCalc(4));
		powerFuture25 = es.submit(new PowerCalc(2));
		try {
			System.out.println("Square of " + 2 + " : " + powerFuture25.get());
			System.out.println("Square of " + 2 + " : " + powerFuture20.get());
			System.out.println("Factorial of " + 4 + " : " + factorialFuture20.get());

			es.shutdown();
			System.out.println("Factorial of " + 4 + " : " + factorialFuture25.get());
		} catch (InterruptedException | ExecutionException e) {

			e.printStackTrace();
		}
		System.out.println("Done");
	}

}