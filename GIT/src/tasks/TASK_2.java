package tasks;

import java.util.Scanner;

public class TASK_2 {
	public static void main(String[] args) {
		System.out.println("Put binary number");
		Scanner scn = new Scanner(System.in);
		String finals = "";
		int num = scn.nextInt();
		while(num >= 0) {
			int remi= num%2;
			if(remi == 0 || remi == 1) {
				finals = finals + remi;
			}
			else {
				System.out.println("Error taken!!!");
				break;
			}
		}
		System.out.println("Binary" + finals);
	}
}
