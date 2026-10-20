public class box
{
 int h,d,w;
 void setbox(int x,int y,int z)
{
h=x;
d=y;
w=z;
}
int showvol()
{
int result=h*d*w;
return result;
}
void showarea()
{
	int a;
int l;
a=showvol();
l=a/2;
System.out.println("Your ans is=" +l);
}
    public static void main(String[] args)
{
box b=new box();
b.setbox(
Integer.parseInt(args[0]),
Integer.parseInt(args[1]),
Integer.parseInt(args[2])
);
b.showarea();
}
}