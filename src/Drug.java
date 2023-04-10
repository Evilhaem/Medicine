import java.util.Date;

public class Drug {
    private String name;
    private String code;
    private String manufacturerCountry;
    private String ingredients;
    private String quantity;
    private String description;
    private Date manufacturedDate;
    private Date expirationDate;
    private Date registrationDate;

    public Drug(String name, String code, String manufacturerCountry, String ingredients, String quantity, Date manufacturedDate, Date expirationDate, Date registrationDate, String description) {
        this.name = name;
        this.code = code;
        this.manufacturerCountry = manufacturerCountry;
        this.ingredients = ingredients;
        this.quantity = quantity;
        this.manufacturedDate = manufacturedDate;
        this.expirationDate = expirationDate;
        this.registrationDate = registrationDate;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getManufacturerCountry() {
        return manufacturerCountry;
    }

    public void setManufacturerCountry(String manufacturerCountry) {
        this.manufacturerCountry = manufacturerCountry;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public Date getManufacturedDate() {
        return manufacturedDate;
    }

    public void setManufacturedDate(Date manufacturedDate) {
        this.manufacturedDate = manufacturedDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
