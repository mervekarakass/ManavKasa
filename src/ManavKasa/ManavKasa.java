package ManavKasa;
import java.util.Scanner;
public class ManavKasa {

	public static void main(String[] args) {
		double armut, elma , domates , muz, patlican, toplamtutar;
		double armutfiyat , elmafiyat , domatesfiyat , muzfiyat , patlicanfiyat;
		
		Scanner input = new Scanner(System.in);
		System.out.print("kac kilo armut aldiniz? : ");
		armut = input.nextDouble();
		armutfiyat = armut * 2.24;
		
		System.out.print("kac kilo elma aldiniz? : ");
		elma = input.nextDouble();
		elmafiyat = elma * 3.67;
		System.out.print("kac kilo domates aldiniz? : ");
		domates = input.nextDouble();
		domatesfiyat = domates * 1.11;
		System.out.print("kac kilo muz aldiniz? : ");
		muz = input.nextDouble();
		muzfiyat = muz * 0.95;
		System.out.print("kac kilo patlican aldiniz? : ");
		patlican = input.nextDouble();
		patlicanfiyat = patlican * 5;
		toplamtutar = armutfiyat + elmafiyat + domatesfiyat + muzfiyat + patlicanfiyat;
		System.out.println("toplam tutar: " +toplamtutar);
		

		
	}

}
