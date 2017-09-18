import java.util.ArrayList;

public class SearchPrime {
    int beginNumber=3;
    int endNumber=100;
    public ArrayList searchResult()
    {
    	   int i=0;
    	   int j=0;
    	   ArrayList res= new ArrayList();
    	   
    	   for(i=beginNumber;i<endNumber;i++)
    	   {
    		   for(j=2;j<=i-1;j++)
    		   {
    			   if(i % j==0 ) 
    			   {
    				   break;
    			   }
    		   }
    		   if(j>i-1)
    		   {
    			   System.out.println(i);
    			   res.add(i);
    		   }
    	   }
    	   return res;
    }
}
