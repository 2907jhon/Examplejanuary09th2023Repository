package com.sgtesting.Test1;
class Factorial
{
	int demo(int s)
	{
		int res=1;
		for(int i=s;i>1;i--)
		{
			res =res*i;
		}
		return res;
	}
}
public class factorial {

	public static void main(String[] args) {
		factorial s=new factorial();
		int res=s.demo(5);
		System.out.println("factorial of given No is:"+res);

	}

}
