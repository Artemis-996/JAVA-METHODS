class M1 
{
	public static void main(String[] args) 
	{
		add(20,10);
		sub(20,10);
		mul(20,10);
		div(20,10);
		sub(20,10);
		power(10,2);
		fact(5);
		reverse(1234);
		count(1234);
		rangeEvenOdd(1,50);
		RightAngle(10);
		RightAngleMirror(10);
		pyramid(10);
		reversePyramid(10);
		diamond(9);
		leftLegPyramid(9);
		rightLegPyramid(9);
	}

	public static void add(int a,int b)
	{
		int c = a+b;
		System.out.println(c);
	}

	public static void sub(int a,int b)
	{
		int c = a-b;
		System.out.println(c);
	}

	public static void mul(int a,int b)
	{
		int c = a*b;
		System.out.println(c);
	}
	
	public static void div(int a,int b)
	{
		int c = a/b;
		System.out.println(c);
	}

	public static void power(int base,int raise)
	{
		int pow = 1;
		for (int i=0;i<raise ;i++ )
		{
			pow*=base;
		}
		System.out.println(pow);
	}

	public static void fact(int a)
	{
		int facto = 1;
		for (int i=a;i>0 ;i-- )
		{
			facto*=i;
		}
		System.out.println(facto);
	}

	public static void reverse(int a)
	{
		int rev = 0;
		while (a>0)
		{
			int rem = a%10;
			rev = (rev*10)+rem;
			a/=10;
		}
		System.out.println(rev);
	}

	public static void count(int a)
	{
		int ct = 0;
		while (a>0)
		{
			ct++;
			a/=10;
		}
		System.out.println(ct);
	}

	public static void rangeEvenOdd(int start,int end)
	{
		System.out.println("Range of even");
		for (int i=start;i<=end ;i++ )
		{
			if (i%2==0)
			{
				System.out.println(i);
			}
		}
		System.out.println("Range of odd");
		for (int i=start;i<=end ;i++ )
		{
			if (i%2!=0)
			{
				System.out.println(i);
			}
		}
	}

	public static void RightAngle(int n)
	{
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<=i ;j++ )
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void RightAngleMirror(int n)
	{
		for (int i=0;i<n;i++ )
		{
			for (int j=0;j<n-i-1 ;j++ )
			{
				System.out.print("  ");
			}
			for (int j=0;j<=i ;j++ )
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void pyramid(int n)
	{
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n-i-1 ;j++ )
			{
				System.out.print("  ");
			}
			for (int j=0;j<=i*2 ;j++ )
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void reversePyramid(int n)
	{
		int star = n;
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<i ;j++ )
			{
				System.out.print("  ");
			}
			for (int j=0;j<star+3 ;j++ )
			{
				System.out.print("* ");
			}
			System.out.println();
			star-=2;
		}
	}

	public static void diamond(int n)
	{
		int star = 0;
		int space = n/2;
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<space ;j++ )
			{
				System.out.print("  ");
			}
			for (int j=0;j<=star ;j++ )
			{
				System.out.print("* ");
			}
			System.out.println();
			if (i<n/2)
			{
				space--;
				star+=2;
			}
			else
			{
				space++;
				star-=2;
			}
		}
	}

	public static void leftLegPyramid(int n)
	{
		int star = 0;
		for (int i = 1;i<=n ;i++ )
		{
			for (int j=0;j<=star ;j++ )
			{
				System.out.print("* ");
			}
			System.out.println();
			if (i<n/2)
			{
				star+=2;
			}
			else
			{
				star-=2;
			}
		}
	}

	public static void rightLegPyramid(int n)
	{
		int space = n;
		int star = 0;
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<space ;j++ )
			{
				System.out.print("  ");
			}
			for (int j=0;j<=star ;j++ )
			{
				System.out.print("* ");
			}
			System.out.println();
			if (i<n/2)
			{
				star++;
				space--;
			}
			else
			{
				star--;
				space++;
			}
		}
	}


}
