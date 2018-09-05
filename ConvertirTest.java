package testPackage;

import org.junit.Test;
import org.junit.Assert.*;

import static junit.framework.TestCase.assertEquals;

public class ConvertirTest {

    double resul,esperado;
    Convertir o=new Convertir();

    @Test
    public void testCelsiusToFahrenheit(){
        esperado=32;
        resul=o.CelsiusToFahrenheit(0);
        assertEquals(esperado,resul,0);
    }

    @Test
    public void testFahrenheitToCelsius(){

        esperado=0;
        resul=o.FahrenheitToCelsius(32);
        assertEquals(esperado,resul,0);

        }

     @Test
    public void testCelsiusToKelvin(){
       esperado=0;
       resul=o.CelsiusToKelvin(-273.15);
       assertEquals(esperado,resul,0);
     }

     @Test
    public void testFahrenheitToKelvin(){
        esperado=273.15;
        resul=o.FahrenheitToKelvin(32);
        assertEquals(esperado,resul,0);
     }

     @Test
    public void testKelvinToCelsius(){
        esperado=-273.15;
        resul=o.KelvinToCelsius(0);
        assertEquals(esperado,resul,0);
     }

     @Test
    public void testKelvinToFahrenheit(){
        esperado=32;
        resul=o.KelvinToFahrenheit(273.15);
        assertEquals(esperado,resul,.01);// tolerance is added by desimals
    }

}
