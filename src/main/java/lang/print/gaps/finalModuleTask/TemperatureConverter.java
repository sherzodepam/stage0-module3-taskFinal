package lang.print.gaps.finalModuleTask;

import java.util.Scanner;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please the temperature in Celcius");
        double celcius=scanner.nextDouble();
        double Fahrenheit= celcius*33.8;
        System.out.println(celcius+" celcius equal to "+Fahrenheit);
    }
}
