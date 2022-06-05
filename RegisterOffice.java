
import java.util.ArrayList;
public class RegisterOffice {
    
    // TODO student objesini burada oluşturunca erişemiyoruz. Bir metot içindeyken erişebiliyoruz. Neden?
    
    static final int STUDENT_BASE_NUMBER = 1000;
    
    static ArrayList<String> loginData = new ArrayList<>();
    static ArrayList<Student> studentData = new ArrayList<>();
    
    public static boolean login(String lNumber, String lName) {
        String lData = lNumber + "-" + lName;
        System.out.println(lData);
        
        /*for(String s : studentData) {
            if(s.equals(lData)) {
                return true;
            }
        }*/ // Bu da çalışıyor.
        
        if(loginData.contains(lData)) {
            return true;
        }
        return false;
    }
    
    public static void studentList() {
        
        Student student;
        String sData;
        
        student = new Student("1001", "Ali Veli");
        sData = student.sNumber + "-" + student.name;
        loginData.add(sData);
        
        student = new Student("1002", "Ahmet Yılmaz");
        sData = student.sNumber + "-" + student.name;
        loginData.add(sData);
        
        student = new Student("1003", "Veli Mutlu");
        sData = student.sNumber + "-" + student.name;
        loginData.add(sData);
        
        student = new Student("1004", "Hüsamettin Fışfış");
        sData = student.sNumber + "-" + student.name;
        loginData.add(sData);
        
        student = new Student("1005", "Abdullah Kerim");
        sData = student.sNumber + "-" + student.name;
        loginData.add(sData);
        
        student = new Student("1006", "Ali Kerim");
        sData = student.sNumber + "-" + student.name;
        loginData.add(sData);
        
        student = new Student("1007", "Kemal Memik");
        sData = student.sNumber + "-" + student.name;
        loginData.add(sData);
        
        student = new Student("1008", "Kaya Kaya");
        sData = student.sNumber + "-" + student.name;
        loginData.add(sData);
        
        student = new Student("1009", "Hüseyin Taş");
        sData = student.sNumber + "-" + student.name;
        loginData.add(sData);
        
        student = new Student("1010", "Bekir Kelebek");
        sData = student.sNumber + "-" + student.name;
        loginData.add(sData);
        
        System.out.println(loginData);
    }
}