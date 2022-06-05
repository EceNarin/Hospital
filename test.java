import java.util.Arrays;

public  class test {

	public static void main(String[] args) {
		/*
		 Count the words in a String one by one
		 String is "Ali came to school and Ayse came to school"
		 Ali=1, came=2, to=2, school=2, and=1, Ayse=1
		 Alper Abi: else kısmında i'yi ilk b'ye getiriyoruz
		 Alper Abi: çünkü 2. a'ya da bakmasın diye
		[17:56, 14.04.2022] Alper Abi: ama bunu serinin sonunda yapamıyoruz
		[17:56, 14.04.2022] Alper Abi: çünkü en sonda olduğu içi başka farklı kelimeye rastlayamıyor
		[17:57, 14.04.2022] Alper Abi: eğer serinin sonunda birden fazla aynı kelimeden varsa ilkine baktıktan sonra aynı olanları atlayamıyor o yüzden
		[17:57, 14.04.2022] Alper Abi: biz de napıcaz
		[17:57, 14.04.2022] Alper Abi: şunu yapıcaz aynıları sayıyor ya count++ diyoruz
		[17:57, 14.04.2022] Alper Abi: o countun altına gelip
		[17:57, 14.04.2022] Alper Abi: diycez ki if j = length -1
		[17:57, 14.04.2022] Alper Abi: yani j sondaki elemana varmışsa
		[17:57, 14.04.2022] Alper Abi: i = j diycez
		[17:57, 14.04.2022] Alper Abi: i'yi sona taşıyacaz
		[17:58, 14.04.2022] Alper Abi: if(j == arr.length-1) {
		i = j;
		}*/
		/*
		 * Not: 1. Ve 2 soru için tek bir main ve tek bir proje yapısı kullanınız.
		 *  Dikdörtgen şekline ait değerleri saklayabilecek ve bu değerlere göre hesaplamalar yapabilecek bir sınıf yazın. 
		 *  Bu sınıfın tüm üye verileri private, tüm üye fonksiyonları da public etiketi altında yer almalıdır.
		 *  Buna göre, boyutları (3,4) ve (5,6) olan iki dikdörtgen oluşturun. 
		 *  Bu dikdörtgenlerin çevrelerini ve alanlarını hesaplayıp ekranda yazdırabilecek uygun fonksiyonları sınıfa yerleştirin ve çalışmasını gösterin.
		 *  Not: 3 Farklı kaynak dosyası oluşturunuz, int main () fonksiyonunun çalıştığı dosyada herhangi bir sınıf oluşturmayınız. Sadece çağırma işlemlerini yapınız.
		 Count the words in a String one by one
		 String is "Ali came to school and Ayse came to school"
		 Ali=1, came=2, to=2, school=2, and=1, Ayse=1
		*/
	       
			
			String str="Ali came to school and Ayse came to school";
			String [] arr=str.split(" ");
			Arrays.sort(arr);
			System.out.println(Arrays.toString(arr));
			int count=0;
			for(int i=0;i<arr.length;i++) {
					count=1;
					for(int j=i+1;j<arr.length;j++) {
						if(arr[i].equals(arr[j])) {
							count++;
							// Eklenen düzeltme başlangıcı
							if(j==arr.length-1) {
								i=j;
							}
							// Eklenen düzeltme sonu
						}else {
							i=j-1;
							break;
						}
				}
					System.out.println(arr[i]+ " = "+count);
					
			}
		
      
	/*	String str="Ali came to school and Ayse came to school";
		String [] arr=str.split(" ");
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int count=0;
		for(int i=0;i<arr.length;i++) {
				count=1;
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i].equals(arr[j])) {
						count++;
					}else {
						i=j-1;
						break;
					}
			}
				System.out.println(arr[i]+ " = "+count);
				
		}*/

	}

}
