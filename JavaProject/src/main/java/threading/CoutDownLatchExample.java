package main.java.threading;

import java.util.concurrent.CountDownLatch;

public class CoutDownLatchExample {
	
	public static void main (String[] arg) {
	CountDownLatch latch = new CountDownLatch(3);

	Waiter      waiter      = new Waiter(latch);
	Decrementer decrementer = new Decrementer(latch);

	
	new Thread(decrementer).start();
	new Thread(waiter).start();
	try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}

class Waiter implements Runnable{

    CountDownLatch latch = null;

    public Waiter(CountDownLatch latch) {
        this.latch = latch;
    }

    public void run() {
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Waiter Released");
    }
}

 class Decrementer implements Runnable {

    CountDownLatch latch = null;

    public Decrementer(CountDownLatch latch) {
        this.latch = latch;
    }

    public void run() {

        try {
            Thread.sleep(1000);
            this.latch.countDown();
            System.out.println("count down ....1");
            Thread.sleep(1000);
            this.latch.countDown();
            System.out.println("count down ....2");
            Thread.sleep(1000);
            this.latch.countDown();
            System.out.println("count down ....3");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}



