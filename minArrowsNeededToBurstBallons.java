class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));  // we need to sort the 2d array according to the end point .
        int arrow=1,end=points[0][1];
        for(int i=1;i<points.length;i++){
            if(end<points[i][0]){
                arrow++;
                end=points[i][1];
            }
        }
       return arrow; 
    }
}
