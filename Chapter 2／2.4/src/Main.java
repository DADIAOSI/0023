import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
    	   SearchPrime s=new SearchPrime();
    	   ArrayList res=new ArrayList();
    	   res=s.searchResult();
    	   int size=res.size();  
           int[] array=new int[size];  
           for(int i=0;i<res.size();i++){  
               array[i]=(int)res.get(i);  
           }  
           for(int i=0;i<array.length;i++){  
               System.out.println(array[i]);  
           } 
    }
}

