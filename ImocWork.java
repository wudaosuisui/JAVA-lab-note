
//---------------------------------------------------------------------------Car
package Java2EndWork;

public abstract class Car {
	public int cnum;
	public String cname;
	public int cmoney;
	
	//构造
	public Car(){};
	public Car(int cnum,String cname,int cmoney){
		this.cnum = cnum;
		this.cname = cname;
		this.cmoney = cmoney;
	}
	
	//更改
	public void getCnum(int newnum){
		this.cnum = newnum;
	}
	public void getCname(String newname){
		this.cname = newname;
	}
	public void getCmoney(int newmoney){
		this.cmoney = newmoney;
	}
	
	//获取
	public int reCnum(){
		return this.cnum;
	}
//	public void reCname(String a){
//		a = this.cname;
//	}
//	public String reCname(){
//		return this.cname;
//	}
	public void reCname(){
		System.out.print(this.cname);
	}
	public int reCmoney(){
		return this.cmoney;
	}
	
	public abstract int getR();
	
	public abstract int getH();
	//打印
	abstract void sendAll();

}


//客车
class CarZR extends Car{
	private int capacityR;
	//构造
	public CarZR(){};
	public CarZR(int cnum,String cname,int cmoney,int capacityR){
		this.cnum = cnum;
		this.cname = cname;
		this.cmoney = cmoney;
		this.capacityR = capacityR;
	}
	//打印
	public int getR(){
		return capacityR;
	}
	
	public int getH(){
		return 0;
	}
	
	void sendAll(){
		System.out.println(
	this.cnum + ".  " +
	this.cname + " " + 
	this.cmoney + "元/天    " + "载人："+ 
	this.capacityR + "人");
	}
}

//货车
class CarHW extends Car{
	private int capacityH;
	//构造
		public CarHW(){};
		public CarHW(int cnum,String cname,int cmoney,int capacityH){
			this.cnum = cnum;
			this.cname = cname;
			this.cmoney = cmoney;
			this.capacityH = capacityH;
		}
	//打印
		public int getR(){
			return 0;
		}
		
		public int getH(){
			return capacityH;
		}
		
		void sendAll(){
			System.out.println(
		this.cnum + ".  " +
		this.cname + " " + 
		this.cmoney + "元/天    " + "载货："+ 
		this.capacityH + "吨");
		}
}

//皮卡（可载货，可载人）
class CarB extends Car{
	private int capacityR;
	private int capacityH;
	//构造
		public CarB(){};
		public CarB(int cnum,String cname,int cmoney,
				int capacityR,int capacityH){
			this.cnum = cnum;
			this.cname = cname;
			this.cmoney = cmoney;
			this.capacityR = capacityR;
			this.capacityH = capacityH;
		}
	//打印
		public int getR(){
			return capacityR;
		}
		
		public int getH(){
			return capacityH;
		}
		
		void sendAll(){
			System.out.println(
		this.cnum + ".  " +
		this.cname + " " + 
		this.cmoney + "元/天    " + "载人："+ 
		this.capacityR + "人  " + "载货："+ 
		this.capacityH + "吨");
		}
}
//---------------------------------------------------------------------------serwer
package Java2EndWork;
import java.util.Scanner;

public class serwer {
	//

	//打印库内车辆
	Carport cp1 = new Carport();
	int a = cp1.cars.length;
	public static void PrintCars(){
		System.out.println("您可租车的类型及其价格表：");
		System.out.println("序号    汽车名称     租金      容量");
		for(int i = 0;i < Carport.cars.length;i++){
			Carport.cars[i].sendAll();
		}
	}
	//输入要租的汽车数目&输入车号码&计算账单 可载人的车；共载人量；可载货的车；共载货量 总价格
	public static void ZuCar(){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入您要租汽车的数量：");
		int carnum = input.nextInt();
		
		Car cars[] = new Car[carnum+1];
		cars[0] = Carport.nocar;
		for(int i = 1;i<carnum+1;i++){
			System.out.println("请输入第"+i+"辆车的序号：");
			int cnum = input.nextInt();
			cars[i] = Carport.cars[cnum-1];
		}
		
		System.out.println("请输入租车天数：");
		int days = input.nextInt();
//		int days = 1;
	//   System.out.println();	
		int ZRcn[]=new int[carnum+1];
		int ZRr = 0;
		int ZHcn[]=new int[carnum+1];
		int ZHr = 0;
		int money = 0;
		
		for(int i = 1;i<carnum+1 ; i++){
			
			int R = cars[i].getR();
			int H = cars[i].getH();
			if(cars[i].getR()>0){
				ZRcn[i] = i;
				ZRr = ZRr + R;
			}else{
				ZRcn[i] = 0;
			}
			
			if(cars[i].getH()>0){
				ZHcn[i] = i;
				ZHr = ZHr + H;
			}else{
				ZHcn[i] = 0;
			}
			
			money = money +cars[i].reCmoney();
		}
		
		
		System.out.println("您的账单：");	
		System.out.println("****可载人的车有：");
		for(int i = 1;i<carnum+1 ; i++){
			cars[ZRcn[i]].reCname();
		}
		System.out.println("   共载人："+ZRr);
		System.out.println("****可载货的车有：");
		for(int i = 1;i<carnum+1 ; i++){
			cars[ZHcn[i]].reCname();
		}
		System.out.println("   共载货："+ZHr);
		System.out.println("****租车总价格："+money*days);	
		System.out.println("*****************END*****************");
	}
	
}

//---------------------------------------------------------------------------Carport
package Java2EndWork;

public class Carport {
	//库内车量
	public static Car nocar = new CarZR(0,"",0,0);
	
	public static Car cars[] = {
			new CarZR(1,"奥迪A4 ",500,4),
			new CarZR(2,"马自达6 ",400,4),
			new CarB (3,"皮卡雪6 ",450,4,2),
			new CarZR(4,"金龙           ",800,20),
			new CarHW(5,"松花江       ",400,4),
			new CarHW(6,"依维柯       ",1000,20)};

	
}


//---------------------------------------------------------------------------Run
package Java2EndWork;
import  java.util.Scanner;

public class Run {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//打印库内车辆
		serwer.PrintCars();
		serwer.ZuCar();
		
	}

}



