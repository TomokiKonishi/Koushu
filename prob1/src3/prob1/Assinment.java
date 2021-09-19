package prob1;

import java.util.Scanner;

public class Assinment {

	public static void main(String[] args) {



Scanner scanner = new Scanner(System.in);

int a = scanner.nextInt();//aの値を入力
int b = scanner.nextInt();//bの値を入力
int c = a+b;

System.out.print(c);
System.out.print("=");
System.out.print(a);
System.out.print("+");
System.out.println(b);

System.out.print(c+1);
System.out.print("=");
System.out.print(c);
System.out.print("+");
System.out.print("1");
;scanner.close();
	}

}

