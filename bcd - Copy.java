import java.io.*;
class bcd
{
public static void main(String[]args)throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
String a,b;
a=br.readLine();
int l=Integer.parseInt(a);
b=br.readLine();
int m=Integer.parseInt(b);
int c=l+m;
System.out.println("Sum is=" +c);
}}