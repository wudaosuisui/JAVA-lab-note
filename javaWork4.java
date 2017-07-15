/*4 继承 
一、按照如下描述定义类，实现动物园内饲养员对动物的喂养活动：猫吃鱼、狗吃肉、大象吃香蕉

1.动物类：Animal

属性：名字(name)

方法：构造方法、eat方法(参数为： 食物类型的变量)

2.猫类 继承自 动物类：Cat

属性：学生自己定义

方法：构造方法、其他方法自己定义

3.狗类 继承自 动物类：Dog

属性：学生自己定义

方法：构造方法、其他方法自己定义

4.大象类 继承自 动物类：Elephant

属性：学生自己定义

方法：构造方法、其他方法自己定义

5.食物类:Food

属性：名字(name)

方法：构造方法

6.饲养员Person

属性：学生自己定义

方法：喂养feed方法(参数为 ：动物类型 变量  食物类型 变量)

输出类似如下效果：
猫吃鱼
狗吃肉
大象吃香蕉
 *  */
package HelloWord;

public class Lab{
	public static void main(String[] args){
		Person p = new Person();
		
		Animal a1 = new Cat("猫");
		Animal a2=new Dog("狗");
		Animal a3=new Elephant("大象");
		
		Food f1=new Food("鱼");
		Food f2=new Food("肉");
		Food f3=new Food("香蕉");
		
		p.feed(a1,f1);
		p.feed(a2,f2);
		p.feed(a3,f3);

	}
}

//动物类
class Animal{
	private String name;
	public Animal(String name){
		this.name = name;
	}
	void eat(Food f){
		System.out.println(name + "吃" + f.getName());
	}	
}

class Cat extends Animal{
	public Cat(String name){
		super(name);
	}
}

class Dog extends Animal{
	public Dog(String name){
		super(name);
	}
}

class Elephant extends Animal{
	public Elephant (String name){
		super(name);
	}
}

class Person{
	void feed(Animal a,Food f){
		a.eat(f);
	}
}

class Food{
	private String name;
	public String getName(){
		return name;
	}
	public void setName(String naem){
		this.name = name;
	}
	public Food(String name){
		this.name = name;
	}
}
