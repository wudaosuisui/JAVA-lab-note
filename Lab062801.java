//-----------------------------------------------------------多态
/*运行结果
 * Teacher display!
 * Student display!
 *  */
package HelloWord;

public class Lab{
	public static void main(String[] ages){
		Person p1 = new Teacher();
		Person p2 = new Student2();
		p1.display();
		p2.display();

}}

class Person{
	private String name;
	public void display(){
		System.out.println("Person display!");
	}
}


class  Teacher extends Person{
	public void display(){
		System.out.println("Teacher display!");
	}
}

class Student2 extends Person{
	public void display(){
		System.out.println("Student display!");
	}
	public void displayEx(){
		System.out.println("Extend from  Person!");
	}
}

//-----------------------------------------------------------
/*通过将子类对象引用赋值给超类对象引用变量来实现动态方法调用
 *  */
package HelloWord;

public class Lab{
	public static void main(String[] ages){
		Teacher t1 = new Teacher();
		Person p = new Teacher();//表示定义了一个Person类型的引用，指向新建的Teacher类型的对象，这就称为”向上转型”
		
	}
}

class Person{
	private String name;
	public void display(){
		System.out.println("Person display!");
	}
}

class Teacher extends Person{
	public void display(){
		System.out.println("Teacher display");
	}
	public void displayEx(){
		System.out.println("Extend from Person!");
	}
	
}

//-----------------------------------------------------------
/*equals()
 *  */
package HelloWord;

public class Lab{
	public static void main(String[] ages){

	}
}

class Empoyee{
	public boolean equals(Object otherObi){
		//快速测试是否的同一个对象
		if(this == otherObi)return true;
		//如果显示参数为Null 必须返回 false 
		if(this == null)return false;
		//如果类不匹配，就不可能相等
		if(getClass()!=otherObi.getClass())return false;
		//现在知道otherObj是个非空的Employee对象
		Employee other = (Employee) otherObi;
		//测试所有的字段是否相等
		return name.equals(otherName)
				&&salary == other.salary
				&&hireDay.equals(other.hireDay);
	}
}

//-----------------------------------------------------------接口继承多个接口、实现多个接口
/*接口继承多个接口、实现多个接口
 *  */
package HelloWord;

public class Lab{
	public static void main(String[] ages){

	}
}

interface Comparable{
	int compareTo(Object other,int a);
}

interface Comparable2{
	
}
interface Comparable3{
	
}
//接口继承接口
interface interFaceA extends Comparable,Comparable2,Comparable3{
	
}
//实现多个接口
class Employee implements Comparable,Comparable2{
	public int compareTo(Object other,int a){
		
		return a;
	}
}
//-----------------------------------------------------------接口的定义和实现
/*接口的定义和实现
 *  */
package HelloWord;

public class Lab{
	public static void main(String[] ages){

	}
}

interface Comparable{
	int compareTo(Object other,int a);
}

class Employee implements Comparable{
	public int compareTo(Object other,int a){
		
		return a;
	}
}

//-----------------------------------------------------------构造
/*构造
先进行父类构造
再进行子类构造
 *  */
package HelloWord;

public class Lab{
	public static void main(String[] ages){
		Person p1 = new Person();
		Teacher t1 = new Teacher("teacherLi");

	}
}
class Person{
	public String name;
	private String neme2;
	public Person(){
		System.out.println("Person gouzao");
	}
	public void display(String name){}
}

class Teacher extends Person{
	public Teacher(String name){
		System.out.println(name +"Teacher gouzao");
		//super.Person();
	}
	public void display(int num){
		super.name = "teacher";//只能引用父类中开放的类
	}
} 

//-----------------------------------------------------------引用父类中的属性或方法
/*
super关键字
*/
class Person{
	public String name;
	private String neme2;
	public void display(){}
}
class Teacher extends Person{
	public void display(){
		super.name = "teacher";//只能引用父类中开放的类
		super.name2 = "teacher";//编译报错
		super.display();
	}
} 
//-----------------------------------------------------------抽象类的一些小实验
/*抽象类的一些小实验
 *  */
package HelloWord;

public class Lab{
	public static void main(String[] ages){
		Cat cat1 = new Cat();
		PersiaCat cat2 = new PersiaCat();
		cat1.shout("xiaobai");
		cat2.shout();
	}
}

abstract class Animal{
	protected String color;
	public abstract void shout(String name);//可以有参数  但是在子类里重写时不要忘记参数  
}
class Cat extends Animal{
	public void shout(String name){
		System.out.println(name+color+" miao!miao!miao!~~~");//name可以被引入   也可以引入父类的开放成员 color
	}
}

class PersiaCat extends Cat{
	
	public void shout(){//这里可以不写参数？！？！ 为什么？？？
		System.out.println(color+"Persia+miao!miao!miao!~~~");//这里也可以引入 开放成员 color
	}
}
//-----------------------------------------------------------抽象类
/*抽象类
 * abstract修饰的类称为抽象类，抽象类的特点：
不能实例化对象;
类中可以定义抽象方法（abstract修饰的方法）;
抽象类中可以没有抽象方法。

abstract修饰的方法称为抽象方法，抽象方法只有方法的声明没有方法实现，即没有方法体。包含抽象方法的类本身必须被声明为抽象的。

 *  */
package HelloWord;


abstract class Animal{
	private String color;
	public abstract void shout();//定义为abstract 就不能写方法体了
}
class Cat extends Animal{
	public void shout(){
		System.out.println("miao!miao!miao!~~~");
	}
}
abstract class Cat2 extends Animal{
}
class PersiaCat extends Cat{
	public void shout(){
		System.out.println("Persia+miao!miao!miao!~~~");//波士猫 喵喵喵
	}
}




