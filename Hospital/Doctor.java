package Hospital;

import java.util.ArrayList;

import Hastane.Hospital;

public class Doctor extends Hospital{
 private String dName;
 private String dSurname;
 private String dBranch;
 private ArrayList<String> drAppointment = new ArrayList<>();
 
 
 public ArrayList<String> getDrAppointment() {
	 // TODO dName için appo listesi getirsin
	return drAppointment;
}
 
public void addDrAppointment(String newAppo) {
	this.drAppointment.add(newAppo);
}


static HospitalDataBase dtbs=new HospitalDataBase();
                  public Doctor(String dName, String dSurname, String dBranch) {
	              super();
	              this.dName = dName;
	              this.dSurname = dSurname;
	              this.dBranch = dBranch;
                         }
                  public Doctor() {

                  }
                  
                  public Doctor(String dName) {
                	  this.dName = dName;
                  }
                  
				public String getdName() {
					return dName;
				}
				public void setdName(String dName) {
					this.dName = dName;
				}
				public String getdSurname() {
					return dSurname;
				}
				public void setdSurname(String dSurname) {
					this.dSurname = dSurname;
				}
				public String getdBranch() {
					return dBranch;
				}
				public void setdBranch(String dBranch) {
					this.dBranch = dBranch;
				}
				public void drAppointment(int num) {
					dtbs.drData.get(num);
				}
				public static void doctors(){
					  for(int i=0;i <6;i++) {
						 System.out.println(i+1+" "+ dtbs.doctorList().get(i));
					  }
				  }
}