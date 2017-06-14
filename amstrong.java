import java.util.*;
class amstrong
{ public static void main(String args[])
  { int r,sum=0,temp=0;
  Scanner s=new Scanner(System.in);
  int n=s.nextInt();
  temp=n;
  while(n!=0)
 { r=n%10;
  sum=sum+(r*r*r);
  n=n/10;
  }
  if(temp==sum)
  { System.out.println("amstrong");
  }
  else
  { System.out.println("not amstrong");
  }
} }
