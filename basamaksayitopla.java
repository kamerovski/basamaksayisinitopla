package bukodyazilmadanogrenilmez;

public class basamaksayitopla {

	public static void main(String[] args) {
		int a= 1643 , basamakSayisi = 0 , numberCounter = 0 , toplam = 0;
		
		while(a != 0) {
			
			toplam += (a%10);
			a /= 10;
			numberCounter++;
		}
		System.out.println(numberCounter);
		System.out.println(toplam);

	}

}
