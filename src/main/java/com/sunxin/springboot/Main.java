package com.sunxin.springboot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		MyLambda myLambda = new MyLambda() {
			@Override
			public int m1(int a,int b) {
				System.out.println("我不是孙鑫的lambda"+a+b);
				return a+b;
			}
		};
		myLambda.m1(1,2);
		
		MyLambda myLambda1 = (a,b) -> {
			System.out.println("123");
			return a;
		};
		
		new Thread(() -> {
			System.out.println("123");
		}).start();
		String string = "56156165156ABCD";
		
		string=string.substring(0,string.length()-4);
		
		System.out.println(string);
		
		
		Integer arr [] = {10,9,3,45,6,8,7,8};
		
		Arrays.sort(arr,new Comparator<Integer>() {
			@Override
			public int compare(Integer x, Integer y) {
				return Integer.compare(x, y);
			}
			
		});
		
		Arrays.sort(arr,(x,y) -> Integer.compare(x, y));
		
		for (Integer integer : arr) {
			System.out.println(integer);
		}
		
		List<Student> list = new ArrayList<Student>();
		Student student = new Student();
		student.setId(1);
		student.setName("孙鑫");;
		student.setScore(50);
		list.add(student);
		list.add(student);
		list.add(student);
		list.add(student);
		list.add(student);
		list.add(student);
		list.add(student);
		list.add(student);
		
		List<Integer> map = list.stream().map(Student::getName).map(String::length).collect(Collectors.toList());
		for (Integer student2 : map) {
			System.out.println(student2);
		}
		System.out.println(i -> i);
		
		/*Thread myLambda1 = () -> {
			System.out.println("我是孙鑫的lambda");
		};
		myLambda1.*/
	}

}
