import java.io.*;
import java.util.*;
class Sum
 { public static void main(String args[])
  { int i,sum=0;
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int a[]=new int[n];
     { for(i=1;i<=n;i++)
       sum=sum+i;
     }
     System.out.println(sum);
}}
