import java.util.*;

class Caesar
{
	public static void main(String a[])
	{
		int k=Integer.parseInt(a[1]);
		StringBuffer ans=new StringBuffer();
		System.out.println("Enter 1 for encryption\nEnter 2 for decryption");
		Scanner s=new Scanner(System.in);
		int c=s.nextInt();
		char tmp;
		if(c==1)
		{
		for(int i=0;i<a[0].length();i++)
		{
				tmp=(char)((((int)a[0].charAt(i)+k-97)%26)+97);
				ans.append(tmp);	
		}
		System.out.println("Encrypted Text: "+ans);
		}
		else
		{
			for(int i=0;i<a[0].length();i++)
		{
			if((int)a[0].charAt(i)-k-97>=0)
				tmp=(char)((((int)a[0].charAt(i)-k-97)%26)+97);
			else
				tmp=(char)((int)a[0].charAt(i)-k+26);
				ans.append(tmp);	
		}
			System.out.println("Decrypted Text: "+ans);
		}
		}
}