package testPackage;

import java.util.Scanner;

public class Convertir {

public double resultado=0;

    public double CelsiusToFahrenheit(double a){
        resultado=(a*1.8)+32;
        return resultado;
    }

    public double CelsiusToKelvin(double b){
        resultado=b+273.15;
        return resultado;
    }

    public double FahrenheitToCelsius(double c){
        resultado=((c-32)/1.8);
        return resultado;

    }

    public double FahrenheitToKelvin(double d){
        resultado=((d+459.67)/1.8);
        return resultado;
    }

    public double KelvinToCelsius(double e){
        double aux;
        resultado=KelvinToFahrenheit(e);
        return aux=FahrenheitToCelsius(resultado);

    }

    public double KelvinToFahrenheit(double f){
        resultado=(9*(f-273.15)/5)+32;
        return resultado;
    }


    public static void main(String args[]){
        int opc;
        double num;
        Convertir x=new Convertir();
        Scanner s=new Scanner(System.in);
        do{
            System.out.println("-----Menu-----");
            System.out.println("1.-Celsius to Fahrenheit");
            System.out.println("2.-Celsius to Kelvin");
            System.out.println("3.-Fahrenheit to Celsius");
            System.out.println("4.-Fahrenheit to Kelvin");
            System.out.println("5.-Kelvin to Celsius");
            System.out.println("6.-Kelvin to Fahrenheit");
            System.out.println("7.-Exit");
            System.out.println("Option: ");
            opc=s.nextInt();
            if(opc==1){
                System.out.println("Celsius To Fahrenheit");
                num=s.nextDouble();
               System.out.println("Fahrenheit: "+x.CelsiusToFahrenheit(num)+"°");
            }
            if(opc==2){
                System.out.println("Celsius To Kelvin");
                num=s.nextDouble();
                System.out.println("Kelvin: "+x.CelsiusToKelvin(num));
            }
            if(opc==3){
                System.out.println("Fahrenheit To Celsius");
                num=s.nextDouble();
                System.out.println("Celsius: "+x.FahrenheitToCelsius(num)+"°");
            }
            if(opc==4){
                System.out.println("Fahrenheit To Kelvin");
                num=s.nextDouble();
                System.out.println("Kelvin: "+x.CelsiusToFahrenheit(num));
            }
            if(opc==5){
                System.out.println("Kelvin To Celsius");
                num=s.nextDouble();
                System.out.println("Celsius: "+x.KelvinToCelsius(num)+"°");
            }
            if(opc==6){
                System.out.println("Kelvin To Fahrenheit");
                num=s.nextDouble();
                System.out.println("Fahrenheit: "+x.KelvinToFahrenheit(num)+"°");
            }
            if(opc>7||opc<1){
                System.out.println("your option is wrong!, try again ");
            }
        }while (opc!=7);
        System.out.println("Goodbye!");

    }



}
