package converts;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
// import org.converts.Converter;

import java.util.prefs.Preferences;

import static org.junit.jupiter.api.Assertions.*;

public class ConverterTest extends Converter {


    @BeforeEach
    public void setup(){
        // converter = new Converter();
    }

    @Test
    public void testFahrenheitToCelcius(){
      //   System.out.print(-0.15 * 1.8 +32);

        Converter converter = new Converter();
        double fahrenheit = 40.00;
         assertEquals(4.4, converter.fahrenheitToCelcius(fahrenheit),0.1);

    }


    @Test
    void testCelciusToFahrenheit() {

        Converter converter = new Converter();
        double celcius = 4.40;
        assertEquals(40.00, converter.celciusToFahrenheit(celcius),0.1);

    }
}