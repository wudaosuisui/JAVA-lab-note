
//---------------------------------------------------------------------------
/*在编辑器中分别定义了两个静态变量 score1 和 score2 ，
 * 用于保存成绩信息。
 * 定义了一个静态方法 sum ，用于计算成绩总分，
 * 在 main 方法中通过调用静态方法输出成绩总分
 * */
package HelloWord;

public class Lab0622 {

    // 定义静态变量score1
    static int score1 = 86;
    // 定义静态变量score2
	static   int score2 = 92; 

    // 定义静态方法sum，计算成绩总分，并返回总分
	public static int sum() { 
      int sum = score1 + score2 ;
      return sum;

	}

	public static void main(String[] args) {
        
        // 调用静态方法sum并接收返回值
		int allScore = Lab0622.sum();
        
		System.out.println("总分：" + allScore);
	}
}

//---------------------------------------------------------------------------静态方法 建立、调用、调用变量的限制
package HelloWord;

public class Lab0622 {
	//static 建立静态变量
	public String name = "name";
	static String hobby = "imooc";
	//建立静态方法
	public static void print(){//静态方法调用变量的限制 如下
//		System.out.println("I love miooc!");
//		System.out.println(name);//不能直接调用 非静态 变量
//		System.out.println(hobby);//可以直接调用 静态 变量
		
		//! 静态方法中不能直接调用非静态方法，需要通过对象来访问非静态方法
		Lab0622 lab = new Lab0622();
		
		lab.show();
		}
	public void show(){//普通成员方法可以直接访问静态和非静态变量
		System.out.println("I love miooc!");
		System.out.println(name);
		System.out.println(hobby);
	}
	public static void main(String[] ages){
		//类调用静态方法
		Lab0622.print();
		
		Lab0622 lab = new Lab0622();
		//对象调用静态方法
		lab.print();
	}
}

//---------------------------------------------------------------------------静态变量 定义、访问、修改
package HelloWord;

public class Lab0622 {
	//static 建立静态变量
	static String hobby = "imooc";
	public static void main(String[] ages){
		//通过类名直接访问
		System.out.println(Lab0622.hobby);
		//创建类的对象
		Lab0622 lab = new Lab0622();
		//使用对象名访问访问静态变量
		System.out.println(lab.hobby);
		//修改变量的值
		lab.hobby = "我爱慕课网！";
		//访问修改过的静态变量
		System.out.println(lab.hobby);
	}
}


//---------------------------------------------------------------------------检测手机类
package HelloWord;

public class IntiailTelphone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telphone phone = new Telphone();
		
		Telphone phone2 = new Telphone(2.0f,3.5f,7.2f);
		
//		Telphone phone = new Telphone();
//		phone.sendMessage();
//		//给对象赋值
//		phone.screen = 5.0f;
//		phone.cpu = 1.4f;
//		phone.mem = 2.0f;
//		//调用对象的方法
//		phone.call();
//		
//		phone.sendMessage();
	}

}

//---------------------------------------------------------------------------手机类

package HelloWord;
//1.定义一个类
public class Telphone {
	//2.属性（成员变量）有什么
	float screen;
	float cpu;
	float mem;
	int var = 30;
	//构造方法
	public Telphone(){
		System.out.println("无参的构造方法！");
	}
	public Telphone(float newScreen,float newCpu,float newMem ){
		screen = newScreen;
		cpu = newCpu;
		mem = newMem;
		System.out.println("这个一个有参的构造函数！");
	}
	
	//3.方法 
	public void call(){
		int var = 40;
		System.out.println("var:"+var);
//		int localVar = 10;
//		System.out.println("localVar:"+localVar);
		System.out.println("Telphone有电话的功能！");
	}
	public void sendMessage(){
		int localVar = 20;
		System.out.println("screen: "+screen+
				" cpu: "+cpu+" mem: "+mem+" Telphone有发短信的功能！");
	}
}
