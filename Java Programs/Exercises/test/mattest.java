package test;

import java.util.Scanner;

public class mattest
	{
	public static void main(String args[])
	{
	A a = new A();
	Matrix m1 = new Matrix(2,2);
	Matrix m2 = new Matrix(2,2);
	Matrix m3 = new Matrix(2,2);


	m1.input();
	m2.input();
	m3 = m1.add(m2);
	System.out.println("First matrix");
	m1.display();
	System.out.println("Second matrix");
	m2.display();
	System.out.println("Resultant matrix");
	m3.display();
	}
	}

class Matrix
	{

	int a[][] = new int[10][10];
	int row,col;

	Matrix(int m,int n) { row=m; col=n;}
	Matrix() { row=0; col=0;}
	public void input()
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the " + row + " x " + col + " Matrix");
	for (int i=0; i<row; i++)
	{
	for (int j=0; j<col; j++)
	a[i][j] = s.nextInt();
	}

	}

	public void display()
	{
	for (int i=0;i <row; i++)
	{
	for (int j=0; j < col; j++)
	{
	System.out.print(a[i][j]+"  ");
	}
	System.out.println();
	}
	}

	public Matrix add(Matrix A)
	{
	Matrix c = new Matrix(this.row,this.col);
	for (int i=0; i<row; i++)
	for (int j=0; j<col; j++)
	{
	c.a[i][j] = this.a[i][j]+A.a[i][j];
	}
	return(c);
	}

	}


	