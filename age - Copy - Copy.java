import java.util.Scanner;
class age
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter your age to check Eligibility");
int age=sc.nextInt();
if(age>18){
System.out.println("Congrats, You are Eligible");
}
else{
System.out.println("Sorry you are not eligible");
}
}}