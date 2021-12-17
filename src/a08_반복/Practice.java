package a08_반복;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("시작 단수: ");
		int fir = in.nextInt();
		System.out.println("마지막 단수 : ");
		int las = in.nextInt();
		
		for(int i = fir; i<100; i++) {
			System.out.println("[" + i + "단]");
			for(int j = 1; j<10; j++) {
				System.out.println(i + " X " + j + " = " + i*j);
			}System.out.println();
			if(i == las) {
				break;
			}
		}

	}

}
