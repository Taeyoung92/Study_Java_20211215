package a08_반복;

public class GuGuDanWhile {

	public static void main(String[] args) {
		/*
		 * 구구단 2단 출력
		 * 2 X 1 = 2
		 * 2 X 2 = 4
		 * ....
		 * 2 X 9 = 18
		 */
		int num = 1;
		int result = 0;
		while(num < 10) {
			result = (2*num);
			System.out.println("2 X " + num + " = " + result);
			num++;
		}

	}

}
