import java.util.Scanner;

public class EuclidGCD {
	
	static int gcd(int x, int y) {		//최대공약수
		if (y == 0) {
			return x;
		} else {
			return gcd(y, x % y);
		}
	}
	
	static int lcm(int a, int b) {		//최소공배수
	    return (a * b) / gcd(a, b);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("두 정수의 최대공약수와 최소공배수를 구합니다.");
		
		System.out.print("정수를 입력하세요: ");
		int x = scan.nextInt();
		System.out.print("정수를 입력하세요: ");
		int y = scan.nextInt();
		
		System.out.println("최대공약수는 " + gcd(x,y) + "입니다.");
		System.out.println("최소공배수는 " + lcm(x,y) + "입니다.");
	}
}
