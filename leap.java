import java.io.*;
import java.util.*;

class IllegalStateException
{ public static void main(String args[])
{ Scanner s=new Scanner(System.in);
   int year=s.nextInt();
   if(year%4==0)
   { System.out.println("leap year");
   }
   else
   System.out.println("not leap year");
   }
}
