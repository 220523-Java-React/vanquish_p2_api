import java.util.Scanner;

public class Driver {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("MyBodyReader");
        System.out.println();
        System.out.println("Select a unit of measure");
        System.out.print("1 for US(in and lbs), 2 for Metric(cm and kg): ");
        int measurement = scan.nextInt();
        System.out.println("Select a gender");
        System.out.print("1 for male, 2 for female: ");
        int gender = scan.nextInt();
        System.out.print("Enter your age: ");
        double age = scan.nextDouble();
        System.out.print("Enter your height: ");
        double height = scan.nextDouble();
        System.out.print("Enter your weight: ");
        double weight = scan.nextDouble();
        System.out.print("Enter your waist circumference: ");
        double waist = scan.nextDouble();
        System.out.print("Enter your neck circumference: ");
        double neck = scan.nextDouble();
        System.out.print("Enter your hip circumference: ");
        double hip = scan.nextDouble();
        System.out.println("Enter activity level");
        System.out.println("1 for sedentary, 2 for lightly active,");
        System.out.println("3 for moderately active, 4 for very active,");
        System.out.print("5 for extremely active: ");
        int active = scan .nextInt();
        System.out.println("Enter your weight goal");
        System.out.println("1 for lose fast, 2 for lose normal,");
        System.out.println("3 for maintain, 4 for gain normal,");
        System.out.print("5 for gain fast: ");
        int plan = scan.nextInt();

        double bmi, bfp, fm, lm, whe, whi, bmr, need, start, ibw, bsa;
        bmi = 0;
        bfp = 0;
        fm = 0;
        lm = 0;
        whe = 0;
        whi = 0;
        bmr = 0;
        need = 0;
        start = 0;
        ibw = 0;
        bsa = 0;
        double carbs, proteins, fats, water;
        water = 0;
        double vitaminA, vitaminC, vitaminD, vitaminE, vitaminK, vitaminB1, vitaminB2, vitaminB3, vitaminB5, vitaminB7, vitaminB6, vitaminB12, vitaminB9, choline;
        vitaminA = 0;
        vitaminC = 0;
        vitaminD = 0;
        vitaminE = 0;
        vitaminK = 0;
        vitaminB1 = 0;
        vitaminB2 = 0;
        vitaminB3 = 0;
        vitaminB5 = 0;
        vitaminB7 = 0;
        vitaminB6 = 0;
        vitaminB12 = 0;
        vitaminB9 = 0;
        choline = 0;
        double magnesium, calcium, zinc, iron, copper, selenium, manganese, phosphorus, potassium, iodine, chromium, molybdenum, sodium, fluoride, chloride;
        magnesium = 0;
        calcium = 0;
        zinc = 0;
        iron = 0;
        copper = 0;
        selenium = 0;
        manganese = 0;
        phosphorus = 0;
        potassium = 0;
        iodine = 0;
        chromium = 0;
        molybdenum = 0;
        fluoride = 0;
        sodium = 2300;
        chloride = 0;

        String bmiRead = null;
        String bfRead = null;
        String wheRead = null;
        String whiRead = null;
        String m = null;
        String n = null;




        switch (measurement)
        {
            case 1:
                switch (gender) {
                    case 1 -> {
                        bsa = Math.sqrt(((height * 2.54) * (weight / 2.205)) / 3600);
                        ibw = (50 + (0.91 * ((height * 2.54) - 152.4))) * 2.205;
                        m = "lbs";
                        n = "in";
                        bmi = (703 * weight) / (height * height);
                        bfp = (495 / (1.0324 - 0.19077 * Math.log10((2.54 * waist) - (2.54 * neck)) + 0.15456 * Math.log10(2.54 * height))) - 450;
                        fm = (bfp * .01) * weight;
                        lm = weight - fm;
                        whe = waist / height;
                        whi = waist / hip;
                        bmr = 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);
                        water = (weight * (0.5));
                        if (bmi < 15) {
                            bmiRead = "Based On Your BMI, You Are Very Severely Underweight.";
                        }
                        if (bmi >= 15 && bmi < 16) {
                            bmiRead = "Based On Your BMI, You Are Severely Underweight.";
                        }
                        if (bmi >= 16 && bmi < 18.5) {
                            bmiRead = "Based On Your BMI, You Are Underweight.";
                        }
                        if (bmi >= 18.5 && bmi < 25) {
                            bmiRead = "Based On Your BMI, You Are Normal.";
                        }
                        if (bmi > 25 && bmi < 30) {
                            bmiRead = "Based On Your BMI, You Are Overweight.";
                        }
                        if (bmi >= 30 && bmi < 35) {
                            bmiRead = "Based On Your BMI, You Are Moderately Obese.";
                        }
                        if (bmi >= 35 && bmi < 40) {
                            bmiRead = "Based On Your BMI, You Are Severely Obese.";
                        }
                        if (bmi >= 40) {
                            bmiRead = "Based On Your BMI, You Are Very Severely Obese.";
                        }
                        if (bfp < 6) {
                            bfRead = "Based On Your Body Fat Percentage, You Have Only Essential Fat.";
                        }
                        if (bfp >= 6 && bfp < 14) {
                            bfRead = "Based On Your Body Fat Percentage, You're An Athlete.";
                        }
                        if (bfp >= 14 && bfp < 18) {
                            bfRead = "Based On Your Body Fat Percentage, You're Fit";
                        }
                        if (bfp >= 18 && bfp < 25) {
                            bfRead = "Based On Your Body Fat Percentage, You're Average";
                        }
                        if (bfp >= 25) {
                            bfRead = "Based On Your Body Fat Percentage, You're Obese";
                        }
                        if (whe >= 0.63) {
                            wheRead = "Based On Your Waist To Height Ratio, You Are Highly Obese.";
                        }
                        if (whe < 0.63 && whe >= 0.58) {
                            wheRead = "Based On Your Waist To Height Ratio, You Are Extremely Overweight.";
                        }
                        if (whe < 0.58 && whe >= 0.53) {
                            wheRead = "Based On Your Waist To Height Ratio, You Are Overweight.";
                        }
                        if (whe < 0.53 && whe >= 0.46) {
                            wheRead = "Based On Your Waist To Height Ratio, You Are Healthy.";
                        }
                        if (whe < 0.46 && whe >= 0.43) {
                            wheRead = "Based On Your Waist To Height Ratio, You Are Slender And Healthy.";
                        }
                        if (whe < 0.43 && whe >= 0.35) {
                            wheRead = "Based On Your Waist To Height Ratio, You Are Extremely Slim.";
                        }
                        if (whe < 0.35) {
                            wheRead = "Based On Your Waist To Height Ratio, You Are Abnormally Slim.";
                        }
                        if (whi < 0.85) {
                            whiRead = "Your Waist To Hip Ratio Is Excellent.";
                        }
                        if (whi >= 0.85 && whi < 0.90) {
                            whiRead = "Your Waist To Hip Ratio Is Good.";
                        }
                        if (whi >= 0.90 && whi < 0.95) {
                            whiRead = "Your Waist To Hip Ratio Is Average.";
                        }
                        if (whi >= 0.95) {
                            whiRead = "Your Waist To Hip Ratio Is Bad.";
                        }
                    }
                    case 2 -> {
                        bsa = Math.sqrt(((height * 2.54) * (weight / 2.205)) / 3600);
                        ibw = (45.5 + (0.91 * ((height * 2.54) - 152.4))) * 2.205;
                        m = "lbs";
                        n = "in";
                        bmi = (703 * weight) / (height * height);
                        bfp = (495 / (1.29579 - 0.35004 * Math.log10((2.54 * waist) + (2.54 * hip) - (2.54 * neck)) + 0.22100 * Math.log10(2.54 * height))) - 450;
                        fm = (bfp * .01) * weight;
                        lm = weight - fm;
                        whe = waist / height;
                        whi = waist / hip;
                        bmr = 655 + (4.3 * weight) + (4.7 * height) - (4.7 * age);
                        water = (weight * (0.5));
                        if (bmi < 15) {
                            bmiRead = "Based On Your BMI, You Are Very Severely Underweight.";
                        }
                        if (bmi >= 15 && bmi < 16) {
                            bmiRead = "Based On Your BMI, You Are Severely Underweight.";
                        }
                        if (bmi >= 16 && bmi < 18.5) {
                            bmiRead = "Based On Your BMI, You Are Underweight.";
                        }
                        if (bmi >= 18.5 && bmi < 25) {
                            bmiRead = "Based On Your BMI, You Are Normal.";
                        }
                        if (bmi > 25 && bmi < 30) {
                            bmiRead = "Based On Your BMI, You Are Overweight.";
                        }
                        if (bmi >= 30 && bmi < 35) {
                            bmiRead = "Based On Your BMI, You Are Moderately Obese.";
                        }
                        if (bmi >= 35 && bmi < 40) {
                            bmiRead = "Based On Your BMI, You Are Severely Obese.";
                        }
                        if (bmi >= 40) {
                            bmiRead = "Based On Your BMI, You Are Very Severely Obese.";
                        }
                        if (bfp < 14) {
                            bfRead = "Based On Your Body Fat Percentage, You Have Only Essential Fat.";
                        }
                        if (bfp >= 14 && bfp < 21) {
                            bfRead = "Based On Your Body Fat Percentage, You're An Athlete.";
                        }
                        if (bfp >= 21 && bfp < 25) {
                            bfRead = "Based On Your Body Fat Percentage, You're Fit";
                        }
                        if (bfp >= 25 && bfp < 32) {
                            bfRead = "Based On Your Body Fat Percentage, You're Average";
                        }
                        if (bfp >= 32) {
                            bfRead = "Based On Your Body Fat Percentage, You're Obese";
                        }
                        if (whe >= 0.58) {
                            wheRead = "Based On Your Waist To Height Ratio, You Are Highly Obese.";
                        }
                        if (whe < 0.58 && whe >= 0.54) {
                            wheRead = "Based On Your Waist To Height Ratio, You Are Extremely Overweight.";
                        }
                        if (whe < 0.54 && whe >= 0.49) {
                            wheRead = "Based On Your Waist To Height Ratio, You Are Overweight.";
                        }
                        if (whe < 0.49 && whe >= 0.46) {
                            wheRead = "Based On Your Waist To Height Ratio, You Are Healthy.";
                        }
                        if (whe < 0.46 && whe >= 0.42) {
                            wheRead = "Based On Your Waist To Height Ratio, You Are Slender And Healthy.";
                        }
                        if (whe < 0.42 && whe >= 0.35) {
                            wheRead = "Based On Your Waist To Height Ratio, You Are Extremely Slim.";
                        }
                        if (whe < 0.35) {
                            wheRead = "Based On Your Waist To Height Ratio, You Are Abnormally Slim.";
                        }
                        if (whi < 0.75) {
                            whiRead = "Your Waist To Hip Ratio Is Excellent.";
                        }
                        if (whi >= 0.75 && whi < 0.80) {
                            whiRead = "Your Waist To Hip Ratio Is Good.";
                        }
                        if (whi >= 0.80 && whi < 0.86) {
                            whiRead = "Your Waist To Hip Ratio Is Average.";
                        }
                        if (whi >= 0.86) {
                            whiRead = "Your Waist To Hip Ratio Is Bad.";
                        }
                    }
                }
                break;
            case 2:
                switch (gender) {
                    case 1 -> {
                        bsa = Math.sqrt((height * weight) / 3600);
                        ibw = 50 + (0.91 * (height - 152.4));
                        m = "kg";
                        n = "cm";
                        bmi = (weight / (height * height)) * 10000;
                        bfp = (495 / (1.0324 - 0.19077 * Math.log10(waist - neck) + 0.15456 * Math.log10(height))) - 450;
                        fm = (bfp * .01) * weight;
                        lm = weight - fm;
                        whe = waist / height;
                        whi = waist / hip;
                        bmr = 66 + (6.3 * (weight / 2.205)) + (12.9 * (height / 2.54)) - (6.8 * age);
                        water = ((weight * 2.205) * (0.5));
                        if (bmi < 15) {
                            bmiRead = "Based On Your BMI, You Are Very Severely Underweight.";
                        }
                        if (bmi >= 15 && bmi < 16) {
                            bmiRead = "Based On Your BMI, You Are Severely Underweight.";
                        }
                        if (bmi >= 16 && bmi < 18.5) {
                            bmiRead = "Based On Your BMI, You Are Underweight.";
                        }
                        if (bmi >= 18.5 && bmi < 25) {
                            bmiRead = "Based On Your BMI, You Are Normal.";
                        }
                        if (bmi > 25 && bmi < 30) {
                            bmiRead = "Based On Your BMI, You Are Overweight.";
                        }
                        if (bmi >= 30 && bmi < 35) {
                            bmiRead = "Based On Your BMI, You Are Moderately Obese.";
                        }
                        if (bmi >= 35 && bmi < 40) {
                            bmiRead = "Based On Your BMI, You Are Severely Obese.";
                        }
                        if (bmi >= 40) {
                            bmiRead = "Based On Your BMI, You Are Very Severely Obese.";
                        }
                        if (bfp < 6) {
                            bfRead = "Based On Your Body Fat Percentage, You Have Only Essential Fat.";
                        }
                        if (bfp >= 6 && bfp < 14) {
                            bfRead = "Based On Your Body Fat Percentage, You're An Athlete.";
                        }
                        if (bfp >= 14 && bfp < 18) {
                            bfRead = "Based On Your Body Fat Percentage, You're Fit";
                        }
                        if (bfp >= 18 && bfp < 25) {
                            bfRead = "Based On Your Body Fat Percentage, You're Average";
                        }
                        if (bfp >= 25) {
                            bfRead = "Based On Your Body Fat Percentage, You're Obese";
                        }
                        if (whe >= 0.63) {
                            wheRead = "Based On Your Waist To Height Ratio, You Are Highly Obese.";
                        }
                        if (whe < 0.63 && whe >= 0.58) {
                            wheRead = "Based On Your Waist To Height Ratio, You Are Extremely Overweight.";
                        }
                        if (whe < 0.58 && whe >= 0.53) {
                            wheRead = "Based On Your Waist To Height Ratio, You Are Overweight.";
                        }
                        if (whe < 0.53 && whe >= 0.46) {
                            wheRead = "Based On Your Waist To Height Ratio, You Are Healthy.";
                        }
                        if (whe < 0.46 && whe >= 0.43) {
                            wheRead = "Based On Your Waist To Height Ratio, You Are Slender And Healthy.";
                        }
                        if (whe < 0.43 && whe >= 0.35) {
                            wheRead = "Based On Your Waist To Height Ratio, You Are Extremely Slim.";
                        }
                        if (whe < 0.35) {
                            wheRead = "Based On Your Waist To Height Ratio, You Are Abnormally Slim.";
                        }
                        if (whi < 0.85) {
                            whiRead = "Your Waist To Hip Ratio Is Excellent.";
                        }
                        if (whi >= 0.85 && whi < 0.90) {
                            whiRead = "Your Waist To Hip Ratio Is Good.";
                        }
                        if (whi >= 0.90 && whi < 0.95) {
                            whiRead = "Your Waist To Hip Ratio Is Average.";
                        }
                        if (whi >= 0.95) {
                            whiRead = "Your Waist To Hip Ratio Is Bad.";
                        }
                    }
                    case 2 -> {
                        bsa = Math.sqrt((height * weight) / 3600);
                        ibw = 45.5 + (0.91 * (height - 152.4));
                        m = "kg";
                        n = "cm";
                        bmi = (weight / (height * height)) * 10000;
                        bfp = (495 / (1.29579 - 0.35004 * Math.log10(waist + hip - neck) + 0.22100 * Math.log10(height))) - 450;
                        fm = (bfp * .01) * weight;
                        lm = weight - fm;
                        whe = waist / height;
                        whi = waist / hip;
                        bmr = 655 + (4.3 * (weight / 2.205)) + (4.7 * (height / 2.54)) - (4.7 * age);
                        water = ((weight * 2.205) * (0.5));
                        if (bmi < 15) {
                            bmiRead = "Based On Your BMI, You Are Very Severely Underweight.";
                        }
                        if (bmi >= 15 && bmi < 16) {
                            bmiRead = "Based On Your BMI, You Are Severely Underweight.";
                        }
                        if (bmi >= 16 && bmi < 18.5) {
                            bmiRead = "Based On Your BMI, You Are Underweight.";
                        }
                        if (bmi >= 18.5 && bmi < 25) {
                            bmiRead = "Based On Your BMI, You Are Normal.";
                        }
                        if (bmi > 25 && bmi < 30) {
                            bmiRead = "Based On Your BMI, You Are Overweight.";
                        }
                        if (bmi >= 30 && bmi < 35) {
                            bmiRead = "Based On Your BMI, You Are Moderately Obese.";
                        }
                        if (bmi >= 35 && bmi < 40) {
                            bmiRead = "Based On Your BMI, You Are Severely Obese.";
                        }
                        if (bmi >= 40) {
                            bmiRead = "Based On Your BMI, You Are Very Severely Obese.";
                        }
                        if (bfp < 14) {
                            bfRead = "Based On Your Body Fat Percentage, You Have Only Essential Fat.";
                        }
                        if (bfp >= 14 && bfp < 21) {
                            bfRead = "Based On Your Body Fat Percentage, You're An Athlete.";
                        }
                        if (bfp >= 21 && bfp < 25) {
                            bfRead = "Based On Your Body Fat Percentage, You're Fit";
                        }
                        if (bfp >= 25 && bfp < 32) {
                            bfRead = "Based On Your Body Fat Percentage, You're Average";
                        }
                        if (bfp >= 32) {
                            bfRead = "Based On Your Body Fat Percentage, You're Obese";
                        }
                        if (whe >= 0.58) {
                            wheRead = "Based On Your Waist To Height Ratio, You Are Highly Obese.";
                        }
                        if (whe < 0.58 && whe >= 0.54) {
                            wheRead = "Based On Your Waist To Height Ratio, You Are Extremely Overweight.";
                        }
                        if (whe < 0.54 && whe >= 0.49) {
                            wheRead = "Based On Your Waist To Height Ratio, You Are Overweight.";
                        }
                        if (whe < 0.49 && whe >= 0.46) {
                            wheRead = "Based On Your Waist To Height Ratio, You Are Healthy.";
                        }
                        if (whe < 0.46 && whe >= 0.42) {
                            wheRead = "Based On Your Waist To Height Ratio, You Are Slender And Healthy.";
                        }
                        if (whe < 0.42 && whe >= 0.35) {
                            wheRead = "Based On Your Waist To Height Ratio, You Are Extremely Slim.";
                        }
                        if (whe < 0.35) {
                            wheRead = "Based On Your Waist To Height Ratio, You Are Abnormally Slim.";
                        }
                        if (whi < 0.75) {
                            whiRead = "Your Waist To Hip Ratio Is Excellent.";
                        }
                        if (whi >= 0.75 && whi < 0.80) {
                            whiRead = "Your Waist To Hip Ratio Is Good.";
                        }
                        if (whi >= 0.80 && whi < 0.86) {
                            whiRead = "Your Waist To Hip Ratio Is Average.";
                        }
                        if (whi >= 0.86) {
                            whiRead = "Your Waist To Hip Ratio Is Bad.";
                        }
                    }
                }
                break;
        }
        if (active == 1)
        {
            start = bmr * 1.2;
            if (plan == 5)
            {
                need = start * 1.4;
            }
            if (plan == 4)
            {
                need = start * 1.2;
            }
            if (plan == 3)
            {
                need = start;
            }
            if (plan == 2)
            {
                need = start * 0.8;
            }
            if (plan == 1)
            {
                need = start * 0.6;
            }
        }
        if (active == 2)
        {
            start = bmr * 1.375;
            water = water + 12;
            if (plan == 5)
            {
                need = start * 1.4;
            }
            if (plan == 4)
            {
                need = start * 1.2;
            }
            if (plan == 3)
            {
                need = start;
            }
            if (plan == 2)
            {
                need = start * 0.8;
            }
            if (plan == 1)
            {
                need = start * 0.6;
            }
        }
        if (active == 3)
        {
            start = bmr * 1.55;
            water = water + 24;
            if (plan == 5)
            {
                need = start * 1.4;
            }
            if (plan == 4)
            {
                need = start * 1.2;
            }
            if (plan == 3)
            {
                need = start;
            }
            if (plan == 2)
            {
                need = start * 0.8;
            }
            if (plan == 1)
            {
                need = start * 0.6;
            }
        }
        if (active == 4)
        {
            start = bmr * 1.725;
            water = water + 36;
            if (plan == 5)
            {
                need = start * 1.4;
            }
            if (plan == 4)
            {
                need = start * 1.2;
            }
            if (plan == 3)
            {
                need = start;
            }
            if (plan == 2)
            {
                need = start * 0.8;
            }
            if (plan == 1)
            {
                need = start * 0.6;
            }
        }
        if (active == 5)
        {
            start = bmr * 1.9;
            water = water + 48;
            if (plan == 5)
            {
                need = start * 1.4;
            }
            if (plan == 4)
            {
                need = start * 1.2;
            }
            if (plan == 3)
            {
                need = start;
            }
            if (plan == 2)
            {
                need = start * 0.8;
            }
            if (plan == 1)
            {
                need = start * 0.6;
            }
        }
        carbs = (need * .4) / 4;
        proteins = (need * .3) / 4;
        fats = (need * 0.3) / 9;
        if (age < 0.5)
        {
            vitaminA = 400;
            vitaminC = 40;
            vitaminD = 10;
            vitaminE = 4;
            vitaminK = 2;
            vitaminB1 = 0.2;
            vitaminB2 = 0.3;
            vitaminB3 = 2;
            vitaminB5 = 1.7;
            vitaminB7 = 5;
            vitaminB6 = 0.1;
            vitaminB12 = 0.4;
            vitaminB9 = 65;
            choline = 125;
            magnesium = 30;
            calcium = 200;
            zinc = 2;
            iron = 0.27;
            copper = 200;
            selenium = 20;
            manganese = 0.6;
            phosphorus = 100;
            potassium = 400;
            iodine = 110;
            chromium = 0.2;
            molybdenum = 2;
            fluoride = 0.01;
            chloride = 1.5;
        }
        if (age >= 0.5 && age < 1)
        {
            vitaminA = 500;
            vitaminC = 50;
            vitaminD = 10;
            vitaminE = 5;
            vitaminK = 2.5;
            vitaminB1 = 0.3;
            vitaminB2 = 0.4;
            vitaminB3 = 4;
            vitaminB5 = 1.8;
            vitaminB7 = 6;
            vitaminB6 = 0.3;
            vitaminB12 = 0.5;
            vitaminB9 = 80;
            choline = 150;
            magnesium = 75;
            calcium = 260;
            zinc = 3;
            iron = 11;
            copper = 200;
            selenium = 15;
            manganese = 0.003;
            phosphorus = 275;
            potassium = 860;
            iodine = 130;
            chromium = 5.5;
            molybdenum = 3;
            fluoride = 0.5;
            chloride = 1.5;
        }
        if (age >= 1 && age < 4)
        {
            vitaminA = 300;
            vitaminC = 15;
            vitaminD = 15;
            vitaminE = 6;
            vitaminK = 30;
            vitaminB1 = 0.5;
            vitaminB2 = 0.5;
            vitaminB3 = 6;
            vitaminB5 = 2;
            vitaminB7 = 8;
            vitaminB6 = 0.5;
            vitaminB12 = 0.9;
            vitaminB9 = 150;
            choline = 200;
            magnesium = 80;
            calcium = 700;
            zinc = 3;
            iron = 7;
            copper = 340;
            selenium = 20;
            manganese = 1.2;
            phosphorus = 460;
            potassium = 2000;
            iodine = 90;
            chromium = 11;
            molybdenum = 17;
            fluoride = 0.6;
            chloride = 1.5;
        }
        if (age >= 4 && age < 9)
        {
            vitaminA = 400;
            vitaminC = 25;
            vitaminD = 15;
            vitaminE = 7;
            vitaminK = 55;
            vitaminB1 = 0.6;
            vitaminB2 = 0.6;
            vitaminB3 = 8;
            vitaminB5 = 3;
            vitaminB7 = 12;
            vitaminB6 = 0.6;
            vitaminB12 = 1.2;
            vitaminB9 = 200;
            choline = 250;
            magnesium = 130;
            calcium = 1000;
            zinc = 5;
            iron = 10;
            copper = 440;
            selenium = 30;
            manganese = 1.5;
            phosphorus = 500;
            potassium = 2300;
            iodine = 90;
            chromium = 15;
            molybdenum = 22;
            fluoride = 1.1;
            chloride = 1.9;
        }
        if (age >= 9 && age < 14 && gender == 1)
        {
            vitaminA = 600;
            vitaminC = 45;
            vitaminD = 15;
            vitaminE = 11;
            vitaminK = 60;
            vitaminB1 = 0.9;
            vitaminB2 = 0.9;
            vitaminB3 = 12;
            vitaminB5 = 4;
            vitaminB7 = 20;
            vitaminB6 = 1;
            vitaminB12 = 1.8;
            vitaminB9 = 400;
            choline = 375;
            magnesium = 240;
            calcium = 1300;
            zinc = 8;
            iron = 8;
            copper = 700;
            selenium = 40;
            manganese = 1.9;
            phosphorus = 1250;
            potassium = 2500;
            iodine = 120;
            chromium = 25;
            molybdenum = 34;
            fluoride = 2;
            chloride = 2.3;
        }
        if (age >= 9 && age < 14 && gender == 2)
        {
            vitaminA = 600;
            vitaminC = 45;
            vitaminD = 15;
            vitaminE = 11;
            vitaminK = 60;
            vitaminB1 = 0.9;
            vitaminB2 = 0.9;
            vitaminB3 = 12;
            vitaminB5 = 4;
            vitaminB7 = 20;
            vitaminB6 = 1;
            vitaminB12 = 1.8;
            vitaminB9 = 400;
            choline = 375;
            magnesium = 240;
            calcium = 1300;
            zinc = 8;
            iron = 8;
            copper = 700;
            selenium = 40;
            manganese = 1.6;
            phosphorus = 1250;
            potassium = 2300;
            iodine = 120;
            chromium = 21;
            molybdenum = 34;
            fluoride = 2;
            chloride = 2.3;
        }
        if (age >= 14 && age < 19 && gender == 1)
        {
            vitaminA = 900;
            vitaminC = 75;
            vitaminD = 15;
            vitaminE = 15;
            vitaminK = 75;
            vitaminB1 = 1.2;
            vitaminB2 = 1.3;
            vitaminB3 = 16;
            vitaminB5 = 5;
            vitaminB7 = 25;
            vitaminB6 = 1.3;
            vitaminB12 = 2.4;
            vitaminB9 = 400;
            choline = 550;
            magnesium = 410;
            calcium = 1300;
            zinc = 11;
            iron = 11;
            copper = 890;
            selenium = 55;
            manganese = 2.2;
            phosphorus = 1250;
            potassium = 3000;
            iodine = 150;
            chromium = 35;
            molybdenum = 43;
            fluoride = 3;
            chloride = 2.3;
        }
        if (age >= 14 && age < 19 && gender == 2)
        {
            vitaminA = 700;
            vitaminC = 65;
            vitaminD = 15;
            vitaminE = 15;
            vitaminK = 75;
            vitaminB1 = 1;
            vitaminB2 = 1;
            vitaminB3 = 14;
            vitaminB5 = 5;
            vitaminB7 = 25;
            vitaminB6 = 1.2;
            vitaminB12 = 2.4;
            vitaminB9 = 400;
            choline = 400;
            magnesium = 360;
            calcium = 1300;
            zinc = 9;
            iron = 15;
            copper = 890;
            selenium = 55;
            manganese = 1.6;
            phosphorus = 1250;
            potassium = 2300;
            iodine = 150;
            chromium = 24;
            molybdenum = 43;
            fluoride = 3;
            chloride = 2.3;
        }
        if (age >= 19 && age < 51 && gender == 1)
        {
            vitaminA = 900;
            vitaminC = 90;
            vitaminD = 15;
            vitaminE = 15;
            vitaminK = 120;
            vitaminB1 = 1.2;
            vitaminB2 = 1.3;
            vitaminB3 = 16;
            vitaminB5 = 5;
            vitaminB7 = 30;
            vitaminB6 = 1.3;
            vitaminB12 = 2.4;
            vitaminB9 = 400;
            choline = 550;
            magnesium = 420;
            calcium = 1000;
            zinc = 11;
            iron = 8;
            copper = 900;
            selenium = 55;
            manganese = 2.3;
            phosphorus = 700;
            potassium = 3400;
            iodine = 150;
            chromium = 35;
            molybdenum = 45;
            fluoride = 4;
            chloride = 2.3;
        }
        if (age >= 19 && age < 51 && gender == 2)
        {
            vitaminA = 700;
            vitaminC = 75;
            vitaminD = 15;
            vitaminE = 15;
            vitaminK = 90;
            vitaminB1 = 1.1;
            vitaminB2 = 1.1;
            vitaminB3 = 14;
            vitaminB5 = 5;
            vitaminB7 = 30;
            vitaminB6 = 1.3;
            vitaminB12 = 2.4;
            vitaminB9 = 400;
            choline = 425;
            magnesium = 320;
            calcium = 1000;
            zinc = 8;
            iron = 18;
            copper = 900;
            selenium = 55;
            manganese = 1.8;
            phosphorus = 700;
            potassium = 2600;
            iodine = 150;
            chromium = 25;
            molybdenum = 45;
            fluoride = 3;
            chloride = 2.3;
        }
        if (age >= 51 && age < 71 && gender == 1)
        {
            vitaminA = 900;
            vitaminC = 90;
            vitaminD = 15;
            vitaminE = 15;
            vitaminK = 120;
            vitaminB1 = 1.2;
            vitaminB2 = 1.3;
            vitaminB3 = 16;
            vitaminB5 = 5;
            vitaminB7 = 30;
            vitaminB6 = 1.7;
            vitaminB12 = 2.4;
            vitaminB9 = 400;
            choline = 550;
            magnesium = 420;
            calcium = 1000;
            zinc = 11;
            iron = 8;
            copper = 900;
            selenium = 55;
            manganese = 2.3;
            phosphorus = 700;
            potassium = 3400;
            iodine = 150;
            chromium = 30;
            molybdenum = 45;
            fluoride = 4;
            chloride = 2;
        }
        if (age >= 51 && age < 71 && gender == 2)
        {
            vitaminA = 700;
            vitaminC = 75;
            vitaminD = 15;
            vitaminE = 15;
            vitaminK = 90;
            vitaminB1 = 1.1;
            vitaminB2 = 1.1;
            vitaminB3 = 14;
            vitaminB5 = 5;
            vitaminB7 = 30;
            vitaminB6 = 1.5;
            vitaminB12 = 2.4;
            vitaminB9 = 400;
            choline = 425;
            magnesium = 320;
            calcium = 1200;
            zinc = 8;
            iron = 8;
            copper = 900;
            selenium = 55;
            manganese = 1.8;
            phosphorus = 700;
            potassium = 2600;
            iodine = 150;
            chromium = 20;
            molybdenum = 45;
            fluoride = 3;
            chloride = 2;
        }
        if (age >= 71 && gender == 1)
        {
            vitaminA = 900;
            vitaminC = 90;
            vitaminD = 20;
            vitaminE = 15;
            vitaminK = 120;
            vitaminB1 = 1.2;
            vitaminB2 = 1.3;
            vitaminB3 = 16;
            vitaminB5 = 5;
            vitaminB7 = 30;
            vitaminB6 = 1.7;
            vitaminB12 = 2.4;
            vitaminB9 = 400;
            choline = 550;
            magnesium = 420;
            calcium = 1200;
            zinc = 11;
            iron = 8;
            copper = 900;
            selenium = 55;
            manganese = 2.3;
            phosphorus = 700;
            potassium = 3400;
            iodine = 150;
            chromium = 30;
            molybdenum = 45;
            fluoride = 4;
            chloride = 1.8;
        }
        if (age >= 71 && gender == 2)
        {
            vitaminA = 700;
            vitaminC = 75;
            vitaminD = 20;
            vitaminE = 15;
            vitaminK = 90;
            vitaminB1 = 1.1;
            vitaminB2 = 1.1;
            vitaminB3 = 14;
            vitaminB5 = 5;
            vitaminB7 = 30;
            vitaminB6 = 1.5;
            vitaminB12 = 2.4;
            vitaminB9 = 400;
            choline = 425;
            magnesium = 420;
            calcium = 1200;
            zinc = 8;
            iron = 8;
            copper = 900;
            selenium = 55;
            manganese = 1.8;
            phosphorus = 700;
            potassium = 2600;
            iodine = 150;
            chromium = 20;
            molybdenum = 45;
            fluoride = 3;
            chloride = 1.8;
        }
        String measurementInfo = null;
        String genderInfo = null;
        String activeInfo = null;
        String planInfo = null;

        if(measurement == 1){
            measurementInfo = "US(in and lbs)";
        }
        if (measurement == 2){
            measurementInfo = "Metric(cm and kg)";
        }
        if(gender == 1){
            genderInfo = "Male";
        }
        if(gender == 2){
            genderInfo = "Female";
        }

        if(active == 1){
            activeInfo = "Sedentary";
        }
        if(active == 2){
            activeInfo = "Lightly Active";
        }
        if(active == 3){
            activeInfo = "Moderately Active";
        }
        if(active == 4){
            activeInfo = "Very Active";
        }
        if(active == 5){
            activeInfo = "Extremely Active";
        }

        if(plan == 1){
            planInfo = "Lose Fast";
        }
        if(plan == 2){
            planInfo = "Lose Normal";
        }
        if(plan == 3){
            planInfo = "Maintain";
        }
        if(plan == 4){
            planInfo = "Gain Normal";
        }
        if(plan == 5){
            planInfo = "Gain Fast";
        }


        System.out.println();
        System.out.println("User Input");
        System.out.println("Unit Of Measure: " + measurementInfo);
        System.out.println("Gender: " + genderInfo);
        System.out.println("Age: " + age + "y/o");
        System.out.println("Height: " + height + n);
        System.out.println("Weight: " + weight + m);
        System.out.println("Waist Circumference: " + waist + n);
        System.out.println("Neck Circumference: " + neck + n);
        System.out.println("Hip Circumference: " + hip + n);
        System.out.println("Activity Level: " + activeInfo);
        System.out.println("Weight Goal: " + planInfo);



        System.out.println();
        System.out.println("Body Information");

        System.out.println("Body Mass Index: " + bmi + "kg/m^2");

        System.out.println("Body Surface Area: " + bsa + "m^2");
        System.out.println("Body Fat Percentage: " + bfp + "%");

        System.out.println("Fat Mass: " + fm + m);
        System.out.println("Lean Mass: " + lm + m);
        System.out.println("Waist To Height Ratio: " + whe);

        System.out.println("Waist To Hip Ratio: " + whi);

        System.out.println("Basal Metabolic Rate: " + bmr + "kcal");
        System.out.println("Ideal Body Weight: " + ibw + m);
        System.out.println();



        System.out.println("Body Information Feedback");
        System.out.println(bmiRead);
        System.out.println(bfRead);
        System.out.println(wheRead);
        System.out.println(whiRead);


        System.out.println();
        System.out.println("Daily Macronutrient Intake Recommendations");
        System.out.println("Calories: " + need + "kcal");
        System.out.println("Carbs: " + carbs + "g");
        System.out.println("Protein: " + proteins + "g");
        System.out.println("Fat: " + fats + "g");
        System.out.println("Water: " + water + "oz");
        System.out.println();
        System.out.println("Daily Vitamin Intake Recommendations");
        System.out.println("Vitamin A: " + vitaminA + "mcg");
        System.out.println("Vitamin C: " + vitaminC + "mg");
        System.out.println("Vitamin D: " + vitaminD + "mcg");
        System.out.println("Vitamin E: " + vitaminE + "mg");
        System.out.println("Vitamin K: " + vitaminK + "mcg");
        System.out.println("Vitamin B1: " + vitaminB1 + "mg");
        System.out.println("Vitamin B2: " + vitaminB2 + "mg");
        System.out.println("Vitamin B3: " + vitaminB3 + "mg");
        System.out.println("Vitamin B5: " + vitaminB5 + "mg");
        System.out.println("Vitamin B7: " + vitaminB7 + "mcg");
        System.out.println("Vitamin B6: " + vitaminB6 + "mg");
        System.out.println("Vitamin B12: " + vitaminB12 + "mcg");
        System.out.println("Vitamin B9: " + vitaminB9 + "mcg");
        System.out.println();
        System.out.println("Daily Mineral Intake Recommendations");
        System.out.println("Choline: " + choline + "mg");
        System.out.println("Magnesium: " + magnesium + "mg");
        System.out.println("Calcium: " + calcium + "mg");
        System.out.println("Zinc: " + zinc + "mg");
        System.out.println("Iron: " + iron + "mg");
        System.out.println("Copper: " + copper + "mcg");
        System.out.println("Selenium: " + selenium + "mcg");
        System.out.println("Manganese: " + manganese + "mg");
        System.out.println("Phosphorus: " + phosphorus + "mg");
        System.out.println("Potassium: " + potassium + "mg");
        System.out.println("Iodine: " + iodine + "mcg");
        System.out.println("Chromium: " + chromium + "mcg");
        System.out.println("Molybdenum: " + molybdenum + "mcg");
        System.out.println("Fluoride: " + fluoride + "mg");
        System.out.println("Sodium: " + sodium + "mg");
        System.out.println("Chloride: " + chloride + "g");






















    }
}
