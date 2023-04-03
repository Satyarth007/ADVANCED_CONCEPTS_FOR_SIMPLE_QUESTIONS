/* 
   1. sort the array
   2. make two pointers , left end and right (0 and array.length-1) 
   3. iterate till l crosses the r index
   4. now sum the left and right index values in people
   5. if sum <= limit : then simply increase the boat no. and update both pointers as l++ and r--
   6. else if sum > limit : then we need to send the heaviest person individually in the boat so just increase the boat count and decrease the right pointer i.e. r--
   7. return the boat count
   
*/




class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int count=0;
        int l=0;
        int r=people.length-1;
        while(l<=r){
            int sum=people[l]+people[r];
            if(sum<=limit){
                count++;
                l++;
                r--;
            }
            else if(sum>limit){
                count++;
                r--;
            }
        }
        return count;
    }
}
