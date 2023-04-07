package practice;
class Demo20
{
	
	{
	  System.out.println("it is a main class");
	}
}
class demo21 extends Demo20
{
	{
	System.out.println("it is sub main class");
    }
}
class demo22 extends Demo20
{
	{
		System.out.println("it is second main sub class");
	}
}
class Demo23 extends Demo20
{
	{
		System.out.println("it is third sub main class");
	}
}
public class Hybrid {

	public static void main(String[] args) {
		demo22 x=new demo22();
		Demo23 y=new Demo23();

	}

}
