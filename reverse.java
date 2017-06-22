import java.io.*;
import java.util.*;
class reverse {
   public static void main(String args[])
   { String org,rev="";
   int i,len;
       Scanner s=new Scanner(System.in);
       org=s.nextLine();
      len=org.length();
      for(i=len-1;i>=0;i--)
     {
         rev=rev + org.charAt(i);
     } 
     System.out.println("reverse of string:" +rev);
   }
}
