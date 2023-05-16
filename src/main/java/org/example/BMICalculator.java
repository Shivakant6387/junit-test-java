package org.example;

public class BMICalculator {
    public double calculateBMI(double height, double weight) {
        return weight / (height * height);
    }

    public boolean isUnderweight(double bmi) {
        return bmi < 18.5;
    }

    public boolean isNormalWeight(double bmi) {
        return bmi >= 18.5 && bmi < 25;
    }

}
