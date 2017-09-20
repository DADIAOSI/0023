
public class Main {
    public static void main(String[] args)
    {
    	    float a=1;
    	    float b=2;
    	    float res=0;
    	    String oper="/";
    	    switch(oper)
    	    {
    	    case "+":
    	    	   res=a+b;
    	    	   break;
    	    case "/":
    	    	   res=(float)a/(float)b;
    	    	   break;
    	    }
    	    System.out.println(res);
    }
}

//程序的问题
//1.如何计算两个小数相加
//2.如何计算两个小数相除
//3.除法还要判断b是否为0
