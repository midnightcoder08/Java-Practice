//test question constructor
class bankaccount
{
int accountno;
String name;
int balance;
bankaccount()
{
accountno=0;
name=null;
balance=0;
}
bankaccount(int a, String n)
{
accountno=a;
name=n;
}
bankaccount(int a, String n,int b)
{
accountno=a;
name=n;
balance=b;
}
void print()
{
System.out.println("Enter Account no="+accountno);
System.out.println("Enter Name="+name);
System.out.println("Enter Balance="+balance);
}
public static void main(String [] args)
{
bankaccount b1=new bankaccount();
b1.print();
bankaccount b2=new bankaccount(454545,"Tanishka");
b2.print();
bankaccount b3=new bankaccount(464646,"Rohit",80000);
b3.print();
}}