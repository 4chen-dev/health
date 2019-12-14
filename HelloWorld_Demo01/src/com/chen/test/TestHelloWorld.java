package com.chen.test;

import com.chen.pojo.User;
import com.chen.utils.Cat;
import com.chen.utils.Dog;

public class TestHelloWorld {

	public static void main(String[] args) {
		User user=new User();
		user.setAge(20);
		user.setName("jay");
		System.out.println(user);
		
		Cat cat=new Cat();
		cat.eat();
		Dog dog=new Dog();
		dog.eat();
	}
	
	
	
}
