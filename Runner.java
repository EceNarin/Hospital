import java.util.Scanner;
/*
 * Öğrenci işleri sistemi:
 * 		Öğrenci kaydı:
 * 			Öğrenci objesi oluştur, konsoldan scan ile tek tek değer ata.
 * 			Objeyi ArrayList'e kaydet.
 * 			Bir sonraki öğrenci kaydı için tekrarla.
 * 			Öğrenci kaydetme döngüsünden çıkmak isteyene kadar bunları tekrarla.
 * 		Öğrenci Listesi:
 * 			ArrayList'in yazdırılması.
 */
public class Runner {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String lNumber;
		String lName;
		String lSurname;
		String fullName;
		// RegisterOffice.studentList();
		
		System.out.println("1  YENİ ÖĞRENCİ ÖN KAYIT\n2  ÖĞRENCİ GİRİŞİ\n3  AKADEMİSYEN GİRİŞİ");
		int choice = scan.nextInt();
		switch(choice) {
		case 1:
			register();
			break;
		case 2:
			System.out.println("Okul numaranız:");
			lNumber = scan.next();
			System.out.println("Adınız:");
			lName = scan.next();
			System.out.println("Soyadınız:");
			lSurname = scan.next();
			fullName = lName + " " + lSurname;
			
			if(RegisterOffice.login(lNumber, fullName)) {
				System.out.println(lName + ", Öğrenci bilgi sistemine hoş geldiniz.");
			}
			else {
				System.out.println("Sistemde kaydınız bulunmamaktadır. Öğrenci işleri ile iletişime geçiniz.");
			}
			break;
		case 3:
			
			break;
		}
		
		/*		
		// Professor
		Professor professor1 = new Professor();
		professor1.name = "Hoca Bitir";
		professor1.phone = "3131";
		professor1.email = "anlatkanka@dinliyoruz.com";
		//professor1.setSalary(10000);
		
		System.out.println(professor1.name);
		System.out.println("Adresiniz güncel mi: " + professor1.address.validate());
		System.out.println("Park izniniz var mı: " + professor1.parkPermit());
		System.out.println("Maaşınız: " + professor1.getSalary() + " Dolarlars");
		*/
	}
	
	public static void register() {
		
		Student newStudent = new Student();
		String rName, rSurname;
		String seminar;
		
		newStudent.sNumber = String.valueOf(RegisterOffice.STUDENT_BASE_NUMBER + RegisterOffice.loginData.size() + 1);
		
		System.out.println("Adınız:");
		rName = scan.next();
		System.out.println("Soyadınız:");
		rSurname = scan.next();
		newStudent.name = rName + " " + rSurname;
		
		System.out.println("Telefon numaranız:");
		newStudent.phone = scan.next();
		
		System.out.println("Email adresiniz:");
		newStudent.email = scan.next();
		
		System.out.println("Adresiniz:");
		System.out.println("Sokak:");
		newStudent.address.street = scan.next();
		System.out.println("Şehir:");
		newStudent.address.city = scan.next();
		System.out.println("Posta Kodu:");
		newStudent.address.postalCode = scan.next();
		System.out.println("Ülke:");
		newStudent.address.country = scan.next();
		System.out.println("Not Ortalamanız:");
		newStudent.averageMark = scan.nextInt();
		
		System.out.println("Katıldığınız Seminerler:");
		while(true) {
			seminar = scan.nextLine();
			newStudent.seminars.add(seminar);
			if(seminar.equals(".")) {
				break;
			}
		}
		
		RegisterOffice.studentData.add(newStudent);
		RegisterOffice.loginData.add(newStudent.sNumber + "-" + newStudent.name);
		for(int i = 0; i < RegisterOffice.studentData.size(); i++) {
			System.out.println(RegisterOffice.studentData.get(i).sNumber);
			System.out.println(RegisterOffice.studentData.get(i).name);
			System.out.println(RegisterOffice.studentData.get(i).phone);
			System.out.println(RegisterOffice.studentData.get(i).email);
			System.out.println(RegisterOffice.studentData.get(i).address.street);
			System.out.println(RegisterOffice.studentData.get(i).address.city);
			System.out.println(RegisterOffice.studentData.get(i).seminars);
		}
		System.out.println("Kayıt işleminiz tamamlandı.");
		//student1.sNumber = "23";
		
	}
}