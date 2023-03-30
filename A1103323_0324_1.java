import java.util.*;

class Animal{
	String name;
	double height;
	int weight;
	int speed;

	void show(){
		System.out.println(this.name + "\t" + this.height + "\t" + this.weight + "\t" + this.speed);
	}
	double distance(double x){
		return x*this.speed;
	}
	double distance(double x, double y){
		return x*y*this.speed;
	}
}

public class A1103323_0324_1{
	public static void main(String[] args){
		Animal[] animals = new Animal[4];
		for(int i = 0;i < animals.length;i++){
			animals[i] = new Animal();
		}
		animals[0].name = "雪寶";
		animals[0].height = 1.1;
		animals[0].weight = 52;
		animals[0].speed = 100;

		animals[1].name = "驢子";
		animals[1].height = 1.5;
		animals[1].weight = 99;
		animals[1].speed = 200;

		animals[2].name = "安那";
		animals[2].height = 1.7;
		animals[2].weight = 48;
		animals[2].speed = 120;

		animals[3].name = "愛紗";
		animals[3].height = 1.7;
		animals[3].weight = 50;
		animals[3].speed = 120;

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
			System.out.println(animals[i].name + "的奔跑距離= " + distance);
		}
	}
}