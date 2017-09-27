package main.java;

public class EnumExample {
	
	public static void main(String s[]) {
		System.out.println(UserStatus.get("blockUser"));
		
		System.out.println(UserStatus.get("deleteUser").toString());
	}

}
