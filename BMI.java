package CSC1009_Lab.Lab_4;

public class BMI {
    // Constants
    static final double KILOGRAMS = 0.45359237;
    static final double METERS = 0.0254;

    // Attributes
    private double pounds;
    private double inches;
    private double kilograms;
    private double meters;
    private double BMI;

    // Operations
    // Default Constructor
    public BMI () {
        this.pounds = 150;
        this.inches = 75;
        this.kilograms = poundsToKilograms(this.pounds);
        this.meters = inchesToMeters(this.inches);
        this.BMI = calculateBMI(this.kilograms, this.meters);
    }

    public BMI (double p, double i) {
        this.pounds = p;
        this.inches = i;
        this.kilograms = poundsToKilograms(this.pounds);
        this.meters = inchesToMeters(this.inches);
        this.BMI = calculateBMI(this.kilograms, this.meters);
    }

    // Getters
    public double getPounds() { return this.pounds; }

    public double getInches() { return this.inches; }

    public double getKilograms() { return this.kilograms; }

    public double getMeters() { return this.meters; }

    public double getBMI() { return this.BMI; }

    // Setters
    public void setPounds(double p) { 
        this.pounds = p;
        this.kilograms = poundsToKilograms(this.pounds);
    }

    public void setInches(double i) { 
        this.inches = i;
        this.meters = inchesToMeters(this.inches);
    }

    // Misc.
    public double poundsToKilograms(double p) {
        return p * KILOGRAMS;
    }

    public double inchesToMeters(double i) {
        return i * METERS;
    }

    public double calculateBMI(double kg, double m) {
        return kg / Math.pow(m, 2);
    }

    public String bmiStatus(double bmi) {
        String status = "";
        if (bmi < 18.5) {
            status = "Underweight";
        }
        else if (bmi < 25.0) {
            status = "Normal";
        }
        else if (bmi < 30.0) {
            status = "Overweight";
        }
        else {
            status = "Obese";
        }
        return status;
    }
}
