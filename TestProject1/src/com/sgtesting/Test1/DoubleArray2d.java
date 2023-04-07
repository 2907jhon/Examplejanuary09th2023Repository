package com.sgtesting.Test1;
class Array2d
{
	double [][] demo (double d1[][],double d2[][])
	{
		double d3[][]=new double[d1.length][d1[0].length];
		for(int i=0;i<d1.length;i++)
		{
			for(int j=0;j<d1[i].length;j++)
			{
				d3[i][j]=d1[i][j]-d2[i][j];
			}
		}
	}
}

public class DoubleArray2d {

	public static void main(String[] args) {
		Array2d a=new Array2d();
		double d1= {{1.0,6.2,3.6,4.2}

	}

}
