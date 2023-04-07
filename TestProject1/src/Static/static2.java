package Static;
abstract class vicky
{
	static
	{
		System.out.println(" it is a ststic block in abstract class");
	}
}
class jhon extends vicky
{
	void display()
	{
		System.out.println("it is a sub class method");
	}
}

class static2 {

	public static void main(String[] args) {
		jhon a=new jhon();
		a.display();

	}

}
