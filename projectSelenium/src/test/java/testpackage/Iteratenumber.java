package testpackage;

public class Iteratenumber 
{
	
	    public static void main(String[] args) 
	    {
	        int[] a = {1, 2, 3, 4, 5};
	        int n = a.length;
	        int temp = a[n-1];
	        for (int i = n-2; i >= 0; i--) 
	        {
	            a[i+1] = a[i];
	        }
	        a[0] = temp;
	        for (int i = 0; i < n; i++) 
	        {
	            System.out.print(a[i] + " ");
	        }
	    }
	}
//	In this program, we first declare an array a containing the values 1 to 5. We then calculate the length of the array and store it in the variable n.
//
//	Next, we store the last element of the array in a temporary variable temp. We then iterate over the array from n-2 to 0, shifting each element one position to the right. This effectively moves all the elements in the array to the right by one position.
//
//	Finally, we set the first element of the array to temp, which contains the original last element of the array. We then iterate over the array and print each element, separated by a space.
//
//	The output of this program will be 5 1 2 3 4.or reverse Array







