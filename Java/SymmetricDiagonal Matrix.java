import java.io.*;
class Matrix
{
	void row(int a[][],int n)
	{
		int sum=0;
		for(int r=0;r<n;r++)
		{
			for(int c=0;c<n;c++)
				sum=sum+a[r][c];
			System.oout.println("Sum of "+(r+1)+" row= "+sum);
		}
	}
	void column(int a[][],int n)
	{
		int sum=0;
		for(int c=0;c<n;c++)
		{
			for(int r=0;r<n;r++)
				sum=sum+a[r][c];
			System.oout.println("Sum of "+(c+1)+" column= "+sum);
		}
	}
	void diag(int a[][],int n)
	{
		int count=0;
		for(int r=0;r<n;r++)
		{
			for(int c=0;c<n;c++)
			{
				if(r==c)
				{
					if(a[r][c]>0)
						count++;
				}
				else 
					if(a[r][c]>0)
					{
						count=0;
						break;
					}
			}
		}
		if(count==n)
			System.out.println("Is diagonal matrix");
		else
			System.out.println("Is not a diagonal matrix");
	}
	void symmetric(int a[][],int n)
	{
		int count=0;
		for(int r=0;r<n;r++)
		{
			for(int c=0;c<n;c++)
			{
				if(a[r][c]!=a[c][r])
				{
					count++;
				}
			}
		}
		if(count==0)
			System.out.println("Is diagonal matrix");
		else
			System.out.println("Is not a diagonal matrix");
	}
	public static void main(String args[])
	{
		Matrix m=new Matrix();
		try
		{
		int n;
		BufferedReader br= new BufferedReader (new InputStreamReader(System.in);
		System.out.println("Enter the size of the matrix");
		n=Integer.parseInt(br.readLine());
		int a[][]=new int[n][n];
		for(int i<n;i++)
			for(int j=0;j<n;j++)
				a[i][j]=Integer.parseInt(br.readLine());
		System.out.println("1.Row-wise sum\n2.Column-wise sum\n3.Check for diagonal matrix\n4.Check for symettric matrix");
		int ch,v;
		do
		{
			System.out.println("Enter your choice");
			ch=Integer.parseInt(br.readLine());
			switch(ch)
			{
				case 1:
					m.row(a,n);
					break;
				case 2:
					m.column(a,n);
					break;
				case 3:
					m.diag(a,n);
					break;
				case 4:
					m.symmetric(a,n);
					break;
				default:
					break;
			}
		}while(true);
		}catch(Exception e){e.printStackTrace();}
	}
}
