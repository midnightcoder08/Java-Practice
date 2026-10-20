//method overloading
class calculator
{
int number1, number2, number3;
int multiply(int a, int b)
{
return a*b;
}
int multiply(int a,int b,int c)
{
return a*b*c;
}

void display()
{
System.out.println("product of 2 numbers are="+multiply(10,20));
System.out.println("product of 3 numbers are="+multiply(10,20,30));
}
public static void  main(String [] args)
{
calculator c=new calculator();
c.display();
}}