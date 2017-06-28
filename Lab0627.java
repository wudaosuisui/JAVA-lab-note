/*重写：子类对父类中声明（定义）的方法进行重新实现的改造称为方法重写（override）
 * */
package HelloWord;

public class Lab{
	public static void main(String[] ages){
		Person p1 = new Person();
		Teacher t1 = new Teacher();
		p1.display();
		t1.display();
	}
}

class Person{
	private String name;
	public void display(){
		System.out.println("Person display");
	}
}
class Teacher extends Person{
	System.out.println("override");
	System.out.println("Teacher display");
}

/*练习1
 * */
package HelloWord;

public class Lab{
	public static void main(String[] ages){
		Person p1 = new Person();
		p1.display();
		Teacher t1 = new Teacher();
	
	}
}
class Person{
	private String name;
	private String sex;
	private int age;
	
	//构造方法
	public Person(String name){
		this.name = name;
	}
	public Person(){
		System.out.println("father 构造");
	}
	
	public void display(){
		System.out.println("father class!");
		display2();
	}
	private void display2(){
		System.out.println("father 2!");
	}
	
}
class Teacher extends Person{
	private String address;
	private String major;
	private double salary;
	public Teacher(){
		System.out.println("chilen 构造");
	}
	public void displayEx(){
		System.out.println("chilen class!");
	}
}

旧版本
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

