public class Project035
{
	public static void main(String[] args)
	{
		String[] a = new String[6];
		int ans = 1;
		for (int i = 3; i < 1000000; i++)
		{
			String s1 = String.valueOf(i);
			for (int j = 0; j < s1.length(); j++)
				a[j] = s1.substring(j, j + 1);
			boolean boo = true;
			for (int j = 0; j < s1.length(); j++)
			{
				StringBuilder s = new StringBuilder();
				for (int k = j; k < s1.length() + j; k++)
					s.append(a[k % s1.length()]);
				if (!Library.isPrime(Integer.parseInt(s.toString())))
				{
					boo = false;
					break;
				}
			}
			if (boo)
			{
				ans++;
				//System.out.print(i + " ");
			}
		}
		System.out.print(ans);
	}
}