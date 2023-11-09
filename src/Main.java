import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Weight in Kilograms : ");
        int weight = sc.nextInt();
        System.out.print("Enter Your Height in Meters : ");
        float height = sc.nextFloat();
        float bmi = weight/(height * height);
        System.out.print("Your BMI is ");
        System.out.printf("%.2f",bmi);
        System.out.print("\n");
        if(bmi<18.5)
        {
            System.out.println("Underweight");
        }
        else if(bmi>=18.5 && bmi<=24.9)
        {
            System.out.println("Normal Weight");
        }
        else if(bmi>=25 && bmi<=29.9)
        {
            System.out.println("Overweight");
        }
        else
        {
            System.out.println("Obese");
        }

    }
}