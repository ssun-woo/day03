package if_else;

import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args) {
	
		/*
		 제어문 : 프로그램의 흐름을 제어하는 것
		 if, switch, for, while, break, continue...
		 
		 
		 if (조건식)		
		 	종속문장			>> {} 없는것은 종속문장이 하나 일때만 사용 가능
		 
		 if (조건식) {
		 	종속문장
		 	종속문장
		 	종속문장
		 	...
		 }
		 >> if 문은 조건식이 true일 때만 실행
		 */
		
		
		Scanner input = new Scanner(System.in);
		int num;
		
		System.out.println("1. 쉬운게임");
		System.out.println("2. 어려운게임");
		
		System.out.print("숫자 입력 >>> ");
		num = input.nextInt();
		
		if (num == 1) {
			System.out.println("쉬운게임을 실행합니다");
		}
		if (num == 2) {
			System.out.println("어려운게임을 실행합니다");
		}
		System.out.println("다음 문장 실행1");
		System.out.println("다음 문장 실행2");
		System.out.println("다음 문장 실행3");
		
		
		
		
		
		
	}
	
}









































