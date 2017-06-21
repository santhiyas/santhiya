import java.io.*;
import java.util.*;

class primeno{
    
	public static void main (String[] args) 
	{ 
	    int flag=0;
	    Scanner s=new Scanner(System.in);
	 int s1=s.nextInt();
	 int s2=s.nextInt();
	   for(int i=s1;i<=s2;i++)
	   {
	       for(int j=2;j<i;j++)
	       {
	           if(i%j==0)
	           {
	               flag=0;
	               break;
	           }
	           else
	           {
	               flag=1;
	           }
	       }
	       if(flag==1)
	       {
	           System.out.println(i);
	       }
	   }
	   
	   
	}
}
