package Lab_4;

public class BMI {
    //Static variables
    static final double KILO = 0.45359237;
    static final double METER = 0.0254;

    //Attributes
    private double pound;
    private double inches;
    private double weight;
    private double height;

    //Operations
    //Default constructor
    public BMI() {}

    public BMI(double pound, double inch) {
        this.pound = pound;
        this.inches = inch;
        this.weight = pound * KILO;
        this.height = inch * METER;
    }

    //Get
    public double getPound() {
        return this.pound;
    }

    public double getInches() {
        return this.inches;
    }

    public double getWeight() {
        return this.weight;
    }

    public double getHeight() {
        return this.height;
    }

    //Set
    public void setPound(double pound) {
        this.pound = pound;
        this.weight = pound * KILO;
    }

    public void setInches(double inch) {
        this.inches = inch;
        this.height = inch * METER;
    }

    //Misc.
    public double calculateBMI() {
        double BMI = this.weight / (this.height * this.height);
        return BMI;
    }
}
