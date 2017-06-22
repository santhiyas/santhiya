import java.io.*;
import java.util.*;
class rev {
   public static void main(String args[])
   {
   int i,n,len,res=0;
       Scanner s=new Scanner(System.in);
       n=s.nextInt();
      
      while(n!=0)
     {  res=res*10;
         res=res+n%10;
         n=n/10;
     }
     System.out.println("res:" +res);
   }
}
