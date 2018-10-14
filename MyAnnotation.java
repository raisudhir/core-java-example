package com.demo;

public @interface MyAnnotation {

	int value1() default 1;  
	String value2() default "";  
	String value3() default "xyz"; 
}
