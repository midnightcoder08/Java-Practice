//method overloading
class call
{
int call(int a,int b)
{
return a+b;
}
int call(int a,int b,int c)
{
return a+b+c;
}
void display()
{
System.out.println("Addition of two no is="+call(20,30));
System.out.println("Addition of three no is="+call(20,30,40));
}
public static void main(String [] args)
{
call c=new call();
c.display();
}}