public abstract class Drug {
    private String name;
    private String id;
    private String country;
    private String ingredients;
    private String number;
    private String additional;
    private String manuDate;
    private String expDate;
    private String regDate;

    public Drug(String name, String id, String country, String ingredients, String number, String additional, String manuDate, String expDate, String regDate) {
        this.name = name;
        this.id = id;
        this.country = country;
        this.ingredients = ingredients;
        this.number = number;
        this.additional = additional;
        this.manuDate = manuDate;
        this.expDate = expDate;
        this.regDate = regDate;
    }


    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getId() {return id;}
    public void setId(String id) {this.id = id;}
    public String getCountry() {return country;}
    public void setCountry(String country) {this.country = country;}
    public String getIngredients() {return ingredients;}
    public void setIngredients(String ingredients) {this.ingredients = ingredients;}
    public String getNumber() {return number;}
    public void setNumber(String number) {this.number = number;}
    public String getAdditional() {return additional;}
    public void setAdditional(String additional) {this.additional = additional;}
    public String getManuDate() {return manuDate;}
    public void setManuDate(String manuDate) {this.manuDate = manuDate;}
    public String getExpDate() {return expDate;}
    public void setExpDate(String expDate) {this.expDate = expDate;}
    public String getRegDate() {return regDate;}
    public void setRegDate(String regDate) {this.regDate = regDate;}

    public static class Pill extends Drug{
        private static Pill instance;
        private String purpose;

        Pill(String name,
             String id,
             String country,
             String ingredients,
             String number,
             String purpose,
             String manDate,
             String expDate,
             String regDate,
             String additional) {
            super(name, id, country, ingredients, number, additional, manDate, expDate, regDate);
            this.purpose = purpose;
        }
        public static Pill getInstance(String name,
                                       String id,
                                       String country,
                                       String ingredients,
                                       String number,
                                       String purpose,
                                       String manDate,
                                       String expDate,
                                       String regDate,
                                       String additional) {
            if(instance==null){
                instance = new Pill(name, id, country, ingredients, number, purpose, manDate, expDate, regDate, additional);
            }
            return instance;
        }
        public String getPurpose() {
            return purpose;
        }
    }

    public static class Injection extends Drug{
        private static Injection instance;
        private String dose;

        Injection(String name,
                  String id,
                  String country,
                  String ingredients,
                  String number,
                  String dose,
                  String manDate,
                  String expDate,
                  String regDate,
                  String additional) {
            super(name, id, country, ingredients, number, additional, manDate, expDate, regDate);
            this.dose = dose;
        }
        public static Injection getInstance(String name,
                                       String id,
                                       String country,
                                       String ingredients,
                                       String number,
                                       String dose,
                                       String manDate,
                                       String expDate,
                                       String regDate,
                                       String additional) {
            if(instance==null){
                instance = new Injection(name, id, country, ingredients, number, dose, manDate, expDate, regDate, additional);
            }
            return instance;
        }
        public String getDose() {return dose;}
        public void setDose(String dose) {this.dose = dose;}
    }
}


