
public class Person {
	 String name, phone, email;
	    
	    Address address = new Address();
	    
	    boolean parkPermit() {
	        return address.validate();
	        // Başka gereklilikler eklenebilir.
	    }
}
