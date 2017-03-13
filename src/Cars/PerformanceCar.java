package Cars;

import java.util.List;

public class PerformanceCar extends Car{
    private static final String CAR_TYPE = "PerformanceCar";
    protected List<String> addOns;

    PerformanceCar(){

    }
    public PerformanceCar(String brand, String model, int yearOfProduction, int horsepower, int acceleration, int suspension, int durability){
        super(brand, model, yearOfProduction, horsepower, acceleration, suspension, durability);
        this.addOns = addOns;


    }

    public List<String> getAddOns() {
        return this.addOns;
    }

    public void setAddOns(List<String> addOns) {
        this.addOns = addOns;
    }

    @Override
    public int getHorsepower(){
        return this.horsepower;
    }

    public void setHorsepower(int horsepower){
        horsepower = horsepower +(horsepower * 50) /100;
        this.horsepower = horsepower;
    }

    @Override
    public int getSuspension(){
        return this.suspension;
    }

    public void setSuspension(int suspension){
        suspension = suspension -(suspension * 25)/100;
        this.suspension = suspension;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append(this.brand).append(" ").append(this.model).append(" ").append(this.yearOfProduction)
                .append(System.lineSeparator())
                .append(this.horsepower).append(" HP, 100 m/h in ").append(this.acceleration)
                .append(System.lineSeparator())
                .append(this.suspension).append(" Suspension force, ").append(this.durability).append(" Durability");


        return sb.toString();
    }

    public String getCarType(String CAR_TYPE){
        return this.CAR_TYPE;
    }



}
