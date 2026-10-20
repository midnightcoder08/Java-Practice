//constructor overloading means one or more class but different parameter lists
class boxx
{
int length;
int breadth;
boxx()// here 0 parameter i.e deafault 
{
length=0;
breadth=0;
System.out.println("Lenghth is="+length);
System.out.println("Breadth is ="+breadth);

}
boxx(int l)// class having 1 parameter
{
length=l;
breadth=l;
System.out.println("Lenghth is="+length);
}
boxx(int l,int b)// class having 2 parameter
{
length=l;
breadth=b;
System.out.println("Lenghth is="+length);
System.out.println("Breadth is ="+breadth);

}
void area()
{
 int area=length*breadth;
System.out.println("Area of box is="+area);
}
public static void main(String[]args)
{
boxx b1=new boxx();
b1.area();
boxx b2=new boxx(10);
b2.area();

boxx b3=new boxx(10,30);
b3.area();

}}