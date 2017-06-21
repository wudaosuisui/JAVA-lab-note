//JAVA 第一季 end


/*
要求：

1、 考试成绩已保存在数组 scores 中，数组元素依次为 89 , -23 , 64 , 91 , 119 , 52 , 73

2、 要求通过自定义方法来实现成绩排名并输出操作，将成绩数组作为参数传入

3、 要求判断成绩的有效性（ 0—100 ），如果成绩无效，则忽略此成绩
*/
package HelloWord;

import  java.util.Arrays; 

public class Labe0621 {
	public static void main(String[] ages){
       int[] scores = {89 , -23 , 64 , 91 , 119 , 52 , 73};
       
       Labe0621  lab = new Labe0621();
       lab.three(scores);
	}
	//定义方法完成成绩排序并输出前三名的功能
	public void three(int arr[]){
		for(int i = 0 ; i<arr.length;i++){
			if(arr[i]>100||arr[i]<0)
				arr[i]=0;
		}
		 Arrays.sort(arr);
//		 for(int i = 0 ; i<arr.length;i++){
//			 System.out.println(i+"  "+arr[i]);
//		 }
		for(int i = 0;i<3;i++){
			System.out.println("第"+(i+1)+"名同学，成绩为："+arr[arr.length-i-1]);
		}
	}
}

/*
任务
一、 定义一个带参带返回值的方法，实现输出随机数数组

提示：
 1、 定义一个带参带返回值的方法，通过参数传入数组的长度，返回值为赋值后的数组
 2、 创建指定长度的整型数组
 3、 使用 for 循环遍历数组，通过 Math.random( ) 生成随机并给数组成员赋值
 4、 使用 return 返回赋值后的数组
二、 完成 main 方法

提示：
 1、 调用自定义方法，保存方法执行后返回的数组
 2、 使用 Arrays.toString( ) 将数组转换为字符串并输出，注意导入 java.util.Arrays;
*/
package HelloWord;

import  java.util.Arrays; 

public class Labe0621 {
	public static void main(String[] ages){
		Labe0621 lab = new Labe0621();
		int [] arr = lab.getArray(5);
		System.out.println(Arrays.toString(arr));
	}
	/*
	 * 功能：创建指定长度的int型数组，并生成100以内随机数为数组中的每个元素赋值
	 * 定义一个带参带返回值的方法，通过参数传入数组的长度，返回赋值后的数组
	 */
	public int[] getArray(int length){
		//定义指定长度的整形数组
		int[] arr = new int[length];
		
		//循环遍历赋值
		for(int i : arr){
			// 产生一个100以内的随机数，并赋值给数组的每个成员
			i = (int)(Math.random() * 100) ;
		}
		return arr; // 返回赋值后的数组
	}
}

/*任务
在编辑器中对 print 方法进行重载，并通过传入不同的参数调用匹配的重载方法。
*/
package HelloWord;

import  java.util.Arrays; 

public class Labe0621 {
	public static void main(String[] ages){
		Labe0621 lab = new Labe0621();
		lab.print();
		lab.print("name");
		lab.print(123);
	}
	public void print(){
		System.out.println("无参print方法");
	}
	public void print(String name){
		System.out.println("带有一个字符串参数的print方法，参数："+ name);
	}
	public void print(int a){
		System.out.println("带有一个int参数的print 方法，参数："+a);
	}
}

/*任务
 * 实现功能：将考试成绩排序并输出，返回成绩的个数
实现思路：
1、 定义一个包含整型数组参数的方法，用来传入成绩数组
2、 在方法体中使用 Arrays.sort( ) 方法对成绩数组进行排序
然后使用 Arrays.toString( ) 方法将数组转换为字符串并输出，
最后使用 return 返回数组中元素的个数。
3、 调用方法时需要先创建对象，然后再调用.调用时为其传入成绩数组，
并获取方法的返回值，保存在变量中，最后输出成绩的个数。
*/
package HelloWord;

import  java.util.Arrays; 

public class Labe0621 {
	public static void main(String[] ages){
		Labe0621 lab = new Labe0621();
		int[] arr = {79,52,98,81};
		//调用方法，传入成绩数组，并获取成绩的个数
		lab.sort(arr);
	}
	/*
	 * 功能：将考试成绩排序并输出，返回成绩的个数
	 * 定义一个包含整型数组参数的方法，传入成绩数组
	 * 使用Arrays类对成绩数组进行排序并输出
	 * 方法执行后返回数组中元素的个数
	 */
	public int sort(int[] scores){
		Arrays.sort(scores);
		System.out.println(Arrays.toString(scores));
		
		//返回数组中元素个数
		int c = scores.length;
		return c;
	}
}
