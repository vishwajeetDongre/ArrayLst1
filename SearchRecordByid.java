package org.vishwajeet;
import java.util.*;
class employee4
{
	int id,sal;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}

public class SearchRecordByid {

	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		
		
      System.out.println("enter the size");
      int size=S.nextInt();
      ArrayList a= new ArrayList();
      employee4 e[]=new employee4[size];
      for(int i=0;i<e.length;i++)
      {
    	 
		 e[i]=new employee4();
		System.out.println("enter the id name salary");
		int id=S.nextInt();
		S.nextLine();
		String name=S.nextLine();
		int sal=S.nextInt();
		
		e[i].setId(id);
		e[i].setName(name);
		e[i].setSal(sal);
		a.add(e[i]);
    	  
      }
      System.out.println("enter the id u want to search");
      int id1=S.nextInt();
      for(Object obj:a)
      {
    	  employee4 e2=(employee4)obj;
    	  if(id1==e2.getId())
    	  {
    		  System.out.println(e2.getId()+"\t"+e2.getName()+"\t"+e2.getSal()+"\n");
    	  }
      }
	}

}
