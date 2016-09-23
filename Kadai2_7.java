import java.util.Scanner;

public class Kadai2_7
{
    public static void main(String[] args) throws Exception{
		System.out.println("整数を入力してください。");
        Scanner scan = new Scanner(System.in);
        int seisu = scan.nextInt();
        int[] seisuHairetu = new int [seisu];
        for(int i = 0; i < seisu; i++){
            if(i == 0){
            	seisuHairetu[i] = 0;
            }
            else if(i == 1){
            	seisuHairetu[i] = 1;
            }
            else{
            	seisuHairetu[i] = seisuHairetu[i-1] + seisuHairetu[i-2];
            }
            System.out.println(seisuHairetu[i]);
        }
    }
}
