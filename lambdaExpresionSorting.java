import java.util.Arrays;

public class lambdaExpresionSorting {

	public static void main(String[] args) {
		// VERY HELPFULL
		int arr[][]= {{1,3,4},{8,10,88},{7,8,2},{9,15,16},{2,6,55}};
		
		// sort according 0th column 
		// THIS LAMBDA EXPRESSION WILL SORT ACCORDING TO COLUMN PROVIDED AS INDEX  
		Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0])); // INDEXING WILL CHANGE THE SORTING COLUMN
		
		for(int i=0 ; i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		/*
		   OUTPUT :- 
		   ======
		   1  3   4 
           2  6   55 
		   7  8   2 
           8  10  88 
		   9  15  16 
		   
		 */
		
		// TRY CHANGING THE COLUMN INDEX .......
		

	}

}
