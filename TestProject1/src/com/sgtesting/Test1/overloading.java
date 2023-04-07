package com.sgtesting.Test1;
class Department1
{
	Department1(String DepartmentName)
	{
		System.out.println(DepartmentName);
	}
	Department1(int DepartmentNo)
	{
		System.out.println(DepartmentNo);
	}
}

public class overloading {

	public static void main(String[] args) {
	Department1 o1=new Department1("sales");
	Department1  o2=new Department1(20);

	}

}
