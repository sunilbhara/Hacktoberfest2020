
import java.util.*;
public class BMIcalculator{
public static void main(String[] args) {
    Scanner key= new Scanner(System.in);
    System.out.println("Please enter your weight in kilograms");
    double weight=key.nextDouble();
    System.out.println("Please enter your height in meters");
    double height=key.nextDouble();
    double bmi=weight/(height*height);
    System.out.println("Your BMI is: "+String.format("%.2f", bmi));
    if(bmi<16){System.out.println("You are severely thin");}
    else if(bmi<17&&bmi>=16){System.out.println("You are moderately thin");}
    else if(bmi<18.5&&bmi>=17){System.out.println("You are mildly thin");}
    else if(bmi<25&&bmi>=18.5){System.out.println("You are Normal");}
    else if(bmi<30&&bmi>=25){System.out.println("You are severely overweight");}
    else if(bmi<35&&bmi>=30){System.out.println("You have obesity class I");}
    else if(bmi<=40&&bmi>=35){System.out.println("You have obesity class II");}
    else if(bmi>40){System.out.println("You have obesity class III");}
}
}