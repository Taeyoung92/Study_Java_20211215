package a06_입력;

import java.util.Scanner;

/**
 * 
 * 사용자의 이름을 입력해주세요 : 이태영 -> 문자열
 * 사용자의 아이디를 입력해주세요 : taeyoung -> 문자열
 * 사용자의 비밀번호를 입력해주세요 : 1234 -> 정수
 * 사용자의 이메일을 입력해주세요 : marine4391@naver.com -> 문자열
 * 
 * [입력한 사용자의 정보]
 * 이름 : 이태영
 * 아이디 : taeyoung
 * 비밀번호 : 1234
 * 이메일 : marine4391@naver.com
 *
 */

public class UserInfo {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("사용자의 이름을 입력해주세요 : ");
		String name = in.nextLine();
		System.out.print("사용자의 아이디를 입력해주세요 : ");
		String id = in.nextLine();
		System.out.print("사용자의 비밀번호를 입력해주세요 : ");
		int password = in.nextInt();
		System.out.print("사용자의 이메일을 입력해주세요 : ");
		String email = in.nextLine();
		
		System.out.println("\n[입력한 사용자의 정보]");
		System.out.println("이름 : " + name);
		System.out.println("아이디 : " + id);
		System.out.println("비밀번호 : " + password);
		System.out.println("이메일 : " + email);
		
		

	}

}
