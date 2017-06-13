import java.io.*;
import java.util.*;

class printn
{ public static void main(String args[])
{ 
    int i=1,x,sum=0;
    Scanner s=new Scanner(System.in);
    x=s.nextInt();
   
  while(i<=x)
   {
      sum=sum+i;
      i++;
      System.out.println("sum of "+x+" numbers is:" +sum);
   }
   }
}
