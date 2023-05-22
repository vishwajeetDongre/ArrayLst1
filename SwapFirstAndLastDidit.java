package org.vishwajeet;
import java.util.*;

public class SwapFirstAndLastDidit {

	public static void main(String[] args) {
		int no,rem,rem2,rem3,rem1,sum=0;
	Scanner S= new Scanner(System.in);
	System.out.println("enter the number");
	 no=S.nextInt();
	   rem=no%10;
	   no=no/10;
	  int temp=no;
	  rem1=no%10;
	  no=no/10;
	  rem2=no%10;
	  no=no/10;
	  System.out.print(rem+""+rem2+""+rem1+""+no);

	}

}
