
//----------------------------------------------------练习
/*练习
 * 运行结果
 * 通过静态初始化块初始化age
通过初始化块初始化sex
通过构造方法初始化name
姓名：tom，性别：男，年龄：20
 * */
package HelloWord;

public class Lab{

	String name; // 声明变量name
	String sex; // 声明变量sex
	static int age;// 声明静态变量age
	
	// 构造方法
	public  Lab() { 
		System.out.println("通过构造方法初始化name");
		name = "tom";
	}
	
	// 初始化块
	{ 
		System.out.println("通过初始化块初始化sex");
		sex = "男";
	}
	
	// 静态初始化块
	static  { 
		System.out.println("通过静态初始化块初始化age");
		age = 20;
	}
	
	public void show() {
		System.out.println("姓名：" + name + "，性别：" + sex + "，年龄：" + age);
	}

	public static void main(String[] ages){
		//创建对象
		Lab lab = new Lab();
		lab.show();
		//调用对象的show方法
		
	}
}

//----------------------------------------------------初始化块 静态初始化块
/*
 * 在类的声明中，可以包含多个初始化块，
 * 当创建类的实例时，就会依次执行这些代码块。
 * 如果使用 static 修饰初始化块，就称为静态初始化块。
 *注意：静态初始化块只在类加载时执行，且只会执行一次，
 *同时静态初始化块只能给静态变量赋值，不能初始化普通的成员变量。
 *以下代码的运行结果：
 *通过静态初始化块为静态变量num3赋值
通过初始化块 为num2赋值
通过构造方法为变量num1赋值
num1: 91
num2: 74
num3: 83
通过初始化块 为num2赋值
通过构造方法为变量num1赋值

 *通过输出结果，我们可以看到，
 *最先执行——静态初始化块
 *其次执行——普通初始化块
 *最后执行——构造方法
 *由于静态初始化块只在类加载时执行一次，
 *所以当再次创建对象 hello2 时并未执行静态初始化块。
 * */
package HelloWord;

public class Lab {
	int num1;
	int num2;
	static int num3;
	public Lab(){//构造方法
		num1 = 91;
		System.out.println("通过构造方法为变量num1赋值");
	}
	{//初始化块
		num2 = 74;
		System.out.println("通过初始化块 为num2赋值");
	}
	static {//静态初始化块
		num3 = 83;
		System.out.println("通过静态初始化块为静态变量num3赋值");
	}
	public static void main(String[] ages){
		Lab lab = new Lab();
		System.out.println("num1: "+lab.num1);
		System.out.println("num2: "+ lab.num2);
		System.out.println("num3: "+lab.num3);
		Lab lab2 = new Lab();
		
	}
}
