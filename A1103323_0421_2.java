import java.util.*;

public class A1103323_0421_2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("請輸入日期(以/分隔)：");
        String day = input.nextLine();
        if(day.matches("[0-1]{1}[0-9]{1}[/]{1}[0-3]{1}[0-9]{1}[/]{1}[0-9]{4}")){
            System.out.println("年月日：" + day.substring(6,10) + "年" + day.substring(0,2) + "月" + day.substring(3,5) + "日");
        } else if(day.matches("[0-9]{4}[/]{1}[0-1]{1}[0-9]{1}[/]{1}[0-3]{1}[0-9]{1}")){
            System.out.println("年月日：" + day.substring(0,4) + "年" + day.substring(5,7) + "月" + day.substring(8,10) + "日");
        } else {
            System.out.println("格式錯誤");
        }
    }
}
