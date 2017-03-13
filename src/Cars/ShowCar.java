package Cars;


public class ShowCar extends Car {
    public int stars;

    public ShowCar(){}

    public ShowCar(String brand, String model, int yearOfProduction, int horsepower, int acceleration, int suspension, int durability){
        super(brand, model, yearOfProduction, horsepower, acceleration, suspension, durability);
        //setStars(stars);
        this.stars = stars;
    }

    public int getStars() {
        return this.stars;
    }

    public void setStars(Integer stars) {
        this.stars = stars;
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
