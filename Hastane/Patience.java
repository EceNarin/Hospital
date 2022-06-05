package Hastane;

public class Patience extends Hospital{
private String pName;
private String PSurname;
private int pId;
									public Patience(String pName,String pSurname,int pId) {
										//super();
										this.pName = pName;
										this.PSurname = pSurname;
										this.pId = pId;
									}
									
									public String getpName() {
										return pName;
									}
									public void setpName(String pName) {
										this.pName = pName;
									}
									public String getPSurname() {
										return PSurname;
									}
									public void setPSurname(String pSurname) {
										PSurname = pSurname;
									}
									public int getpId() {
										return pId;
									}
									public void setpId(int pId) {
										this.pId = pId;
									}
       
}
