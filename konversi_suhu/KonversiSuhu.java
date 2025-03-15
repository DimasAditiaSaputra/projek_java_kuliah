import java.util.InputMismatchException;
import java.util.Scanner;

public class KonversiSuhu {
    public static void main(String[] args) {
        Scanner inputCelcius = new Scanner(System.in);

        String rumusReamur = "rumus reamur : (4.0 / 5.0) * celsius";
        String rumusFahrenheit = "rumus fahrenheit : (9.0 / 5.0) * celsius + 32";


        System.out.println("Konversi suhu");

        for(int i = 0; i <= rumusFahrenheit.length(); i++){
            System.out.print("=");
        }

        System.out.println("");
        try{
            System.out.print("Masukan Celsius : ");
            double celsius = inputCelcius.nextDouble();

            System.out.println("Celsius : " + celsius + "\n");
            System.out.println("Reamur : " + reamur(celsius, rumusReamur) + "\n");
            System.out.println("Fahrenhit : " + fahrenheit(celsius, rumusFahrenheit) + "\n");

        }catch(InputMismatchException e){
            System.out.println("error : " + e.getMessage());
            System.out.println("masukan angka dengan tanda titik");
            System.out.println("contoh : 12.40");
        }finally{
            inputCelcius.close();
        }
    }
    public static double reamur(double celsius, String rumus){
        System.out.println(rumus);
        double result = (4.0 / 5.0) * celsius;
        return result;
    }

    public static double fahrenheit(double celsius, String rumus){
        System.out.println(rumus);
        double result = (9.0 / 5.0) * celsius + 32;
        return result;
    }
}