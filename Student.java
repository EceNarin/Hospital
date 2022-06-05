
import java.util.ArrayList;
public class Student extends Person {
    String sNumber;
    int averageMark;
    final int REQUIRED_MARK = 70;
    
    ArrayList<String> seminars = new ArrayList<>();
    
    public Student() {
        
    }
    
    public Student(String sNumber, String name) {
        this.sNumber = sNumber;
        this.name = name; // super.name veya this.name
    }
    
    boolean isEligible() {
        if(averageMark >= REQUIRED_MARK) {
            return true;
        }
        return false;
    }
    
    String getSeminarsTaken(int i) {
        
        return seminars.get(i);
    }
    
}