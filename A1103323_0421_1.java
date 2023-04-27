import java.util.*;

public class A1103323_0421{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("請輸入電子郵件信箱(以小寫表示)：");
        String mail = input.nextLine();
        if(mail.matches("[a-z 0-9 .]+[@]{1}[a-z .]{2,}") && (mail.contains("..") == false)){
            System.out.println("格式正確");
        } else {
            System.out.println("格式錯誤");
        }
    }
}