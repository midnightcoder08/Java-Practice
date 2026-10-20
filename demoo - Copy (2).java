//Inheritence means subclasses(child class) can use the properties and method of sub class
//ques 1
class student
{
int rollno;
String name;
void display1()
{
System.out.println("Roll no is="+rollno);
System.out.println("Name is="+name);
}}
class marks extends student 
{
int marks;
void display()
{
System.out.println("Marks is="+marks);
}}
class demoo
{
public static void main(String[]args)
{
marks m1=new marks();
m1.name="Tanishka";
m1.rollno=16125;
m1.marks=80;
m1.display1();
m1.display();
}}