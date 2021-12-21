package a09_메소드;

public class MethodEx {
	
	private String name; 
	
	public static void printInfo() { //매개변수x, 반환값 x
	    System.out.println("이");
	    System.out.println("태");
	    System.out.println("영");
	}
	
	public static void printName(String name) {//매개변수o, 반환값 x
		System.out.println("이름: " + name);
	}
	public static String getName() {//매개변수x, 반환값 o
		String name = "이태영";
		return name;
	}
	
	public static String transferName(String name){//매개변수 o, 반환값 o
		String tName = name + "님";
		return tName;
	}
	
	public static String transferName2(String name, int number) {
		return number + "번 고객: " + name;
	}
	public static void main(String[] args) { //void : 반환할 값이 없어 return하지 않음
		printInfo(); // 메소드를 호출한다
		System.out.println("프로그램 종료");
		
		String name = "이태영";
		printName(name);
		
		String name2 = getName();
		System.out.println(name2);
		System.out.println(getName());
		
		String name3 = transferName("이태영");
		System.out.println(name3);
		System.out.println(transferName("이태영"));
		
		System.out.println(transferName2("이태영", 1));
	}

}
