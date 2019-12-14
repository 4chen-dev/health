package com.chen.utils;
/**
 * 具體的夠類
 * @author 陈国炎
 *
 */
public class Dog extends Animal implements Jump {

	@Override
	public void jump() {
		System.out.println("狗跳高");

	}

	@Override
	public void eat() {
		System.out.println("狗吃肉");
	}

	
}
