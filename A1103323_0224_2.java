import java.util.*;

public class A1103323_0224_2{
	public static void main(String[] argv){
		System.out.print("請輸入攝氏溫度： ");
		Scanner input = new Scanner(System.in);
		float c = input.nextFloat();
		float f = (c*9)/5 + 32;
		System.out.println("換算成華氏溫度： " + f);		
	}		
}