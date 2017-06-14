import java.util.*;
class power
{ public static void main(String args[])
  { long n,p,r=1;
   Scanner s=new Scanner(System.in);
    n=s.nextLong();
   p=s.nextLong();
   if(n>=0&&p==0)
   { r=1;
   }
   else if(n==0&&p>=1)
   { r=0;
   }
   else
   { 
       for(int i=0;i<=p;i++)
       { r=i*n;
       }
   }
   System.out.println(r);
  }}
