import java.util.*;
class DHKey
{
	public  static  void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter q:");
		int q=s.nextInt();
		System.out.println("Enter primitive root:");
		int alpha=s.nextInt();
		System.out.println("Enter private key of A:");
		int a=s.nextInt();
		System.out.println("Enter private key of B:");
		int b=s.nextInt();
		int A=(int)Math.pow(alpha,a)%q;
		int B=(int)Math.pow(alpha,b)%q;
		int key=(int)Math.pow(B,a)%q;
		System.out.println("Public key of A:\n"+A+"\nPublic key of B:\n"+B+"\nShared secret key:\n"+key);
	}
}