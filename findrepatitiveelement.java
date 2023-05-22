package org.aug15;
import java.util.*;
public class findrepatitiveelement {

	public static void main(String[] args) {
		int count=1;
		ArrayList a= new ArrayList();
		a.add(100);
		a.add(200);
		a.add(300);
		a.add(100);
		a.add(400);
		a.add(200);
		a.add(100);
		
		//Collections.sort(a);
		System.out.print(a);
		for(int i=0;i<a.size();i++)
		{  count =1;
			for(int j=i+1;j<a.size();j++)
			{
				if(a.get(i)==a.get(j))
				{
					count++;
					
				}else
				{
					if(count>1)
					{
						System.out.println("\n"+a.get(i)+"=====>"+count);
						count=1;
						
					}
				}
			}
		}
		

	}

}
