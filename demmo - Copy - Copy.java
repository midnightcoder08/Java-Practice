//question 
class product
{
String productname;
int price;
product(String pro,int p)
{
productname=pro;
price=p;
}}
class electronices extends product
{
String brand;
String warranty;
electronices(String pro,int p,String b,String w)
{
super(pro,p);
brand=b;
warranty=w;

}}
class mobile extends electronices
{
int ram;
int storage;
int gst;
int finalprice;
mobile(String pro,int p,String b,String w,int r,int s)
{
	super(pro,p,b,w);
ram=r;
storage=s;
gst=price*18/100;
finalprice=price+gst;

}
void display()
{
System.out.println("Product Name is="+productname);
System.out.println(" Price is="+price);
System.out.println("Brand name is="+brand);
System.out.println("Warrenty  is="+warranty);
System.out.println("Ram name is="+ram);
System.out.println("Storage  is="+storage);
System.out.println("GST is="+gst);
System.out.println("Final price including GST is="+finalprice);
}}
class demmo
{
public static void main(String[]args)
{
mobile m1=new mobile((args [0]),Integer.parseInt(args [1]),
(args [2]),(args [3]),Integer.parseInt(args [4]),
Integer.parseInt(args [5]));
m1.display();
}}
