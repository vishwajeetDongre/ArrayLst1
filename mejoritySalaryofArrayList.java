package org.vishwajeet;
import java.util.*;
class Employee
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
public class mejoritySalaryofArrayList {

	public static void main(String[] args) {
		int id,sal;
		String name;
		Scanner S= new Scanner(System.in);
	    ArrayList a= new ArrayList();
	    System.out.println("enter the Arraylist size ");
	    int size=S.nextInt();
	    Employee e[]= new Employee[size];
      do {
    	  System.out.println("case 1: enter the data in arraylist");
    	  System.out.println("case 2: Mejority of salary");
    	  System.out.println("case 3:display all data");
    	  System.out.println("enter the choise");
    	  int choise=S.nextInt();
    	  switch(choise)
    	  {
    	  case 1:
    		  
    		  for(int i=0;i<e.length;i++)
    		  { e[i]=new Employee();
    		   System.out.println("enter the id name Salary");
    		   id=S.nextInt();
    		   S.nextLine();
    		   name=S.nextLine();
    			sal=S.nextInt();
    			
    			e[i].setId(id);
    			e[i].setName(name);
    			e[i].setSal(sal);
    			a.add(e[i]);
    		  }
    		  break;
    	  case 2:
    		  Employee priv = null,next = null;
    		  int count=1;
    		  for(int i=0;i<e.length;i++)
    		  {
    			  for(int j=i+1;j<e.length;j++)
    			  {
    				   priv=(Employee)a.get(i);
    				   next=(Employee)a.get(j);
    				  if(priv.getSal()>next.getSal())
    				  {
    					  a.set(i,next);
    					  a.set(j, priv);
    					  
    				  }
    				 
    			  }
    		  }
    		  System.out.println("after sewaping");
    		 
    		  for(Object obj:a)
    		  { Employee e1=(Employee)obj;
    			  System.out.println(e1.getId()+"\t"+e1.getName()+"\t"+e1.getSal());
    		  }
    		 
    		  for(int i=0;i<e.length;i++)
    		  {    count=1;
    			  for(int j=(i+1);j<e.length;j++)
    		          { priv=(Employee)a.get(i);
   				         next=(Employee)a.get(j);
    				  
    			        if(priv.getSal()==next.getSal())
    			           {
    				           count ++;
    			           }
    			        else
    			        {
    			        	if(count>(e.length/2)) {
    			         System.out.println("mejority of salary is "+priv.getSal());
    			        	}
    			        }
    		         }
    		  }
    		  break;
    	  case 3:
    		  for(int i=0;i<e.length;i++)
    		  {
    			  System.out.println(e[i].getId()+"\t"+e[i].getName()+"\t"+e[i].getSal());
    		  }
    		  break;
    		  
    		  default:
    			  System.out.println("wrong choise");
    		  
    	  }
      }while(true);
	 

	}

}
