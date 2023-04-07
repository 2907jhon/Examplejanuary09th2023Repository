package com.sgtesting.Test1;
class CharDemo
{
	char[] Demo(char ch[] )
	{
		
		char b[]=new char [ch.length];
		for(char i=b.length-1;i>=0;i--);
		{
			b[i]=ch[i];
		
		}
		return b;
	}
}

public class CharacterArray {

	public static void main(String[] args) {
	CharDemo a=new CharDemo();
	char c[]= { 'a','b','c', 'd', 'e' ,'f'};
	char b[]=a.Demo(c);
	for (char i=0;i<b.length;i++);
	{
		System.out.println(b[i]);
	}


	}

}
