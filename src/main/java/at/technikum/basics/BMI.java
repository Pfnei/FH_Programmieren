package at.technikum;

import java.util.Scanner;

public class BMI {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        double height, weight, bmi;
        int cat;

        while (true){
            System.out.print("Weight [kg]: ");
            weight = sc.nextDouble();
            if (weight>=40) break;
            System.out.println("Du bist zu leicht;=)");
        }

        while (true){
            System.out.print("Height [m]: ");
            height = sc.nextDouble();
            if (height>=1.4) break;
            System.out.println("Du bist zu klein;=)");
        }

       bmi = bmiCalc(height, weight);
       cat =  bmiCategory (bmi);

       System.out.printf("m=%.2fkg, h= %.2fm, BMI = %.2f ", weight, height, bmi);
       bmiMessage(cat);
    }

    public static double bmiCalc(double height, double weight){
        double bmi = weight / (height*height);
        return bmi;
    }

    public static int bmiCategory(double bmi) {

       if (bmi<15) return 10;
       if (bmi >= 15 && bmi<16) return 11;
       if (bmi >= 16 && bmi<18.50) return 12;
       if (bmi >= 18.50 && bmi<25) return 20;
       if (bmi >= 25 && bmi<30) return 30;
       if (bmi >= 30 && bmi<35) return 40;
       if (bmi >= 35 && bmi<40) return 41;
       if (bmi>=40) return 42;
        return 0;
    }

    public static void bmiMessage(int bmiCategory) {
        switch (bmiCategory) {
            case 10:
                System.out.println("Very severely underweight");
                break;
            case 11:
                System.out.println("Severely underweight");
                break;
            case 12:
                System.out.println("Underweight");
                break;
            case 20:
                System.out.println("Normal");
                break;
            case 30:
                System.out.println("Overweight");
                break;
            case 40:
                System.out.println("Moderate obese");
                break;
            case 41:
                System.out.println("Severely obese");
                break;
            case 42:
                System.out.println("Very severely obese");
                break;


        }
    }
}
