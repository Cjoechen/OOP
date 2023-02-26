import java.util.*;

public class A1103323_0224_1{
	public static void main(String[] argv){
		System.out.print("請輸入任意整數： ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();		
		if(n % 2 != 0){
			System.out.println(n + "為奇數。");
		} else {
			System.out.println(n + "為偶數。");
		}
	}		
}