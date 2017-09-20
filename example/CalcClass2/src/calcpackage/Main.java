package calcpackage;

import java.util.Scanner;

public class Main {
	 public static void main(String args[]) {
	        Scanner scn = new Scanner(System.in);
	        System.out.print("请输入第一个数:");
	        int oNumFirst = scn.nextInt();
	        System.out.print("请输入操作方式(+,-,*,/):");
	        String option = scn.next();
	        System.out.print("请输入第二个数:");
	        int oNumSecond = scn.nextInt();
	        Optioner opt= new Optioner(oNumFirst,oNumSecond,option);
	        //Optioner optioner=new Optioner(oNumFirst,oNumSecond,option);
	        System.out.print("结果为："+opt.getReuslt());
	    }
}
