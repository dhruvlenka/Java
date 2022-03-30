import java.util.Scanner;
public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Celsius = ");
        float tempinCelsius = input.nextFloat();

        float tempinFahrenheit = tempinCelsius * 9 / 5 + 32;
        System.out.println("Entered Celsius in Fahrenheit = " + tempinFahrenheit);
        
    }
}
