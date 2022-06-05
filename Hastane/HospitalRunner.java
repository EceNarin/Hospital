package Hastane;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class HospitalRunner {
  static Scanner scan=new Scanner(System.in);
  static ArrayList <String> patience=new ArrayList<>();
  static HospitalDataBase dtbs=new HospitalDataBase();
  static String name1;
	public static void main(String[] args) {
	
	
		Doctor dr=new Doctor();
		System.out.println("Hastane Otomayonuna Hos Geldiniz! ");
		while(true) {
			System.out.println("Hasta girisi icin 1 \nDoktor girisi icin 2 tuslayiniz");
			switch(scan.nextInt()) {
			case 1:
				System.out.println("Lutfen bilgilerinizi giriniz");
				    String name=scan.next().toUpperCase();
				    String lName=scan.next().toUpperCase();
					String Id=scan.next();
				    String newPatience=name+" "+lName+" "+Id;
	                patience.add(newPatience);
	                System.out.println("Sayin " +name + " Otomasyon sistemine Hos Geldiniz ");
					System.out.println("Doktor Randevusu almak icin 1 \nRandevunuzu iptal etmek icin 2 tuslayin");
					switch(scan.nextInt()) {
					case 1:
						System.out.println("Doktorlarimiz\n===========================");
						dr.doctors();
						System.out.println("Randevu olusturmak icin seciminizi yapiniz");
						System.out.println("Sayin "+ name +" Doktorumuz " +dtbs.doctorList().get(scan.nextInt()-1) +"'a " 
						+ java.time.LocalDate.now() +" tairihinde kaydiniz alinmistir");
						break;
					}
			case 2:System.out.println("Sayin doktor Lutfen adinizi giriniz");
			mdControl(scan.next());
			break;

		           }
						System.out.println("Ana menuye donmek icin 1 \ncıkmak icin 9'u tuslayiniz");
					int num=scan.nextInt();
					if(num==1) {
						continue;
					}else if(num==9) {
						System.out.println("cıkıs yaptınız");
						break;
					}else {
						System.out.println("gecersiz islem yaptiniz. Sizi Ana menuye aktariyorum");
						continue;
					}
		}

		
	}

	private static void mdControl(String next) {
		for(int i=0;i<dtbs.doctorList().size();i++) {
			if(dtbs.doctorList().contains(scan.next())) {
				System.out.println("Sayin " + dtbs.doctorList().get(i) +" otomasyona hos geldiniz");
				System.out.println("Hasta vizite kontrolu icin ");
			}
		}
		
	}

	
}
