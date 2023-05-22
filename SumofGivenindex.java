package org.vishwajeet;
import java.util.*;
public class SumofGivenindex {

	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		ArrayList a=new ArrayList();
		int sum =0;
		a.add(10);
		a.add(2);
		a.add(30);
		a.add(4);
		a.add(6);
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(20);
		a.add(50);
		Object[] ch=a.toArray();
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]+"\t");
		}
		System.out.println("\n enter the index you want to add ");
		 int index=S.nextInt();
		 int index1=S.nextInt();
		// a.add(index,index1);
		
		 for(int i=index;i<=index1;i++)
		 {
			 sum=sum+(int)a.get(i);
		 }
		 System.out.println("sum is ="+sum);

	}

}
