package Hastane;

import java.util.ArrayList;
import java.util.Scanner;

public class Hospital {
static Scanner scan=new Scanner(System.in);
static StringBuilder sb=new StringBuilder();
static final int DOCTOR_DAİLY_APPOİNTMET = 2;
//String dName,String dSurName,String dBranch
  static Doctor dr1=new Doctor();
  private static HospitalDataBase database=new HospitalDataBase();
  //String ad=scan.next();
  //String soyAd=scan.next();
  //int tc=scan.nextInt();
  //String newHasta=ad+" "+soyAd+" "+ tc;
 public static void appointment(String newHasta, int num ) {
	  ArrayList<String> appoinmentList=new ArrayList<>();
	 if(dr1.getDatabase().doctorList().get(num)==null) {
		  if(appoinmentList.size()<3) {
			  appoinmentList.add(newHasta);
		  }else {
			  System.out.println("sectiginiz doktorun randevu listesi dolmustur");
		  }
	  }
  }
public static HospitalDataBase getDatabase() {
	return database;
}
public static void setDatabase(HospitalDataBase database) {
	Hospital.database = database;
}
  
  

 

  
}
