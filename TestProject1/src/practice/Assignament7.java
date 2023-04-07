package practice;
class Demo45
{
	Demo45(int s)
	{
		System.out.println("constructor overloading");
	}
	Demo45(String a)
	{
		System.out.println("constructor overloading1");
	}
}
class Demo46 extends Demo45
{
	Demo46(int a1)
	{
		super(a1);
	}
	Demo46(String s1)
	{
		super(s1);
	}
	void Display()
	{
		System.out.println("it is a sub class ");
	}
}
class Demo47 extends Demo45
{
	
	Demo47(int a2)
	{
		super(a2);
	}
	Demo47(String S2)
	{
		super(S2);
	}
	static
	{
		System.out.println("it is sub class1 Static block");
	}
}
class Demo48 extends Demo47
{
	Demo48(int a3)
	{
		super(a3);
	}
	Demo48(String s3)
	{
		super(s3);
	}
	void display1()
	{
		System.out.println("it is a sub class 2 instant block");
	}
}

public class Assignament7 {

	public static void main(String[] args) {
		Demo48 o=new Demo48(25);
		Demo48 o1=new Demo48("jhon");
		o.display1();
		Demo46 o2=new Demo46("rama");
        o2.Display();
        Demo45 o3= new Demo45("nand");
	}

}
