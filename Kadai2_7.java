import java.util.Scanner;

public class Kadai2_7
{
	public static void main(String[] args) {
		System.out.println("0～50までの整数を選んで入力してください。");
		Scanner scan = new Scanner(System.in);
		int intSeisu = scan.nextInt();
		if(intSeisu > 50){
			System.out.println("入力値が0～50ではなかったので終了します。");
			System.exit(0);
		}
		for(int i = 0;i < intSeisu; i++){
			System.out.println(fibo(i));
		}
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
