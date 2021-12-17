package a08_반복;

import java.util.Scanner;

public class GuGuDan {

	public static void main(String[] args) {
		//2 X 2 ~ 9 X 9
		
		/*
		 * [2단]
		 * 2 X 1 = 2
		 * ...
		 * 2 X 9 = 18
		 * 
		 * [3단]
		 * 3 X 1 = 3
		 * ...
		 * 3 X 9 = 27
		 * 
		 * ....
		 * 
		 * [9단]
		 * ...
		 * 9 X 9 = 81
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("시작 단수: ");
		int startDan = input.nextInt();
		input.nextLine();
		System.out.println("마지막 단수: ");
		int endDan = input.nextInt();
		input.nextLine();

		for(int dan = startDan; dan<(endDan + 1); dan++) {
			System.out.println("[" + dan + "단]");
			for(int j = 1; j<10; j++) {
				System.out.println(dan + " X " + j + " = " + dan*j);
			}System.out.println();
		}

	}

}
