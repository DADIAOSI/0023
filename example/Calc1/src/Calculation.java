
public class Calculation {
	public String a;
	public String b;
	public String oper;
    public String getResult()
    {
    	   String res="";
//    	   switch(oper)
//   	    {
//   	    case "+":
//   	    	   res=String.valueOf(a+b);
//   	    	   break;
//   	    case "/":
//   	    	   res=String.valueOf((float)a/(float)b);
//   	    	   break;
//   	    }
//   	    System.out.println(res);
    	   return res;
    }
    
    private int numbericType(String str)
    {
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
    
    
