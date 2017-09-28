package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyCallable implements Callable {
	 
	   public String call() throws Exception {
	      Thread.sleep(2000);
	 
	      // return name of thread.
	      return (Thread.currentThread().getName() + "!!");
	   }
	}
	 
	class MyCallableTest {
	   public static void main (String args[]) {
	 
	      // thread pool size 5
	      ExecutorService executor = Executors.newFixedThreadPool(5);
	 
	      // collection to store results
	      List<Future<String>> list = new ArrayList<Future<String>>();
	 
	      // spawn 10 jobs
	      for(int i=0; i< 5; i++){
	         Future<String> future = executor.submit(new MyCallable()); 
	         list.add(future);
	      }
	 
	      // print results
	      for(Future<String> future : list){ 
	         try {
	            System.out.println(future.get());
	         } catch (Exception e) {
	         }
	      }
	 
	      executor.shutdown();
	   }
	}