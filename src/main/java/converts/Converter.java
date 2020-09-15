package converts;

public class Converter {

    public Converter(){}

    // C = 5/9 x (F-32)
    public double fahrenheitToCelcius(double fahrenheit)

    {
        double f1 = fahrenheit - 32;

        double f3 = f1*0.5556;

        return f3;
    }

    public double celciusToFahrenheit(double celcius)
    {
        return (celcius * 1.8 +32);
    }
}