package org.vishwajeet;
import java.util.*;

public class FindMaximumvalue {

	public static void main(String[] args) {
       ArrayList a=new ArrayList();
       a.add(100);
       a.add(200);
       a.add(300);
       a.add(400);
       a.add(500);
       a.add(600);
       a.add(700);
       a.add(300);
       a.add(30);
       a.add(400);
       int max=(int)a.get(0);
         for(int i=0;i<a.size();i++)
        {
        	 if(max<(int)a.get(i))
        	 {
        		 max=(int)a.get(i);
        		 
        	 }
    	   
       }
         System.out.println("maximum value is"+max);
       


	}

}
