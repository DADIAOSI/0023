package product;

import java.util.ArrayList;

public class ProductList {
     public static ArrayList<ProductInfo> mProductList;
     ProductList()
     {
    	     mProductList=new ArrayList<ProductInfo>();
     }
     public void display()
     { 
  	   int size=mProductList.size();  
  	    ProductInfo[] array=new ProductInfo[size];  
         for(int i=0;i<mProductList.size();i++){  
             array[i]=(ProductInfo)mProductList.get(i);  
         }  
         for(int i=0;i<array.length;i++){  
             System.out.println(array[i].name);  
         } 
     }
    
}
