package operator;

import java.util.Scanner;

public class Test01 {
	
	public static void main(String[] args) {
	
		
		
		
		// 수입력 : 10
		// 10 = 짝수
		// 10 = 3의 배수가 아니다
		// 두 수 입력 : 10 20
		// num1 : 10, num2 : 20
		// num2가 num1보다 크다
		
		
		Scanner input = new Scanner(System.in);
		
		// 수를 입력 받아 짝, 홀수로 구분하여 출력 하시오
		int a;
		String str;
		
		System.out.print("수 입력 : ");
		a = input.nextInt();
		str = (a%2 == 0) ? "짝수입니다" : "홀수입니다";
		System.out.println(a + "은(는) " + str);

		
		// 수를 입력받아 3의 배수이면 출력하시오
		int b;
		
		System.out.print("수 입력 : ");
		b = input.nextInt();
		str = (b%3 == 0) ? "3의 배수 입니다" : "3의 배수가 아닙니다";
		System.out.println(b + "은(는) " + str);
	
		
		// 두수를 입력 받아 큰 수를 출력하시오
		int c, d;
		
		System.out.print("첫 번째 수 입력 : ");
		c = input.nextInt();
		
		System.out.print("두 번째 수 입력 : ");
		d = input.nextInt();
		
		str = (c > d) ? c + "가(이) 더 큽니다" : d + "가(이) 더 크거나 같습니다";
		System.out.println(str);
		
		
		input.close();
		
		
		

		
	}
	
}
