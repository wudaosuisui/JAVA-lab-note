

/*异常处理
 * 运行结果
 * the previous statement of try block
try block
finally block，系统释放资源
return value of test():  2
  
the previous statement of try block
发生异常 请处理
finally block，系统释放资源
return value of test():0

 *  */
package HelloWord;

public class Lab{
	public static void main(String[] args){
		System.out.println("return value of test():  "+test(10,5));
		System.out.println("  ");
		System.out.println("return value of test():"+test(10,0));
	}
	public static int test(int a,int b){
		int i = 0;
		System.out.println("the previous statement of try block");
		try{
			i = a/b;
			System.out.println("try block");
		}catch(Exception e){
			System.out.println("发生异常 请处理");
		}finally{
			System.out.println("finally block，系统释放资源");
		}
		return i;
	}
}


/*枚举
 * 还是不太会用啊……
 *  */
package HelloWord;

public class Lab{
	public static void main(String[] args){
		Lab lab = new Lab();
	}
	public void printWeekDay(WeekDay weekDay){
	       switch(weekDay){
	case MONDAY:
		     System.out.println("Today is Monday!");
		     break;
		case TUESDAY: 
		     System.out.println("Today is Tuesday!");
		     break;
		 
		default:     
			throw new AssertionError("Unexpected value: " + weekDay);
	}
	}

}

enum WeekDay{
	MONDAY, TUESDAY, WENSDAY, THURSDAY, FRIDAY; 
	//后面的分号 可加可不加
}
/*静态内部类
 * 静态内部类定义在类中，在任何方法之外，用static定义
 *特点：
 *1.静态内部类能直接访问外部类的静态成员，不能直接访问外部类的实例成员。
 *2.静态内部类里面可以定义静态成员，其他内部类不可以
 *  */
package HelloWord;

public class Lab{
	public static void main(String[] args){
		OuterClass.Inner in = new OuterClass.Inner();//静态内部类的对象可直接生成
		}
	}



class OuterClass{
	public void display(){}
	protected static class Inner{}//静态成员类
}

/*匿名内部类
 * 特点：
 * 1.匿名类没有类名，它必须继承一个类或是实现一个接口。不能有显示的extends和implement子句
 * 2.匿名类不能有构造函数，因为它没有类名。可以通过new<父类名>的方法创建对象，匿名类的创建和定义同时进行。  
 * 3. 匿名类只能一次性的创建其对象。
 * 4.匿名类可以在方法体中，也可以在参数列表中
 * 注意：
 * 1.匿名内部类一定是在new的后面其隐含实现一个接口或一个类，没有类名
 * 2.匿名内部类不能是抽象类
 * 3.匿名内部类必须实现它的抽象父类或者接口里的所有抽象方法
 * 4.匿名内部类一定是在new的后面其隐含实现一个接口或一个类，没有类名
 * 5.匿名内部类一定是在new的后面其隐含实现一个接口或一个类，没有类名
 * 6.匿名内部类必须实现它的抽象父类或者接口里的所有抽象方法
 *  */
package HelloWord;

public class Lab{
	public static void main(String[] args){
		OuterClass out = new OuterClass();
		out.print();//使用
		}
	}

interface anonymous{//定义一个接口
	void display();
}
class OuterClass{
	public void print(){
		anonymous anon = new anonymous(){//定义匿名类
			public void display(){
				System.out.print("implement anonymous");
			}
		};//这里的分号不要忘记！！
		anon.display();
	}
}

/*局部内部类
 * 在方法中定义的内部类称为局部内部类，类似局部变量
 * 局部内部类不能加修饰符public、protected和private，其范围为定义它的代码块
 * 特点：
 * 1.可以访问外包方法之外的外部类之内的所有成员。还可以访问所在外包方法中的final类型的参数。
 * 2.局部内部类不能声明为接口
 * 3.要想使用局部内部类时，需要生成外部类对象，通过外部类对象调用外包方法，在方法中才能调用局部内部类。
 *  */
package HelloWord;

public class Lab{
	public static void main(String[] args){
		OuterClass out = new OuterClass();
		//out.display();//使用
		}
	}

class OuterClass{
	//称为外包方法
	public void display(final boolean isPrint){
		//定义局部内部类
		class InnerClass{
			public void displayInner(){
				if(isPrint){
				System.out.println("display inner class");
				}
			}
		}
		InnerClass in = new InnerClass();
		in.displayInner();
	}
}

/*成员内部类
 * 作为外部类的一个成员存在，与外部类的属性、方法并列。内部类和外部类的实例变量可以共存。
 * 定义
 * 创建1-2
 * 访问1-3
 * 疑问：内部类 调用了外部类的属性或方法能做什么？  都不知道是外部类的哪个对象！实际意义在哪里？——————有点懂了
 */
package HelloWord;

public class Lab{
	public static void main(String[] args){
		OuterClass outer = new OuterClass();

		//创建内部类2：
		OuterClass.InnerClass inner = outer.new InnerClass();
		//或
		OuterClass.InnerClass inner2 = new OuterClass().new InnerClass();
		inner.name = "Stringname";//访问3：在外部类的外部访问内部类，内部类的对象.对象名
		inner.getOutname("StrignnameOUter");

		}
	}

class OuterClass{
	private String oname;
	OuterClass(){
		System.out.println("Outer Class");
	}
	InnerClass n = new InnerClass();//创建内部类1：在外部类内部可以直接使用inner s = new inner();(因为外部类知道inner的哪个类，所以可以生成对象)

	class InnerClass{//定义内部类
		public String name;
		InnerClass(){
			System.out.println("Inner class");
		}
		public void gatName(String name){
			this.name = name;  //访问1：内部类中内部类变量：this.属性
		}
		public void getOutname(String name){
			OuterClass.this.oname = name;//访问2：内部类作为外部类的成员，可以访问外部类的私有成员或属性。访问方式：外部类名.this.属性
		}
	}
}


/*包装器
 *  */
package HelloWord;

public class Lab{
	public static void main(String[] args){
		//创建包装器类型对象的两种方式
		Integer y =new Integer(567);//构造：new
		Double d = Double.valueOf(3.14);//调用包装器类型的valueOf方法

		int x = y.intValue();//intValue() 将包装器类型对象转换为基本数据类型
		x++;
		y = new Integer(x);
		y++;
		
		}
	}
