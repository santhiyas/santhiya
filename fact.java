import java.io.*;
import java.util.*;
class fact {
   public static void main(String args[])
   {
   int i,n,res=1;
       Scanner s=new Scanner(System.in);
       n=s.nextInt();
      for(i=1;i<=n;i++)
     { 
         res=res*i;
     }
     System.out.println("res:" +res);
   }
}
