package calcpackage;

public class Calculation {
    public int a;
     public int b;
     public String oper;
     Calculation()
     {
    	   System.out.println("执行1");
    	    a=3;
    	    b=4;
     }
     Calculation(float vala, float valb)
     {
    	 System.out.println("执行3");
  	   a=(int)vala;
  	   b=(int)valb;
     }
     Calculation(int vala, int valb)
     {
    	   System.out.println("执行2");
    	   a=vala;
    	   b=valb;
     }
     public void getResult()
     {
    	    System.out.println(a+b);
     }
     public void printInput()
     {
    	   System.out.println("a="+a);
    	   System.out.println("b="+b);
     }
}
