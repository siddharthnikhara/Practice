package assignment;

import java.util.Scanner;

public class Captcha {

	public static void main(String[] args) {
		int n = 6;

		// print a n x n spiral matrix in O(1) space
	int path=	getSpiralArray(n,69 );
 System.out.println("shortest path:"+path);
	}

	static int getSpiralArray(int n,int num) {
		int c;
		int p = 0,q=0,r=0,s=0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				// x stores the layer in which (i, j)th
				// element lies
				int x;

				// Finds minimum of four inputs
				x = Math.min(Math.min(i, j), Math.min(n - 1 - i, n - 1 - j));

				// For upper right half
				if (i <= j)
				{
					c=(n - 2 * x) * (n - 2 * x) - (i - x) - (j - x) ;
					System.out.print((n - 2 * x) * (n - 2 * x) - (i - x) - (j - x) + "\t");
				}
				// for lower left half
				else
				{
					c=(n - 2 * x - 2) * (n - 2 * x - 2) + (i - x) + (j - x);
					System.out.print((n - 2 * x - 2) * (n - 2 * x - 2) + (i - x) + (j - x) + "\t");
				}
				if(c==num)
			    {
				p=i;
				q=j;
			   }
			  if(c==1)
			  {
				  r=i;
				  s=j;
			  }
				
			}
			System.out.println();

		}
int path=0;
int d=0;
 System.out.println("p:"+p+" q:"+q);
 System.out.println("r:"+r+" s:"+s);
		if(p<=r)
		{
			if(p==r) d=0;
			else d=r-p;
			if(q<s) path=d+(s-q);
			else path=d+q-s;
		}
		else
		{
			if(p==r) d=0;
			else d=p-r;
			if(q<s) path=d+(s-q);
			else path=d+q-s;
					}
		return path;	
	}

}
