package com.biz.var;

public class Variable05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intNum1 = 0; //����� clear�� ���ÿ�
		int intSum = 0;
		
		intNum1 = intNum1 + 1; // num1 = 1
		intSum = intSum + intNum1 ; // sum =1
		
		intNum1 = intNum1 + 1;   // num 2
		intSum = intSum + intNum1; // sum = 3
		
		intNum1 = intNum1 + 1; // num = 3
		intSum = intSum + intNum1; // sum = 6
		
		intNum1 = intNum1 + 1; // num = 4
		intSum = intSum + intNum1; // sum = 10
		
		intNum1 = intNum1 + 1; // num = 5
		intSum = intSum + intNum1; // sum = 16

	}

}