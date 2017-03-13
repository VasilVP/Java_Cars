package Cars;


public class Car {

    public String brand;
    public String model;
    public int yearOfProduction;
    public int horsepower;
    public int acceleration;
    public int suspension;
    public int durability;

    public Car() {

    }

    public Car(String brand, String model, int yearOfProduction, int horsepower, int acceleration, int suspension, int durability) {
        //setBrand(brand);
        this.brand = brand;
        //setModel(model);
        this.model = model;
        //setYearOfProduction(yearOfProduction);
        this.yearOfProduction = yearOfProduction;
        //setHorsepower(horsepower);
        this.horsepower = horsepower;
        //setAcceleration(acceleration);
        this.acceleration = acceleration;
        //setSuspension(suspension);
        this.suspension = suspension;
        //setDurability(durability);
        this.durability = durability;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfProduction() {
        return this.yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public int getHorsepower() {
        return this.horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public int getAcceleration() {
        return this.acceleration;
    }

    public void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
    }

    public int getSuspension() {
        return this.suspension;
    }

    public void setSuspension(int suspension) {
        this.suspension = suspension;
    }

    public int getDurability() {
        return this.durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
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
