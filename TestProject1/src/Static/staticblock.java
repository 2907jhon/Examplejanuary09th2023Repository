package Static;
abstract class ram
{
	static void display()
	{
		System.out.println("it is a static block in abstract class");
	}
}

public class staticblock {

	public static void main(String[] args) {
		ram.display();

	}

}
