import java.io.*;

public class A1103323_0526{
    public static void main(String[] args) throws Exception{
        System.out.printf("請輸入要建立的檔名：");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "Big5"));
        String filename = br.readLine();

        PrintWriter pw = new PrintWriter(new FileWriter(filename));

        String str = new String();
        do {
            System.out.print("請輸入學生姓名：");
            String name = br.readLine();
            pw.printf("姓名：" + name + "\n");
            System.out.print("請輸入英文分數：");
            str = br.readLine();
            pw.printf("\t英文分數：" + str + "\n");
            System.out.print("請輸入數學分數：");
            str = br.readLine();
            pw.printf("\t數學分數：" + str + "\n");
            System.out.print("請輸入JAVA分數：");
            str = br.readLine();
            pw.printf("\tJAVA分數：" + str + "\n");
            pw.printf("-----------------------");

            System.out.print("是否繼續輸入(Y/N)：");
            str = br.readLine();
        } while(str.equalsIgnoreCase("Y"));

        pw.flush();
        pw.close();
    }
}