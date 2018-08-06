package com.exilant.day1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class LamdaThreadService06 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		executorService.execute(new Runnable() {

			@Override
			public void run() {
				System.out.println("Hi i am annonymous classs");
			}
		});

		executorService.shutdown();
		// java 8
		ExecutorService executorService1 = Executors.newSingleThreadExecutor();
		executorService1.execute(() -> {
			System.out.println("Hi i am lambda expression ");

		});
		executorService.shutdown();
		System.out.println("callable works");
		ExecutorService service2 = Executors.newSingleThreadExecutor();
		Set<Callable<String>> callables= initializeCallables();
		
//		String result = service2.invokeAny(callables);
//		System.out.println("result"+result);
//		service2.shutdown();
		
		List<Future<String>> result=service2.invokeAll(callables);
		for(Future temp:result) {
		//	temp.
			System.out.println(temp.get());
		}
		
		
		service2.shutdown();

	}
	// this methopd will create set of callables (each callable is 1 thraed)

	public static Set<Callable<String>> initializeCallables() {
		Set<Callable<String>> callables = new HashSet<Callable<String>>();

		callables.add(() -> "1st callable");
		callables.add(() -> "2nd callable");
		callables.add(() -> "3rd callable");
		callables.add(() -> "4th callable");
		callables.add(() -> "5th callable");

		callables.add(new Callable<String>() {
			public String call() throws Exception {
				return "callable thread in annonymous class";
			};

		});
		callables.add(() -> {
			return "complex called business logic";
		});
		return callables;
	}

}
