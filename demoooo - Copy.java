//practicing java inheritence
class employee
	{
		int id;
		String name;
		double salary;
			employee(int i,String n,double s)
				{
					id=i;
					name=n;
					salary=s;
				}
	void display()
		{
			System.out.println("Employee ID is="+id);
			System.out.println("Employee Name is="+name);
			System.out.println("Employee  Salary is="+salary);
		}
	}
class manager extends employee
	{
		String department;
		double bonus;
		double finalsal;
			manager(int i,String n,double s,String d,double b)
				{
					super(i,n,s);
					department=d;
					bonus=b;
					finalsal=salary + bonus;
				}
	void display()
		{
			super.display();
			System.out.println("Manager department is="+department);
			System.out.println("Bonus  is="+bonus);
			System.out.println("Final Salary is="+finalsal);

		}
	}
class demoooo
{
public static void main(String[]args)
{
manager m1=new manager(101,"Tanishka",80000.8,"IT",5000);
m1.display();
}}