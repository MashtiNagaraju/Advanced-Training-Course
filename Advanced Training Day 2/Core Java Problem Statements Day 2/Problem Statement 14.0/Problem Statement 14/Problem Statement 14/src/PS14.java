import java.util.*;
 
public class PS14 {
	 public static void sortedMerge(int a[], int b[],
             int res[], int n,
             int m)
{
// Concatenate two arrays
int i = 0, j = 0, k = 0;
while (i < n) {
res[k] = a[i];
i++;
k++;
}

while (j < m) {
res[k] = b[j];
j++;
k++;
}

// sorting the res array
Arrays.sort(res);
}

/* Driver program to test above function */
public static void main(String[] args)
{
int a[] = { 10, 5, 15 };
int b[] = { 20, 3, 2 };
int n = a.length;
int m = b.length;

// Final merge list
int res[]=new int[n + m];
sortedMerge(a, b, res, n, m);

System.out.print("Sorted merged list :");
for (int i = 0; i < n + m; i++)
System.out.print(" " + res[i]);
}
}
