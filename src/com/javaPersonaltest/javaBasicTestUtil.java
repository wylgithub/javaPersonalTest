package com.javaPersonaltest;

import java.util.Scanner;

public class javaBasicTestUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * ʵ����һ����
		 */
		System.out.println("�����Ӷ�������ϰ:��Ҫ����ϰ�����ĵݹ���ã�����е���쳲�����������");
		javaBasicTest jb = new javaBasicTest();
		Scanner console = new Scanner(System.in);
		System.out.println("�������·���:");
		int month = console.nextInt();
		long sumOfRabbit = jb._getSumOfRabbit(month);
		System.out.println(month+" ����֮�󽫻���: "+sumOfRabbit+"�����ӣ�");
		
		System.out.println("---������һ�����������ڸ������������ĸ���---");
		int n = console.nextInt();
		if(n != (int)n){
			System.out.println("����Ƿ������������룡");
		}
		System.out.println("���������������ļ��ϣ�");
		jb.getPrime(n);
	}

}
