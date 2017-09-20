package calcpackage;

import java.util.Scanner;

public class Main {
	 public static void main(String args[]) {
		 int oNumSecond=0;
	        Scanner scn = new Scanner(System.in);
	        System.out.print("请输入第一个数:");
	        int oNumFirst = scn.nextInt();
	        System.out.print("请输入操作方式(+,-,*,/):");
	        String opt = scn.next();
	        if(!opt.equals("!"))
	        {
	           	System.out.print("请输入第二个数:");
		        oNumSecond = scn.nextInt();
		        
	        }
	        Optioner optioner = OptionerFactory.createOptioner(opt);
	        optioner.setoNumFirst(oNumFirst);
	        optioner.setoNumSecond(oNumSecond);
	        System.out.println("结果为：" + optioner.getReuslt());
	    }
}
