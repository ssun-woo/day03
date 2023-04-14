package if_else;

import java.util.Scanner;

public class Test01 {
	
	public static void main(String[] args) {
		
		// 1. 입력받은 수가 3또는 5의 배수인지 판별 
		// ex) 3 > 3은(는) 3또는 5의 배수입니다
		//     4 > 4은(는) 3또는 5의 배수가 아닙니다
		//	   5 > 5은(는) 3또는 5의 배수입니다
		//     15 > 15은(는) 3또는 5의 배수입니다
		
		Scanner input = new Scanner(System.in);
		int num;
		
		System.out.print("수 입력 : ");
		num = input.nextInt();
		
//		if(num % 3 == 0 || num % 5 == 0) {
//			System.out.println(num + "은(는) 3또는 5의 배수입니다");
//		}
//		if (num % 3 != 0 && num % 5 != 0) {
//			System.out.println(num + "은(는) 3또는 5의 배수가 아닙니다");
//		}
		
		// 2. 입력받은 수가 3또는 5의 배수인지 판별하고, 15의 배수라면 15의 배수라고 출력
		// ex) 3 > 3은(는) 3또는 5의 배수입니다
		//     4 > 4은(는) 3또는 5의 배수가 아닙니다
		//	   5 > 5은(는) 3또는 5의 배수입니다
		//     15 > 15은(는) 15의 배수입니다
		//     45 > 45은(는) 15의 배수입니다
		
//		System.out.print("수 입력 : ");
//		num = input.nextInt();
		
		if(num % 15 == 0) {
			System.out.println(num + "은(는) 15의 배수입니다");
		}
		if( num%15 != 0 && (num % 3 ==0 || num % 5 ==0)) {
			System.out.println(num + "은(는) 3또는 5의 배수입니다");
		}
		if (num % 3 != 0 && num % 5 != 0) {
			System.out.println(num + "은(는) 3또는 5의 배수가 아닙니다");
		}
	
		
		// 3. 입력받은 수가 3또는 5의 배수인지 판별하고, 15의 배수라면 15의 배수라고 출력, 하지만 45의 배수라면 다시 3또는 5의 배수라고 출력
		// ex) 3 > 3은(는) 3또는 5의 배수입니다
		//     4 > 4은(는) 3또는 5의 배수가 아닙니다
		//	   5 > 5은(는) 3또는 5의 배수입니다
		//     15 > 15은(는) 15의 배수입니다
		//     45 > 45은(는) 3또는 5의 배수입니다
		
		
//		System.out.print("수 입력 : ");
//		num = input.nextInt();
		
//		if(num % 45 == 0 || ((num % 3 == 0 || num % 5 == 0) && num % 15 != 0)) {
//			System.out.println(num + "은(는) 3또는 5의 배수입니다");
//		}
//		if(num % 45 != 0) {
//			if (num % 15 == 0) {
//				System.out.println(num + "은(는) 15의 배수입니다");
//			}
//		}
//		if(num % 3 != 0 && num % 5 != 0) {
//			System.out.println(num + "은(는) 3또는 5의 배수가 아닙니다");
//		}
		
		
		
		// 1. 입력한 숫자가 2의 배수이고 5의 배수인 수인지 판별
		
//		System.out.print("수 입력 : ");
//		num = input.nextInt();
//		
//		if(num % 2 == 0 || num % 5 == 0) {
//			System.out.println(num + "은(는) 2또는 5의 배수입니다");
//		}
//		if(num % 2 !=0 && num % 5 != 0) {
//			System.out.println(num + "은(는) 2또는 5의 배수가 아닙니다");
//		}
		
		
		//두수를 입력받아 어떤 숫자가 더 큰지 알아맞히는 프로그램을 만드세요
//		System.out.print("첫번째 수 입력 : ");
//		int num1 = input.nextInt();
//		
//		System.out.print("두번째 수 입력 : ");
//		int num2 = input.nextInt();
//		
//		if (num1 > num2) {
//			System.out.println(num1 + "이(가) " + num2 + "보다 큽니다");
//		}
//		if (num1 < num2) {
//			System.out.println(num2 + "이(가) " + num1 + "보다 큽니다");
//		}
//		if(num1 == num2) {
//			System.out.println("입력한 두 수가 같습니다");
//		}
//		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
