package Hastane;

public class Doctor extends Hospital{
 private String dName;
 private String dSurname;
 private String dBranch;
 static HospitalDataBase dtbs=new HospitalDataBase();
                  public Doctor(String dName, String dSurname, String dBranch) {
	              super();
	              this.dName = dName;
	              this.dSurname = dSurname;
	              this.dBranch = dBranch;
                         }
                  public Doctor() {
                	  //this.dName=getdName();
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
