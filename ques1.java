package practice;
import java.util.*;


public class ques1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int y=sc.nextInt();
		int count=0;
		while(n>0) {
			int rem=n%10;
			if (rem==y) {
				count++;
				
				
			}
			n=n/10;
		}
		System.out.println(count);
		// TODO Auto-generated method stub

	}

}
