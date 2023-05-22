package org.vishwajeet;
import java.util.*;
abstract class NumberOpration
{
	abstract void setvalue(int no);
	
	
	
}
class Digitcount extends NumberOpration
{ int no,rem,count=0;
	void setvalue(int no)
	{
		this.no=no;
		
	}
	void getdigitcount()
	{
		while(no!=0)
		{ rem=no%10;
		no=no/10;
			count++;
		}
		System.out.println("count is "+count);
		
	}
	void digitsearch(int no)
	
	{ 
		int flag=0;
		Scanner S= new Scanner(System.in);
		System.out.println("enter the u want to search element");
		int e=S.nextInt();
		while(no!=0)
		{ rem=no%10;
		 if(rem==e)
		 {
			  flag=1;
			 break;
		 }
		no=no/10;
		}
		if(flag==1)
		{
			System.out.println("number found");
		}else
		{
			System.out.println("number is not found");
		}
			
		
		
		
	}
}

public class Searchdidit {
	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		System.out.println("enter the number");
		int no=S.nextInt();
		Digitcount d=new Digitcount();
		d.setvalue(no);
		d.getdigitcount();
		d.digitsearch(no);
				

	}

}
