package scan.get.det;

import java.util.Scanner;

public class Scanner_1 {
public static void main(String[] args) {
	
	String a;
	
	Scanner x = new Scanner(System.in);
	System.out.println("Enter employee ID:");
	a = x.nextLine();
	System.out.println("Enter employee NAME:");
	a = x.nextLine();
	System.out.println("Enter employee EMAIL ID:");
	a = x.nextLine();
	System.out.println("Enter employee PHONE NUMBER:");
	a = x.nextLine();
	System.out.println("Enter employee SALARY:");
	a = x.nextLine();
	System.out.println("Enter employee GENDER:");
	a = x.nextLine();
	System.out.println("Enter employee CITY:");
	a = x.nextLine();
	x.close();
}
}
