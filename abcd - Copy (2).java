import java.util.Scanner;
class abcd
{
int length;
int breadth;
int area,l;
//parameterized
void get(int l,int b)
{
length=l;
breadth=b;
}
//deafaut
abcd()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value for Length=");
length=sc.nextInt();
System.out.println("Enter the value for Breadth=");
breadth=sc.nextInt();
}

int cal()
{
 area=length*breadth;
return area;
}
void print()
{
System.out.println("Area is="+cal());//call cal
}
public static void main(String[]args)
{
abcd a1=new abcd();
a1.print();
    a1.get(40,20);// get method ke sath dusra object banane ki jaurat nhi
    a1.print();
}}