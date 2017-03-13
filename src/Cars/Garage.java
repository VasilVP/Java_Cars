package Cars;

import java.util.List;

public class Garage extends Car{
    public List<Car> parkedCars;

    public Garage() {

    }

    public Garage(String brand, String model, int yearOfProduction, int horsepower, int acceleration, int suspension, int durability){
        super(brand, model, yearOfProduction, horsepower, acceleration, suspension, durability);
        setParkedCars(parkedCars);
    }

    public List<Car> getParkedCars() {
        return this.parkedCars;
    }

    public void setParkedCars(List<Car> parkedCars) {
        this.parkedCars = parkedCars;
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
}
