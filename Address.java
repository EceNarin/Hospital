
public class Address {
    String street = "", city = "", postalCode = "", country = "";
    
    boolean validate() {
        if(street.equals("") || city.equals("") || postalCode.equals("")|| country.equals("")) {
            return false;
        }
        return true;
    }
    
    String label() {
        return street + " " + city + " " + postalCode + " " + country;
    }
}