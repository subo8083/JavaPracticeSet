package com.question3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		
		ThreadA[] a= {new ThreadA(5),new ThreadA(4), new ThreadA(3), new ThreadA(6),new ThreadA(8),new ThreadA(9)};
		
		ExecutorService service=Executors.newFixedThreadPool(3);
		for(ThreadA arr:a) {
			Future f=service.submit(arr);
			System.out.println(f.get());
		}
		service.shutdown();

	}

}
