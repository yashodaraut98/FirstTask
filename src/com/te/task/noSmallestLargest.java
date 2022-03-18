package com.te.task;

public class noSmallestLargest {
	public static void main(String args[])
	{
	int large,small,i;
int[] a= new int[] {78, 34, 1, 3, 90, 34, 6, 55, 20};  
	System.out.println("Array elements after sorting:");  
	//sorting logic  
	for (int i1= 0; i1 < a.length; i1++)   
	{  
	for (int j = i1 + 1; j < a.length; j++)   
	{  
	int tmp = 0;  
	if (a[i1] > a[j])   
	{  
	tmp = a[i1];  
	a[i1] = a[j];  
	a[j] = tmp;  
	}  
	}  
	//prints the sorted element of the array  
	System.out.println(a[i1]);  
	}  
	
		int n = a.length;
	large=small=a[0];
	for(i=1;i<n;++i)
	{
	if(a[i]>large)
	large=a[i];

	if(a[i]<small)
	small=a[i];
	}
    System.out.println("\n the smallest element is"+small);
	System.out.println("the largest element is" + large);
	}

}
