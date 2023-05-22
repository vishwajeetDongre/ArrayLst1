package org.vishwajeet;
import java.util.*;
public class DupicateArryList {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(100);
		a.add(200);
		a.add(300);
		a.add(100);
		a.add(400);
		a.add(300);
		a.add(500);
		
		Collections.sort(a);
		System.out.println(a);
		
		for(int i=0;i<a.size()-1;i++)
		{
			Object obj=(int)a.get(i);
			int aa=(int)obj;
			Object obj1=a.get(i+1);
			int b=(int)obj1;
			if(obj==obj1)
			{
				//a.remove(a.get(i));
				a.remove(obj);
			}else
			{
				System.out.println(a.get(i));
			}
			
		}
		

	}

}
