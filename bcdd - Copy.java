//super keyword in java is used to refer to the immediate parent class object
//it is used to access parent class variables,methods and constructor.


//SUPER REFERRING TO INSTANCE VARIABLE OF THE BASE CLASS:
class abc
{                                                          
int a=90;
}
class bcdd extends abc
{
int a=10;

void print()
{
System.out.println(super.a);
}
}
class demo
{
public static void main(String[]args)
{
bcdd b1=new bcdd();
b1.print();
}
}