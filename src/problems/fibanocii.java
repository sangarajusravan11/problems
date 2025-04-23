package problems;
import java.util.*;
public class fibanocii {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int a=0;
		int b=1;
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			int c=a+b;
			b=a;
			a=c;
			System.out.print(c+" ");
		}
		
		
	}

}
