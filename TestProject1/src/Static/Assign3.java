package Static;
abstract class vijay
{
	abstract void dispaly();
	abstract void dispaly1();
	abstract void dispaly2();
}
abstract class raj extends vijay
{
	void display()
	{
		System.out.println("it is a sub class");
	}
	void display1()
	{
		System.out.println("it is a sub class1");
	}
}
class ninad extends raj
{
	void display2()
	{
		System.out.println("it is a second sub class");
	}
}
public class Assign3 {

	public static void main(String[] args) {
	 ninad a=new ninad();
	 a.dispaly();
	 a.dispaly1();
	 a.dispaly2();

	}

}
