public class DrugFactory {
    public static Drug createDrug(String request, String name, String id, String country, String ingredients, String number, String extra, String additional, String manuDate, String expDate, String regDate){
        Drug drug = null;
        if("PILL".equals(request)){
            drug = Drug.Pill.getInstance(name, id, country, ingredients, number, extra, additional, manuDate, expDate,regDate);
        }
        if("INJECTION".equals(request)){
            drug = Drug.Injection.getInstance(name, id, country, ingredients, number, extra, additional, manuDate, expDate,regDate);
        }
        return drug;
    }
}
