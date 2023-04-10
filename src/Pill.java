import java.util.Date;

public class Pill extends Drug{
    private String useMethod;

    public Pill(String name, String code, String manufacturerCountry, String ingredients, String quantity, String useMethod, Date manufacturedDate, Date expirationDate, Date registrationDate, String description) {
        super(name, code, manufacturerCountry, ingredients, quantity, manufacturedDate, expirationDate, registrationDate, description);
        this.useMethod = useMethod;
    }
    public String getUseMethod() {
        return useMethod;
    }
    public void setUseMethod(String useMethod) {
        this.useMethod = useMethod;
    }
}
