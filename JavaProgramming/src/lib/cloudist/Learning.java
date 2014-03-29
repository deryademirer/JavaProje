package cloudist;
import java.util.Scanner;
public class Learning {

	public void Print()
	{
		System.out.println("Hello world");
	}
	
	
	//cümledeki kelime sayisi
	public static String kelimeSay(String a)
	{
		Scanner input=new Scanner(System.in);
		int b=0;
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)==' ' && a.charAt(i+1)!=' ' )
			{
				b=b+1;
			}
		}
		b=b+1; //cümledeki son kelimeyi burada ekliyoruz.
		String sayac=Integer.toString(b);
		return sayac;
	}

}
