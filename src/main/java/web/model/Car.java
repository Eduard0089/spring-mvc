package web.model;



public class Car {
    private String model;
    private int power;
    private int year;

    public Car() {};


    public Car(String model, int power, int year) {
        this.model = model;
        this.power = power;
        this.year = year;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public int getPower() {
        return power;
    }

    public int getYear() {
        return year;
    }
}

