public class Project047
{
	private static int primeNumber(int a)
	{
		int ans = 0;
		for (int i = 2; i <= a; i++)
			if ((a % i == 0) && (Library.isPrime(i)))
				ans++;
		return ans;
	}

	public static void main(String[] args)
	{
		int n = 1000;
		while (true)
		{
			n++;
			if (primeNumber(n) == 4)
				if (primeNumber(n + 1) == 4)
					if (primeNumber(n + 2) == 4)
						if (primeNumber(n + 3) == 4)
						{
							System.out.println(n);
							break;
						}
		}
	}
}
