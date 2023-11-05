package homework;

import java.util.Scanner;


public class Hw1102 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = Integer.parseInt(sc.nextLine());
		String grade = "";
		
		if(test >= 90 && test <= 100) {
			grade = "A";
		} else if(test >= 80) {
			grade = "B";
		} else if(test >= 70) {
			grade = "C";
		} else if(test >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		System.out.println(grade);
	}
}

	/*
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= N-i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= 2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

*/


