package com.sunxin.springboot;

import java.lang.reflect.Method;
import java.text.Annotation;

public class tack {
	@Schedule(dayOfweck = 2,hour = 13)
	@Schedule(dayOfweck = 3,hour = 13)
	public void run() {
		System.out.println("执行任务");
	}
	
	public static void main(String[] args) {
		try {
			Method method = tack.class.getMethod("run");
			;
			for (java.lang.annotation.Annotation string : method.getAnnotations()) {
				System.out.println(string);
			}
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
	}
}
