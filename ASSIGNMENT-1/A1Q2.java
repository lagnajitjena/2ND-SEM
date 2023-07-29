/* The body mass index (BMI) is commonly used by health and nutrition professionals to estimate 
   human body fat in populations. It is computed by taking the individual's weight (mass) in 
   kilograms and dividing it by the square of their height in meters. i.e.
   Metric: BMI = 𝑾𝒆𝒊𝒈𝒉𝒕 (𝒌𝒈)
  (𝑯𝒆𝒊𝒈𝒉𝒕)𝟐 (𝒎𝟐)
  Write a java program by using conditional statement to show the category for a given BMI.
                     Category BMI
            Less than 18.5 Underweight
            18.5 to 24.9 Normal Weight
            25.0 to 29.9 Overweight
            30.0 or more Obese */
import java.util.Scanner;
public class A1Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height in m and weight in kg");
        double h = sc.nextInt();
        double w = sc.nextInt();
        double bmi = w/(h*h);
        if(bmi<18.5){
            System.out.println("Underweight");
        }
        else if (bmi<24.9) {
            System.out.println("Normal weight");
        } 
        else if(bmi<29.9){
            System.out.println("Overweight");
        }
        else {
            System.out.println("Obese");
        }
        sc.close();
    }
}
