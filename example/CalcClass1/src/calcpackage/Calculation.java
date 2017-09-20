package calcpackage;

public class Calculation {
     private double a;
     private double b;
     private String oper;
     Calculation()
     {
    	    a=0.0;
    	    b=0.0;
     }
     
     public void setA(double s){
    	     this.a = s;
    	 }
     
    	 public double getA(){
    	     return this.a;
    	 }
    	 
    	 public void setB(double s){
    	     this.b = s;
    	 }
     
    	 public double getB(){
    	     return this.b;
    	 }
    	 
     public void printInput()
     {
    	   System.out.println("a="+a);
    	   System.out.println("b="+b);
     }
}
