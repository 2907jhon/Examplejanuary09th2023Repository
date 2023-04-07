package com.sgtesting.Test1;
class Array1
{
	double [] demo ( double d[])
{
	double k[]=new double[d.length];
	int a=0;
	for(int i=0;i<=d.length/2;i++)
	{
		k[a]=d[i];
		a++;
	}
	return k;
}
}

public class DoubleArray {

	public static void main(String[] args) {
		Array1 b=new Array1();
		double dd[]= {10.5,11.5,6.3 ,46.5,63.5};
		double a[]=b.demo(dd);
for(int j=0;j<=a.length/2;j++);
{
	System.out.println(a[b]);
}
		
	}

}
