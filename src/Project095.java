import java.util.ArrayList;

public class Project095
{
	public static void main(String[] args)
	{
		var arr = new int[1000001];
		for (var i = 1; i <= 1000000; i++)
			for (var j = i * 2; j <= 1000000; j += i)
				arr[j] += i;
		var max = Integer.MIN_VALUE;
		var element = 0;
		for (var i = 0; i <= 1000000; i++)
		{
			ArrayList<Integer> list = new ArrayList<>();
			for (int length = 1, nextInt = i; ; length++)
			{
				list.add(nextInt);
				nextInt = arr[nextInt];
				if (nextInt == i)
				{
					if (length > max)
					{
						element = i;
						max = length;
					}
					break;
				}
				if (nextInt > 1000000 || list.contains(nextInt))
					break;
			}
		}
		System.out.println(element);
	}
}