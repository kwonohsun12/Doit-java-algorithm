package chap01;

import java.util.Scanner;

 class Max3 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("세 정수의 최댓값을 구합니다.");
		System.out.println("a의 값 : "); int a = stdIn.nextInt();
		System.out.println("b의 값 : "); int b = stdIn.nextInt();
		System.out.println("c의 값 : "); int c = stdIn.nextInt();
		
		int max = a;
		if (b > max) max = b;
		if (c > max) max = c;
		
		System.out.println("최댓값은" + max + "입니다.");
	}
}

 /*
  * 세 문장이 나란히 있다면 이 문장은 순서대로 실행됩니다.
  * 이렇게 여러 문장(프로세스)이 순차적으로 실행되는 구조를 순차적 구조라고 합니다.
  */
 