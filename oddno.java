import java.io.*;
import java.util.*;

class oddno{
    
	public static void main (String[] args) 
	{ 
	   
	    Scanner s=new Scanner(System.in);
	 int s1=s.nextInt();
	 int s2=s.nextInt();
	   for(int i=s1;i<=s2;i++)
	   {
	           if(i%2!=0)
	           {
	         System.out.println(i);
	       }
	   }
	}
}
	   
