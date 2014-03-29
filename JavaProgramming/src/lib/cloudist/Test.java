package cloudist;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		Learning obj=new Learning();
		obj.Print();
		
		// cümledeki kelime sayisi
		System.out.println("Bir cümle giriniz:");
		String cumle=input.nextLine();	
		System.out.println("Kelime sayısı:"+obj.kelimeSay(cumle));

	}

}
