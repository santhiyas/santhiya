import java.util.*;
class largest
{ public static void main(String args[])
  { int i;
      Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(i=0;i<n;i++)
    {a[i]=sc.nextInt();
    }
    int max=a[0];
    for(i=0;i<a.length;i++)
    {if (max<a[i])
    {max=a[i];
    }
    
    }
    System.out.println(max);
}}
