package operator;

public class Ex02 {
	public static void main(String[] args) {
		
		/*
		 삼항 연산자(조건 연산자)
		 (조건식)? true인 경우 실행 : false인 경우실행;
		 */
		
		int su;
		su = 8;
		
		String s = (su%2 == 0) ? "짝수" : "홀수";
		System.out.println(su + ":" + s);
		
		s = (su%3 == 0) ? "3의 배수" : "3의배수 아님";
		System.out.println(su + ":" + s);
		
		
		
	}
}
