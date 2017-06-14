import java.util.*;
class digitaccount
{ public static void main(String args[])
 { int n,i=0;
  Scanner s=new Scanner(System.in);
  n=s.nextInt();
  while(n>0)
  { n=n/10;
    i++;
  }
  System.out.println("number of digits:"+i);
 }}
