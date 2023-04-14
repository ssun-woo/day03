package operator;

public class Ex01 {
	
	public static void main(String[] args) {
		
		/*
		 +, -, *, /, %
		 
		 / : 정수 / 정수 = 몫(정수 값만 나옴)
		 	- 10 / 3 = 3, 10 / 3.0 = 3.333
		 
		 %(mod) : 나머지값을 구해주는 연산자
		 	- 10 % 3 = 1
		 	- 배수인지 판별을 위해 사용
		 	- 나누는 수만큼 나머지의 갯수가 나옴(3으로 나누면 나머지는 0,1,2만 가능)
		 */
		System.out.println("===========================");
		System.out.println("기본 연산자");
		int num1 = 9, num2 = 2;
		System.out.println( "9/2 : " + num1 / num2 );			// 몫인 '4'만 출력됨
		System.out.println( "9/2.0 : " + num1 / (float)num2 );	// 정수/실수(형변환) = 실수, '4.5'출력
		System.out.println( "9%2 : " + num1 % num2 );			// 나머지인 '1'출력
		
		/*
		 복합대입 연산자
		 num = 10;
		 num = num + 10; => num += 10;
		 num = num / 10; => num /= 10;
		 num = num % 10; => num %= 10;
		 */
		
		int su1, su2;
		su1 = su2 = 5;
		System.out.println("===========================");
		System.out.println("복합대입 연산자");
		su1 += 1;					// su1 = su1 + 1
		System.out.println( "su1 += 1 : " + su1 );	// su1 = 6
		
		su1 -= 1;					// su1 = su1 - 1
		System.out.println( "su1 -= 1 : " + su1 );  // su1 = 5
			
		su1 *= su2;					// su1 = su1 * su2
		System.out.println( "su1 *= su2 : " + su1 );  // su1 = 25
		
		su1 /= su2;					// su1 = su1 / su2
		System.out.println( "su1 /= su2 : " + su1 );  // su1 = 5
		
		su1 %= su2;					// su1 = su1 % su2
		System.out.println( "su1 %= su2 : " + su1 );  // su1 = 0
		
		
		
		/*
		 관계 연산자 => 결과는 true / false 출력
		 기본적으로 이항연산자만 가능함(3개 이상은 비교 불가능)
		 >, <=, <, <=, ==(같은가), !=(같지 않은가) 
		 
		 a = 10, b = 20;
		 a > b : a가 b보다 큰가? -> false  
		 */
		
		
		System.out.println("===========================");
		System.out.println("관계 연산자");
		
		double do01 = 1.1, do02 = 1.2;
		System.out.println( "1.1 >= 1.2 : " + (do01 >= do02) );	// false
		System.out.println( "1.1 <= 1.2 : " + (do01 <= do02) );	// true
		System.out.println( "1.1 == 1.2 : " + (do01 == do02) );	// false 
		System.out.println( "1.1 != 1.2 : " + (do01 != do02) );	// true
		
		
		/*
		 논리 연산자 => true / false 출력
		 
		 ||(or) : 식들 중 하나라도 참이면 참
		 
		 &&(and) : 모든 값이 참일때만 참 
		 		- 하나라도 거짓이면 거짓
		 
		 !(not) : 결과를 반전시켜준다
		 		- !true == false
		 */
		
		int number = 10;
		System.out.println("===========================");
		System.out.println("논리 연산자");
		
		
		
		System.out.println( "10>5 && 10%2 == 0 " + ((number>5) && (number % 2) == 0));
		// 결과값이 모두 true >> true
		
		System.out.println( "10>5 && 10%2 == 1 " + ((number>5) && (number % 2) == 1));
		// 하나라도 false라면 >> false (적어도 하나는 거짓이다)
		
		System.out.println();
		
		System.out.println("||연산자");
		System.out.println("true || true : " + (true || true));
		System.out.println("true || false : " + (true || false));
		System.out.println("false || true : " + (false || true));
		System.out.println("false || false : " + (false || false));
		
		System.out.println();
		
		System.out.println("&&연산자");
		System.out.println("true && true : " + (true && true));
		System.out.println("true && false : " + (true && false));
		System.out.println("false && true : " + (false && true));
		System.out.println("false && false : " + (false && false));
		
		System.out.println();
		
		System.out.println("!true : " + !true );
		System.out.println("!false : " + !false );
		
		
		/*
		 증감연산자 : 결과적으로 자기자신을 1 증가 또는 감소
		 ++num, num++, --num, num--
		 num = num + 1
		 */
		int n;
		System.out.println("===========================");
		System.out.println("논리 연산자");
		n = 5;
		n ++;
		System.out.println("5++ : " + n);
		
		n=5;
		++ n;
		System.out.println("++5 : " + n);
		System.out.println();
		
		int a,b,c;
		
		c = 10;
		a = ++c + 10; // 전치는 자기 자신의 값이 우선이 된다 (++이 먼저 적용되고 + 와 =이 적용)
		
		c = 10;
		b = c++ + 10; // 후치는 가장 마지막에 적용된다 (+ 와 = 이 먼저 적용되고 ++이 적용)
		
		System.out.println("a : " + a);	// 
		System.out.println("b : " + b);	// 
		System.out.println("c : " + c);	// 
		System.out.println();

		
		// 증감(++, --) == 논리(!) > 산술(*, /, %) > 산술(+, -) > 비교(<,>,>=, instanceof) > 논리(==, !=) ...
		
		/*
		 비트연산자
		 계산기에 프로그래머용 계산기로 2진수 확인 가능
		 각각의 자리를 참과 거짓을 따져서 결과를 출력해줌
		 */
		
		System.out.println("===========================");
		System.out.println("비트 연산자");
		
		System.out.println("3 & 5 : " + (3 & 5)); 
		System.out.println("011 & 101");
		// 011
		// 101
		//
		// 001 > 1
		
		System.out.println("10 & 5 : " + (10 & 5)); 
		System.out.println("1010 & 101");
		// 1010
		// 0101
		//
		// 0000 >> 0 

		System.out.println("10 | 5 : " + (10 | 5)); 
		System.out.println("1010 | 101");
		// 1010
		// 0101
		//
		// 1111 >> 15
	
	}
	
}































