import java.util.*;
class alphabet
{ public static void main(String args[])
  { 
      char ch;
      Scanner sc=new Scanner(System.in);
    ch=sc.next().charAt(0);
    if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
    {System.out.println("Alphabet");    }
    else
    {System.out.println("NOT ALPHABET");
    }}
}
