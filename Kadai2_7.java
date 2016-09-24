import java.util.Scanner;

public class Kadai2_7
{
	public static void main(String[] args) {
		System.out.println("整数を入力してください。");
		Scanner scan = new Scanner(System.in);
		int intSeisu = scan.nextInt();
		System.out.println(fibo(intSeisu));
	}

	public static long fibo(int n) {
		if(n == 0) {
			return 0;
		} else if(n == 1) {
			return 1;
		} else {
			return fibo(n - 1) + fibo(n - 2);
		}
	}
}
