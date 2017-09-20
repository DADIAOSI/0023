import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)
    {
		System.out.println("请输入：");
    	    Scanner reader=new Scanner(System.in);
    	    String a=reader.next();
    	    String b=reader.next();
    	    System.out.println(dataTrans(a)+dataTrans(b));
    }
	
	public static boolean isNumber(String str){  
		boolean re = true;  
		for(int i=0;i<str.length();i++){ 
			if(!Character.isDigit(str.charAt(i))){  
				re = false;  
				break;  
				}  
		}  
		return re;    
		} 
	//科学计数法
	public static String scienceNumberic(String str)
	{
		String value="";
		BigDecimal bd = new BigDecimal(str);
        value = bd.toPlainString();
        return value;
	}
	public static double dataTrans(String str)
	{
		double res;
		switch(isNumberic(str))
		{
		case 0:
			res=(double)Integer.valueOf(str);
			break;
		case 1:
			res=Double.valueOf(str);
			break;
		default:
			res=0.0;
			System.out.println("存在输入错误");
			break;
		}
		return res;
	}
	public static int  isNumberic(String str) {
		int res=0;
		int dotNum=0;
		int otherNum=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='.' && i>0) {
				dotNum++;
				continue;
			}
			else if(!Character.isDigit(str.charAt(i)))
				{
				    return -1;
				}
		}
		switch(dotNum)
		{
		case 0:
			  res=1;
			  break;
		case 1:
			  res=2;
			  break;
		default:
			  res=-1;
		      break;
		}
		return res;
	}
}
