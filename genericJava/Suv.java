package genericJava;
public class Suv extends Car {
    private boolean quatroPorQuatro;

    public Suv(String make, String model, int year, boolean quatroPorQuatro) {
        super(make, model, year);
        this.quatroPorQuatro = quatroPorQuatro;
    }
    
}
