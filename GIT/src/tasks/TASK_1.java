package tasks;
import java.util.Scanner;

public class TASK_1 {
	public static void main(String[] args) {
		System.out.println("Number here:");
		Scanner scn = new Scanner(System.in);
		int number =  scn.nextInt();
		int divde = number%2;
		if(divde == 0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
		}
}
