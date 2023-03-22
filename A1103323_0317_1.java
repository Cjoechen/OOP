import java.util.*;

public class A1103323_0317_1{
    public static void main(String[] argv){
        System.out.print("n= ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.print("m= ");
        int m = input.nextInt();

        int[][] array = new int[n][m];

        for(int i = 0;i < array.length;i++){
            for(int j = 0;j < array[i].length;j++){
                array[i][j] = (i+1)*(j+1);
            }
        }
        
        for(int[] output : array){
            for(int b : output){
                System.out.print(b + "\t");
            }
            System.out.print("\n");
        }
    }
}