import java.util.*;

public class Practice {
	public static void main(String[] args) {
		/* String str = "abcd"; */
		/*
		 * for(int i =str.length()-1; i>=0;i--) { System.out.print(str.charAt(i));
		 * 
		 * }
		 */
		/*
		 * char a[]=str.toCharArray(); for(int i=a.length-1;i>=0;i--){
		 * System.out.print(a[i]);
		 * 
		 * }
		 * 
		 * StringBuffer sb =new StringBuffer(str); System.out.println(sb.reverse());
		 */
		/*
		 * Scanner scan = new Scanner(System.in);
		 * System.out.println("Enter your string ");
		 * 
		 * 
		 * int num =scan.nextInt(); int org_num=num ;
		 * 
		 * 
		 * int rev=0; while(num!=0) { rev=rev*10+num%10; num=num/10; }
		 * 
		 * 
		 * if(org_num==rev){ System.out.println(rev+" number is palindrome");
		 * 
		 * }else { System.out.println(rev+" number is not palindrome"); } scan.close();
		 * 
		 * 
		 * String str = scan.next(); String org_str=str; String rev ="";
		 * 
		 * 
		 * for (int i = str.length() - 1; i >= 0; i--) { rev=rev+str.charAt(i);
		 */

		/* } System.out.println(rev); */

		/*
		 * if(rev.equals(org_str)) { System.out.println("true"); }else {
		 * System.out.println("false"); }
		 */
		/*
		 * int num=123456; String str = Integer.toString(num);
		 * System.out.println(str.length());
		 */
		/*
		 * Scanner scan = new Scanner(System.in);
		 * System.out.println("enter your number"); int i =scan.nextInt(); int
		 * odd_count=0; int even_count=0; while(i>0) { int rem=i%10; if(rem%2==0) {
		 * even_count++; }else { odd_count++; } i=i/10;
		 * 
		 * } System.out.println(even_count); System.out.println(odd_count);
		 */
		/*
		 * Scanner scan = new Scanner(System.in);
		 * System.out.println("enter your number"); int i =scan.nextInt(); int sum=0;
		 * while(i>0) { sum=sum+i%10; i=i/10; } System.out.println(sum);
		 */
		/*
		 * int i = 123456; int count=0; while(i>0) { i=i/10;
		 * 
		 * count++;
		 */
		/*
		 * int i = 123456789; int even_count = 0; int odd_count = 0; while (i > 0) { int
		 * rem = i % 10; if (rem % 2 == 0) { even_count++; } else { odd_count++; }
		 * i=i/10; } System.out.println(even_count); System.out.println(odd_count);
		 */
		/*
		 * int i =1234; int sum=0; while(i>0) { int rem=i%10; sum=sum+rem; i=i/10; }
		 */
		/*
		 * int a =10,b=2,c=4; if(a>b && a>c) { System.out.println("a is largest"); }else
		 * if(b>c && b>a){ System.out.println("b is largest");
		 * 
		 * }else { System.out.println("c is largest"); }
		 */
		/*
		 * int a=0; int b =1; int sum=0; System.out.print(a+" "+b); for(int
		 * i=2;i<10;i++) { sum=a+b;
		 * 
		 * a=b; b=sum; System.out.print(" "+sum);
		 */
		// }
		/*
		 * int num = 6; int count = 0; if (num > 1) { for (int i = 1; i <= num; i++) {
		 * if (num % i == 0) count++;
		 * 
		 * } if (count == 2) { System.out.println("prime"); } else {
		 * System.out.println("not prime"); } }else { System.out.println("not prime"); }
		 */
		/*
		 * Random ran = new Random(10); int n =ran.nextInt(100); System.out.println(n);
		 */
		/*
		 * int n =10; long b=1; for(int i=1;i<=n;i++) { b = b*i;
		 * 
		 * } System.out.println(b);
		 */
		
		/*
		 * int b[]= {1,2,3,4}; boolean status =true;
		 * 
		 * int sum=0; for(int i=0;i<a.length;i++) { sum=sum+a[i]; }
		 * System.out.println(sum);
		 * 
		 * 
		 * if(a.length==b.length) { for(int i =0;i<a.length;i++) { if(a[i]!=b[i]) {
		 * status=false; }
		 * 
		 * }
		 * 
		 * }else { status=false; }
		 * 
		 * System.out.println(status);
		 */
		/*
		 * int sum = 0; for (int i = 0; i < a.length; i++) { sum = sum + a[i]; }
		 * System.out.println(sum); int sum2 = 0; for (int i = 0; i <= 6; i++) { sum2 =
		 * sum2 + i; } System.out.println(sum2); if (sum2 == sum) {
		 * System.out.println(" there is no missing number in this array"); }else {
		 * System.out.println((sum2-sum)+" is missing number"); }
		 */
		/*
		 * int a[] = { 1, 2, 4, 5, 6 }; int max =a[0]; for(int i=1;i<a.length;i++) {
		 * if(a[i]>max) { max=a[i]; } }
		 */
		/*
		 * int a = 153,sum=0,temp,rem=0; temp=a; while(a!=0) { rem= a%10;
		 * sum=sum+(rem*rem*rem); a=a/10;
		 * 
		 * 
		 * }
		 */
		for(int i =1;i<=5;i++){
			for(int j=5;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
