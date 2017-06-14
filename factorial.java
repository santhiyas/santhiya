import java.util.*;
class factorial
{public static void main(String args[])
 { int fact=1,num,i;
Scanner s=new Scanner(System.in);
num=s.nextInt();
for(i=1;i<=num;i++)
  {
      fact=fact*i;
      System.out.println("factorial="+fact);
  }}}
