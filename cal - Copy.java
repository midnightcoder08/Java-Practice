//ques 5 method with parameter + return type
class cal
{
int a,b;
int add(int x, int y)
{
return x+y;
}
void display()
{
System.out.println("Number 1 is="+a);
System.out.println("Number 2 is="+b);
System.out.println("Sum is="+add(a,b));
}
public static void main(String[]args)
{
cal c1=new cal();
c1.a=50;
c1.b=50;
c1.display();
cal c2=new cal();
c2.a=500;
c2.b=50;

c2.display();
}}