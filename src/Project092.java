public class Project092
{
	private static int getNextInt(int a)
	{
		var nextInt = 0;
		while (a != 0)
		{
			var an = a % 10;
			nextInt += an * an;
			a /= 10;
		}
		return nextInt;
	}

	public static void main(String[] args)
	{
		var ans = 0;
		for (var i = 1; i < 10000000; i++)
		{
			var nextInt = i;
			while (nextInt != 1 && nextInt != 89)
				nextInt = getNextInt(nextInt);
			if (nextInt == 89)
				ans++;
		}
		System.out.println(ans);
	}
}
