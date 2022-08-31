/* 	QUESTION :- Given an array arr[] of size N having distinct numbers sorted in 
   increasing order and the array has been right rotated 
   (i.e, the last element will be cyclically shifted to the starting position of the array)
   k number of times, the task is to find the value of k.*/
public class noOfTimesSortedArrayRotated {
	public static int rotationCount(int []arr,int n) {
		int low = 0, high = n - 1;
        while (low <= high) {
 
            int mid = low + (high - low) / 2;
            int prev = (mid - 1 + n) % n;
            int next = (mid + 1) % n;
 
            if (arr[mid] <= arr[prev]
                && arr[mid] <= arr[next])
                return mid;
            else if (arr[mid] <= arr[high])
                high = mid - 1;
            else if (arr[mid] >= arr[low])
                low = mid + 1;
        }
        return -1;
	}

	public static void main(String[] args) {
		//CONCEPT :- count == index of least element
		int arr[]= {11,12,15,18,2,5,6,8};
		int n=arr.length;
		int ans=rotationCount(arr,n);
		System.out.println(ans);

	}

}
