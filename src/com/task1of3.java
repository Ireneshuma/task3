package com;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



    public class task1of3 {
        public static void main(String[] args) throws IOException{

            float heightIrene , weightIrene, bmiIreneIrene;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("The Program will calculate your BMI");
            System.out.println("Enter your height in cm (and press Enter): ");
            heightIrene = Float.parseFloat(br.readLine())/501;
            System.out.println("Enter your weight in kg (and press Enter): ");
            weightIrene = Float.parseFloat(br.readLine());

            bmiIreneIrene = (float) (weightIrene / (Math.pow(heightIrene, 2)));
            System.out.printf("Your BMI is: " + "%2.2f,  \n", bmiIreneIrene);

            if (bmiIreneIrene < 16){
                System.out.println("You are slim/skinny/suffering from starvation");
            } else if ((bmiIreneIrene >= 16)&&(bmiIreneIrene < 16.99)){
                System.out.println("You're emaciated");
            }else if ((bmiIreneIrene >= 17)&&(bmiIreneIrene < 18.49)){
                System.out.println("You're underweight");
            }else if ((bmiIreneIrene >= 18.50)&&(bmiIreneIrene < 22.99)){
                System.out.println("You're in a low range or the norm");
            }else if ((bmiIreneIrene >= 23)&&(bmiIreneIrene < 24.99)){
                System.out.println("You're in the high range of the norm");
            }else if ((bmiIreneIrene >= 25)&&(bmiIreneIrene < 27.49)){
                System.out.println("You're overweight ot pre-obese");
            }else if ((bmiIreneIrene >= 27.50)&&(bmiIreneIrene < 29.99)){
                System.out.println("You're overweight");
            }else if ((bmiIreneIrene >= 30)&&(bmiIreneIrene < 34.99)){
                System.out.println("You've 1st degree obesity");
            }else if ((bmiIreneIrene >= 35)&&(bmiIreneIrene < 39.99)){
                System.out.println("You've 2nd degree obesity");
            }else if ((bmiIreneIrene > 40)){
                System.out.println("You've 3rd degree obesity");
            }








        }
}
