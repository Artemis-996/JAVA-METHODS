import java.util.Scanner;
class HappyOrUnhappyNumber
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number:");
		int ip = s.nextInt();

		while (true)
		{
			ip = isHappy(ip);
			if (ip == 1 || ip==4)
			{
				break;
			}
		}

		if (ip==1)
		{
			System.out.println("Number is happy number");
		}
		else
		{
			System.out.println("Number is unhappy number");
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
