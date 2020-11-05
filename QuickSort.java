import java.util.*;

public class QuickSort
{
	public static void swap (int[] a, int x, int y) 
	{
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}

	
	public static int HoarePartition(int[] a, int start, int end)
	{
		int pivot = a[start];
		int i = start - 1;
		int j = end + 1;

		while (true)
		{
			do 
			{
				i++;
			} 
			while (a[i] < pivot);

			do 
			{
				j--;
			} 
			while (a[j] > pivot);

			if (i >= j)
				return j;

			swap(a, i, j);
		}
	}

	
	public static void quickSort(int[] arr, int start, int end)
	{
	
		if (start>= end)
		{
			return;
		}

		int split = HoarePartition(arr, start,end);
		quickSort(arr, start, split);
		quickSort(arr, split + 1, end);
	}


	public static void main(String[] args)
	{
		int[] userArray = new int[10];
		Scanner sc=new Scanner(System.in);
		for(int ctr=0;ctr<10;ctr++)
			userArray[ctr]=sc.nextInt();

		quickSort(userArray, 0, userArray.length - 1);

		
		System.out.println(Arrays.toString(userArray));
	}
}