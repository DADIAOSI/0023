//展示输入输出的基本操作
//扩展输入小数如何处理
package demo2;

import java.util.Scanner;

public class Main {
     public static void main(String[] args)
     {
    	 Scanner reader= new Scanner(System.in);
    	 System.out.println("Enter x:");
    	 float a=reader.nextFloat();
    	 System.out.println("Enter y:");
    	 float b=reader.nextInt();
    	 System.out.println(a+b);
     }
}
