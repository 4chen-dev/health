package com.chen.utils;
/**
 * ���w�ĉ��
 * @author �¹���
 *
 */
public class Dog extends Animal implements Jump {

	@Override
	public void jump() {
		System.out.println("������");

	}

	@Override
	public void eat() {
		System.out.println("������");
	}

	
}
