import java.util.*;
class card
{ public static void main(String args[])
 {
     int num,count=0,i=0;
     Scanner s=new Scanner(System.in);
  num=s.nextInt();
   
   for(i=2;i<num;i++)
   {if(num%i==0)
   { count++;
    break;
   }
   }
   if(count==0)
   {System.out.println("prime");
   }
   else
   {System.out.println("not prime");
   }
 }}
