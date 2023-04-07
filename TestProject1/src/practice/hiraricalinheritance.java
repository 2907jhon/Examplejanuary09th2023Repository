package practice;
class Demo10
{
	Demo10()
	{
	System.out.println("it is a no args constructor");
	}
}
class Demo11 extends Demo10
{
	Demo11(String s)
	{
		System.out.println("it is a parameterized constructor");
	}
}
class Demo12 extends Demo10
{
    void fact()
    {
	System.out.println("it is a method which do not return value");
    }
}
class Demo13 extends Demo10
{
	int Show1(int x) 
	{
		x+=20;
		System.out.println("it is a return method");
		return x;
	}
}

public class hiraricalinheritance {

	public static void main(String[] args) {
	Demo13 x=new Demo13();
	x.Show1(10);
	
	Demo12 x1=new Demo12();
	x1.fact();
	
	Demo11 x2=new Demo11("jhon");

	}

}
