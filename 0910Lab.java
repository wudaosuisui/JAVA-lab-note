

--------------------------------------------------------------------------------------------
package imoocLab;

import java.util.Arrays;

/*结果
Java文件名正确
邮箱格式正确
 * */
public class Lab {
	public static void main(String[] args){
		// Java文件名
				String fileName = "HelloWorld.java"; 
		        // 邮箱
				String email = "laurenyang@imooc.com";
				
				// 判断.java文件名是否正确：合法的文件名应该以.java结尾
		        /*
		        参考步骤：
		        1、获取文件名中最后一次出现"."号的位置
		        2、根据"."号的位置，获取文件的后缀
		        3、判断"."号位置及文件后缀名
		        */
		        //获取文件名中最后一次出现"."号的位置
				int index = fileName.lastIndexOf(".");
		        
		        // 获取文件的后缀
				String prefix = fileName.substring(index);
		        
				// 判断必须包含"."号，且不能出现在首位，同时后缀名为"java"
				if (index >0 && prefix.equals(".java")) {
					System.out.println("Java文件名正确");
				} else {
					System.out.println("Java文件名无效");
				}

		        // 判断邮箱格式是否正确：合法的邮箱名中至少要包含"@", 并且"@"是在"."之前
		         /*
		        参考步骤：
		        1、获取文件名中"@"符号的位置
		        2、获取邮箱中"."号的位置
		        3、判断必须包含"@"符号，且"@"必须在"."之前
		        */
			    // 获取邮箱中"@"符号的位置
				int index2 = email.indexOf('@');
		        
		        // 获取邮箱中"."号的位置
				int index3 = email.indexOf('.');
		        
				// 判断必须包含"@"符号，且"@"必须在"."之前
				if (index2 != -1 && index3 > index2) {
					System.out.println("邮箱格式正确");
				} else {
					System.out.println("邮箱格式无效");
				}
	}

}


--------------------------------------------------------------------------------------------
package imoocLab;

import java.util.Arrays;

/*结果
 * 字符串长度： 8
字符‘编’的位置6
子字符串‘java’的位置：2
子字符串‘imooc’的位置：-1
按空格拆分成数组：[学习java编程]

获取位置【3，7）之间的子串：ava编

 * */
public class Lab {
	public static void main(String[] args){
	//定义一个字符串“学习java编程”	
	String str = "学习 JAVA 编程";
	//打印长度
	System.out.println("字符串长度： " + str.length());
	//查找字符 编 的位置
	char c = '编';
	System.out.println("字符‘编’的位置" + str.indexOf(c));
	//查找子字符串‘JAVA’的位置
	System.out.println("子字符串‘JAVA’的位置：" + str.indexOf("JAVA"));
	//查询子字符串‘imooc’的位置，找不到返回-1
	System.out.println("子字符串‘imooc’的位置：" + str.indexOf("imooc"));
	//按空格把字符串拆分成一个数组，并输出数组元素
	String[] arr = str.split(" ");
	System.out.println("按空格拆分成数组：" + Arrays.toString(arr));
	System.out.println();
	//获取索引位置【3，7）之间的子串
	System.out.println("获取位置【3，7）之间的子串：" + str.substring(3,7));
	
	}

}
