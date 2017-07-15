
//-----------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------方法内部类

//-----------------------------------------------------------------------------------------静态内部类
//执行结果
//访问外部类中的score：84
//访问内部类中的score：91
//外部类
public class HelloWorld {
    
    // 外部类中的静态变量score
    private static int score = 84;
    
    // 创建静态内部类
	public   static class SInner {
        // 内部类中的变量score
        int score = 91;
        
		public void show() {
			System.out.println("访问外部类中的score：" + HelloWorld.score );
			System.out.println("访问内部类中的score：" + score);
		}
	}

	// 测试静态内部类
	public static void main(String[] args) {
		// 直接创建内部类的对象
        SInner si = new SInner();
        
        // 调用show方法
		si.show();
	}
}
//-----------------------------------------------------------------------------------------成员内部类
/*成员内部类
 * 运行结果
 * 访问外部类中的a：99
 * 访问内部类中的b：2
 *  */
package HelloWord;

public class Lab{
	private int a = 99;//外部类的私有属性
	//内部类
	public class Inner{
		int b = 2;//内部类成员属性
		public void test(){
			System.out.println("访问外部类中的a：" + a);
			System.out.println("访问内部类中的b：" + b);
		}
	}
	
	public static void main(String[] args){
		Lab lab = new Lab();
		Inner i = lab.new Inner();
		i.test();
	}
}
/*成员内部类
 * 运行结果
外部类中的name：imooc
内部类中的name：Neibu imooc
外部类中的age：20

部分更改后
private String name ;
private int age ;
外部类中的name：null
内部类中的name：Neibu imooc
外部类中的age：0
 *  */
package HelloWord;

public class Lab{
	//外部类的私有属性name
	private String name ="imooc";
	//外部类的成员属性
	private int age = 20;
	
	//成员内部类
	public class Inner{
		private String name = "Neibu imooc";//内部类成员同名属性
		public void show(){
			System.out.println("外部类中的name：" + Lab.this.name );
			System.out.println("内部类中的name：" +     name);
			System.out.println("外部类中的age：" + age);
		}
	}
	
	public static void main(String[] args){
		Lab lab = new Lab();
		Inner i = lab.new Inner();
		i.show();
	}
}
//-----------------------------------------------------------------------------------------内部类
/*内部类
 * 运行结果
 * wclcome to imooc!
 *  */
package HelloWord;

public class Lab{
	public class Inner{
		//内部类
		public void show(){
			System.out.println("wclcome to imooc!");
		}
	}
	
	public static void main(String[] args){
		Lab lab = new Lab();
		Inner i = lab.new Inner();
		i.show();
	}
}
