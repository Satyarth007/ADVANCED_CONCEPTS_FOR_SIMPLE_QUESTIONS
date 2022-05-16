//code by - SATYARTH
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        //I am using binary search approach 
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
 // this 'if' block solves problem for getting into decreasing part of array  
// if we are in decreasing part then check for the left part and update the end value 
 // update the end value to mid coz from there only we have to find the peak value 
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
 // this 'if' block solves problem for getting into increasing part of array  
 // if we are in increasing part then check for the right part and update the start value 
 // update the start value to mid+1 coz from there only we have to find the peak value           
            else if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
        }
 //finally return any start or end , coz answer is at start==end       
        return start; 
    }
}
