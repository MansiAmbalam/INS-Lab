import java.util.*;
class RailFence
{
	public static void main(String a[])
	{
		StringBuffer ans=new StringBuffer();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 1 for encryption or 2 for decryption:\n");
		int c=s.nextInt();
		if(c==1)
		{
		for(int i=0;i<a[0].length();i=i+2)
			ans.append(Character.toString(a[0].charAt(i)));
		for(int i=1;i<a[0].length();i=i+2)
			ans.append(Character.toString(a[0].charAt(i)));
		}
		else
		{
			int j;
			if(a[0].length()%2==0)
				j=(int)Math.ceil(a[0].length()/2);
			else
				j=a[0].length()/2;
			int k=0;
			for(int i=j;i<a[0].length();i++)
			{
				ans.append(Character.toString(a[0].charAt(k++)));
				ans.append(Character.toString(a[0].charAt(i)));
			}
		}
		System.out.println(ans);
	}
}