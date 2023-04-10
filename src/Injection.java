import java.util.Date;

public class Injection extends Drug{
    private String injectionMethod;

    public Injection(String name, String code, String manufacturerCountry, String ingredients, String quantity, String injectionMethod, Date manufacturedDate, Date expirationDate, Date registrationDate, String description) {
        super(name, code, manufacturerCountry, ingredients, quantity, manufacturedDate, expirationDate, registrationDate, description);
        this.injectionMethod = injectionMethod;
    }
    public String getInjectionMethod() {
        return injectionMethod;
    }
    public void setInjectionMethod(String injectionMethod) {
        this.injectionMethod = injectionMethod;
    }
}
