package com.company;

public class Main {

    public static void main(String[] args) {
	    int[] list = new int[] {1, 2, 3, 4, 5};
	    int sum = 0;
	    int iterator = 0;
	    for (int i=0; i < 5; i++){
	        sum = sum + list[i];
        }
	    System.out.println("Сумма массива в цикле for = " + sum);
		sum = 0;
	    while (iterator < 5){
			sum = sum + list[iterator];
			iterator++;
		}
		System.out.println("Сумма массива в цикле while = " + sum);
	    sum = 0;
		int jtor = 0;
		do {
			sum = sum + list[jtor];
			jtor++;
		}
		while (jtor < 5);
		System.out.println("Сумма массива в цикле do while = " + sum);
		for (String str : args){
			System.out.println("Значение 1 = "  + str);
		}
    }
}
