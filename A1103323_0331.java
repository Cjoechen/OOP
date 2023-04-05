import java.util.*;

class Animal{
    String name;
    double height;
    int weight;
	int speed;
    Animal(String name, double height, int weight, int speed){
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
    }
    void show(){
        System.out.printf(this.name + "\t" + this.height + "\t" + this.weight + "\t" + this.speed);
    }
    double distance(double x, double y){
		return x*y*this.speed;
	}
    double distance(double x){
		return x*this.speed;
	}
    public static void showinfo(){
        System.out.println("歡迎進入冰雪奇緣系統");
    }
}

class Human extends Animal{
    String gender;
    Human(String name, double height, int weight, String gender, int speed){
        super(name, height, weight, speed);
        this.gender = gender;
    }
    void show(){
        super.show();
        System.out.printf("\t" + this.gender);
    }
}

class Snow extends Human{
    String iceSkill;
    Snow(String name, double height, int weight, String gender, String iceSkill, int speed){
        super(name, height, weight, gender, speed);
        this.iceSkill = iceSkill;
    }
    void show(){
        super.show();
        System.out.printf("\t" + this.iceSkill);
    }
    static double iceDistance(double z){
        return z*2;
    }
}

public class A1103323_0331{
    public static void main(String[] args){
        Animal.showinfo();
        Animal[] animals = new Animal[6];
		animals[0] = new Animal("雪寶", 1.1, 52, 100);
        animals[1] = new Animal("驢子", 1.5, 99, 200);
        animals[2] = new Human("阿克", 1.9, 80, "男", 150);
        animals[3] = new Human("漢斯", 1.8, 78, "男", 130);
        animals[4] = new Human("安那", 1.7, 48, "女", 120);
        animals[5] = new Snow("愛沙", 1.7, 50, "女", "YES", 120);

        System.out.println("name\theight\tweight\tspeed\tgender\tskill");
        for(int i = 0;i < animals.length;i++){
			animals[i].show();
            System.out.println();
		}
        
        Scanner input = new Scanner(System.in);
		for(int i = 0;i < animals.length;i++){
			System.out.print("請輸入" + animals[i].name + "時間 x= ");
			double x = input.nextDouble();
			System.out.print("請輸入" + animals[i].name + "加速度 y= ");
			double y = input.nextDouble();
			double distance;
		    if(y == 0){
				distance = animals[i].distance(x);
			} else {
				distance = animals[i].distance(x, y);
			}
            if(i == 5){
                distance = Snow.iceDistance(distance);
            }
            System.out.println(animals[i].name + "的奔跑距離= " + distance);
		}
    }
}