import java.util.*;

class TimerThread extends Thread{
    int num;
    public TimerThread(int num){
        this.num = num;
    }
    
    public void run(){
        try{
            this.sleep(1000);
        }
        catch(InterruptedException e){
         
        }
    }
}

class Dumpling{
    static int pork = 5000;
    static int beef = 3000;
    static int vegetable = 1000;

    int num, type, amount;

    public Dumpling(int num, int type, int amount){
        this.num = num;
        this.type = type;
        this.amount = amount;
    }

    public void order(){
        if(this.type == 1){
            if(this.amount > pork){
                System.out.println("豬肉水餃不足");
            } else {
                System.out.println("第" + this.num + "位購買了豬肉水餃：" + this.amount + "顆");
                pork = pork - this.amount;
            }
        } else if(this.type == 2){
            if(this.amount > beef){
                System.out.println("牛肉水餃不足");
            } else {
                System.out.println("第" + this.num + "位購買了牛肉水餃：" + this.amount + "顆");
                beef = beef - this.amount;
            }
        } else if(this.type == 3){
            if(this.amount > vegetable){
                System.out.println("蔬菜水餃不足");
            } else {
                System.out.println("第" + this.num + "位購買了蔬菜水餃：" + this.amount + "顆");
                vegetable = vegetable - this.amount;
            }
        }
    }
    
    public int getPorkDumpling(){
        return pork;
    }

    public int getBeefDumpling(){
        return beef;
    }

    public int getVegetableDumpling(){
        return vegetable;
    }
}

public class A1103323_0519_1{
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);
        System.out.printf("請輸入顧客數目：");
        int num = input.nextInt();

        int pork = 0;
        int beef = 0;
        int vegetable = 0;
        
        for(int i = 1;i <= num;i++){
            Random random = new Random();
            for(int type = 1;type <= 3;type++){
                int amount =(int)(Math.random()*50);
                if(amount < 11){
                    amount = 0;
                }

                Dumpling dumpling = new Dumpling(i, type, amount);
                dumpling.order();

                pork = dumpling.getPorkDumpling();
                beef = dumpling.getBeefDumpling();
                vegetable = dumpling.getVegetableDumpling();
            }
            System.out.println("-------剩餘總計-------");
            if((pork <= 0) && (beef <= 0) && (vegetable <= 0)){
                System.out.println("所有水餃都售出完畢");
                System.exit(0);
            } else {
                System.out.println("豬肉水餃剩餘" + pork + "份");
                System.out.println("牛肉水餃剩餘" + beef + "份");
                System.out.println("蔬菜水餃剩餘"+ vegetable + "份");
                System.out.println("----------------------");
            }

            TimerThread time = new TimerThread(i);
            time.run();
        }
    }
}
