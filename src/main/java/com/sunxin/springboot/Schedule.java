package com.sunxin.springboot;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(value=Schedule.Schedules.class)
public @interface Schedule {
	
	int dayOfweck() default 1;
	int hour() default 0;

	@Retention(RetentionPolicy.RUNTIME)
	@interface Schedules{
		Schedule[] value();
	}
}
