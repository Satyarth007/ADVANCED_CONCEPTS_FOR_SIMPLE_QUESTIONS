//code by SATYARTH in ECLIPSE IDE.
// TRY TO LEARN STEP BY STEP IT IS EASY 
// AMAZON INTERVIEW QUESTION
import java.util.*;
public class target_in_infinte_array {

	public static void main(String[] args) {
		//Q:-SEARCHING AN ELEMENT IN INFINTE ARRAY 
		//HERE WE WILL USE BINARY SEARCH FOR OPTIMAL TIME COMPLEXITY.
		int [] arr= {3,5,7,9,10,90,100,140,203,500,85,
				99,44,33,88,101,154,75,99,10001,807,4,6};//here taking this array just for example.
		Arrays.sort(arr);// sorting bcz we are going to use binary search algo.
		int target=75;
		System.out.println(ans(arr,target));
		

	}
	static int ans(int []arr, int target) {
		int start=0;
		int end=1;
		// this loop will decide the next range in which we are going to search the target
		while(target>arr[end]) {
			int temp=end+1;
			end=end+(end-start+1)*2;
			start=temp;
		}
		return binarySearch(arr,target,start,end);
	}
	// simple binary search algorithm
	static int binarySearch(int[] arr,int target,int start,int end) {
		
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(arr[mid]==target) {
				return mid;
			}else if(arr[mid]<target) {
				start=mid+1;
			}else {
				end=mid-1;
			}
		}
		
		return -1;
	}

}
