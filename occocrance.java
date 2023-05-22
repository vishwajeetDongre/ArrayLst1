package org.vishwajeet;
import java.util.*;

public class occocrance {

	public static void main(String[] args) {
		int count=1;
		Scanner S=new Scanner(System.in);
		ArrayList a=new ArrayList();
		a.add(100);
		a.add(200);
		a.add(300);
		a.add(100);
		a.add(300);
		a.add(400);
		a.add(500);
		a.add(600);
		
		
		Collections.sort(a);
		
		System.out.println(a);
		
		count=1;
		for(int i=0;i<a.size()-1;i++)
		{  
			
		 
				Object obj=a.get(i);
				int aa =(int)obj;
				Object obj1=a.get(i+1);
				int b= (int)obj1;
				//System.out.println("i= "+obj+"i+1= "+obj1);
				
				if(aa==b)
				{
					count++;
					//System.out.println("count= "+count);
				}else
				{
					System.out.println("\n"+obj+"\t"+count);	
					count=1;
				}
			
			
			
		}
		

	}

}
