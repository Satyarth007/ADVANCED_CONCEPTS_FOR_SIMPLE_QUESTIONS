import java.util.Scanner;
public class isbn {
	
	public static boolean nisISBN(long n) {
		int idx=1;
		long sum=0;
		while(idx<=10) {
			sum+= idx*(n%10);
			n=n/10;
			idx++;
		}
		System.out.println(sum);
		return sum%11==0;
	}
	public static void main(String[] args) {
		// ISBN NUMBER
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER A 10-DIGIT NUMBER:- ");
		long n=sc.nextLong();
		boolean ans=nisISBN(n);
		if(ans) {
			System.out.println(n+" IS AN ISBN NUMBER.");
		}
		else {
			System.out.println("NOT AN ISBN NUMBER.");
		}
		

	}

}
