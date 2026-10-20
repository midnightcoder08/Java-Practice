//method overloading
class areaa
{
int calculate(int side)
{
 return side*side;
}
int calculate(int length,int breadth)
{
 return length*breadth;
 }
 void display()
 {
 System.out.println("Area of square ="+calculate(5));
 System.out.println("Area of rectangle ="+calculate(8,5));
}
public static void main(String[]args)
{
areaa a=new areaa();
a.display();
}}