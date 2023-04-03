import java.util.Scanner;
class HappyNumberSeries 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Starting Number:");
		int start = s.nextInt();
		
		System.out.println("Enter Ending Number:");
		int end = s.nextInt();

		while (start<=end)
		{
			int start1 = start;
			while (true)
			{
				start1 = isHappy(start1);
				if (start1==1 || start1 ==4)
				{
					break;
				}
			}
			if (start1==1)
			{
				System.out.println(start);
			}
			start++;
		}

	}


	public static int isHappy(int num)
	{
		int sum = 0;
		while (num>0)
		{
			int rem = num%10;
			sum = sum  + (rem*rem);
			num/=10;
		}
		return sum;
	}
}
