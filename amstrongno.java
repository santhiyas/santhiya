import java.io.*;
import java.util.*;

class amstrongno{
    
	public static void main (String[] args) 
	{ int temp,n,r,count=0;
	   
	    Scanner s=new Scanner(System.in);
	 int s1=s.nextInt();
	 int s2=s.nextInt();
	   for(int i=s1+1;i<=s2;i++)
	   { temp=i;
	   n=0;
	   while(temp!=0)
	   { r=temp%10;
	     n=n+r*r*r;
	     temp=temp/10;
	   }
	   if(i==n)
         { if(count==0)
          {
              
          }System.out.println(i+"");
          count++;
        }
	       
}}	   }
	   

