package com.javaPersonaltest;

import java.util.Scanner;

public class javaBasicTestUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * ʵ����һ����
		 */
		javaBasicTest jb = new javaBasicTest();
//		System.out.println("�����Ӷ�������ϰ:��Ҫ����ϰ�����ĵݹ���ã�����е���쳲�����������");
//		javaBasicTest jb = new javaBasicTest();
//		Scanner console = new Scanner(System.in);
//		System.out.println("�������·���:");
//		int month = console.nextInt();
//		long sumOfRabbit = jb._getSumOfRabbit(month);
//		System.out.println(month+" ����֮�󽫻���: "+sumOfRabbit+"�����ӣ�");
//		
//		System.out.println("---������һ�����������ڸ������������ĸ���---");
//		int n = console.nextInt();
//		if(n != (int)n){
//			System.out.println("����Ƿ������������룡");
//		}
//		System.out.println("���������������ļ��ϣ�");
//		jb.getPrime(n);
//		
//		System.out.println("�ж�һ�����ǲ���ˮ�ɻ���!");
//		System.out.println("������һ����λ��(100~999):");
////		Scanner console = new Scanner(System.in);
//		int number = console.nextInt();
//		if(number >= 1000 || number <0 ){
//			System.out.println("����������ַǷ������������룡");
//			return;
//		}
//		jb.isLouts(number);
//		
//		
//		System.out.println("����һ�������������999������ˮ�ɻ���:");
//		int num1 = console.nextInt();
//		jb.isLoutsTwo(num1);
//		
		Scanner console = new Scanner(System.in);
		System.out.println("����һ�����ṩ�ֽ�������:");
		int data = console.nextInt();
		System.out.println("�ֽ��������Ľ��Ϊ:");
		jb.splitData(data);
		
		System.out.println("������ɼ�:");
		try {
			jb.getGrade(console.nextDouble());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
