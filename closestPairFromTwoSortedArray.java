// TWO POINTER APPROACH - T.C= O(n)
public class closestPairFromTwoSortedArray {
	public static void getClosest(int a[], int b[], int m,int n , int x) {
		int diff=Integer.MAX_VALUE;
		int i1=0 , i2=0;
		int l=0, r=n-1;
		
		while(l<m && r>=0) {
			if(Math.abs(a[l]+b[r]-x) < diff) {
				i1=l;
				i2=r;
				diff=Math.abs(a[l]+b[r]-x);
			}
			
			if(a[l]+b[r] > x)  r--;
			else l++;
		}
		
		System.out.println(i1 +" :: "+i2);
		
	}

	public static void main(String[] args) {
		int []a= {1,4,6,7};
		int []b= {10,20,30,40};
		int m=a.length;
		int n=b.length;
		int x=32;
		
		getClosest(a,b,m,n,x);
		
	}

}
