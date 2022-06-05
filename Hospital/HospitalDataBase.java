package Hospital;

import java.util.ArrayList;

public class HospitalDataBase extends Hospital {
static  ArrayList<String> drData=new ArrayList<>();
static  ArrayList<String> ptData=new ArrayList<>();

 Patience patience;
 
 String pData;
 
 // doktor icin listeyi olusturdugumuz metdou yapalim 
 public static ArrayList<String> doctorList() {
	 Doctor doctor;
	 String dData;
	 doctor=new Doctor("Nilson","Avery","Allergist");
	 dData=doctor.getdName()+" "+doctor.getdSurname()+" "+doctor.getdBranch();
	 drData.add(dData);
	 doctor=new Doctor("John","Abel","Norolog");
	 dData=doctor.getdName()+" "+doctor.getdSurname()+" "+doctor.getdBranch();
	 drData.add(dData);
	 doctor=new Doctor("Robert","Erik","Genel Cerrah");
	 dData=doctor.getdName()+" "+doctor.getdSurname()+" "+doctor.getdBranch();
	 drData.add(dData);
	 doctor=new Doctor("Marry","Jacob","Cocuk Doktoru");
	 dData=doctor.getdName()+" "+doctor.getdSurname()+" "+doctor.getdBranch();
	 drData.add(dData);
	 doctor=new Doctor("Alan","Pedro","Dahiliye");
	 dData=doctor.getdName()+" "+doctor.getdSurname()+" "+doctor.getdBranch();
	 drData.add(dData);
	 doctor=new Doctor("Mahesh","Tristen","Cardiolog");
	 dData=doctor.getdName()+" "+doctor.getdSurname()+" "+doctor.getdBranch();
	 drData.add(dData);
	 return drData;
 }
 //Hasta listi olusrturudugumuz Metodu yapalim
 public static ArrayList<String> patienceList() {
	 Patience patience;
	 String   pData; 
	 patience=new Patience("Warren","Traven",111);
	 pData=patience.getpName()+" "+patience.getPSurname()+" "+patience.getpId();
	 ptData.add(pData);
	 patience=new Patience("Petanow","William",222);
	 pData=patience.getpName()+" "+patience.getPSurname()+" "+patience.getpId();
	 ptData.add(pData);
	 patience=new Patience("Sophia","George",333);
	 pData=patience.getpName()+" "+patience.getPSurname()+" "+patience.getpId();
	 ptData.add(pData);
	 patience=new Patience("Emma","Tristan",444);
	 pData=patience.getpName()+" "+patience.getPSurname()+" "+patience.getpId();
	 ptData.add(pData);
	 patience=new Patience("Darian","Luis",555);
	 pData=patience.getpName()+" "+patience.getPSurname()+" "+patience.getpId();
	 ptData.add(pData);
	 patience=new Patience("Peter","Cole",666);
	 pData=patience.getpName()+" "+patience.getPSurname()+" "+patience.getpId();
	 ptData.add(pData);
    return  ptData;
 }
 static String [] cirPat= {"Allerji", "Bas agrisi", "Diabet", "Soguk alginligi", "Migren", "Kalp hastaliklari"};
 static ArrayList<String> ptIlness=new ArrayList<>();
 public static  ArrayList<String> addIllnes(String[] cirPat) {
	 for(int i=0;i<cirPat.length;i++) {
		 ptIlness.add(i,patienceList().get(i)+" "+cirPat[i]);
	 }
	 return ptIlness;
 }
 public static void main(String[] args) {
	ArrayList<String> a=doctorList();
	int b=a.size();
	System.out.println(b );
	System.out.println(a);
	 for(int i=0;i <b;i++) {
		 System.out.println(i+" " +a.get(i));
	  }

	}
}