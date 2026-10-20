//ques 3 multiple object and method with parameters
class bankacc
{
String name;
int accountno;
double balance;
void display(double amount)//parameters in object
{
balance=balance+amount;
System.out.println("Name="+name);
System.out.println("Accountno="+accountno);
System.out.println("Balance="+balance);

}
public static void  main(String[]args)
{
bankacc b1=new bankacc();
b1.name="Tanishka";
b1.accountno=22598556;
b1.balance=5000000;
b1.display(20000);
bankacc b2=new bankacc();

b2.name="Ismit";
b2.accountno=33333333;
b2.balance=100000;
b2.display(200000);
}}