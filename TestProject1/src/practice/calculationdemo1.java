package practice;
class calculation1
{
	int addition(int x,int y)
	{
		int res=(x+y);
		return(res);
		}
	int substraction(int x, int y)
	{
		int res=(x-y);
		return(res);
	}
	int multiplication(int x, int y)
	{
		int res=(x*y);
		System.out.println(res);
		return res;
	}
}


public class calculationdemo1 {

	public static void main(String[] args) {
		calculation1 o=new calculation1();
		int a=o.addition(15,5);
		int b=o.substraction(25,12);
		o.multiplication(a,b);
		o.multiplication(o.addition(25,15),o.substraction(6,2));
	}

}
