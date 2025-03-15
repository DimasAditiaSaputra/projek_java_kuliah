import java.util.InputMismatchException;
import java.util.Scanner;

public class LuasKeliling {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);

        String rumusLuas = "rumus luas : (panjang x lebar)";
        String rumusKeliling = "rumus keliling : (2 x panjang+lebar)";
        System.out.println("Luas & Keliling segiempat");

        for(int i = 0; i <= rumusKeliling.length(); i++){
            System.out.print("=");
        }

        System.out.println("");
        try{
            System.out.print("Panjang : ");
            int panjang = inputNumber.nextInt();

            System.out.print("Lebar : ");
            int lebar = inputNumber.nextInt();

            System.out.println("");

            System.out.println("Panjang : " + panjang);
            System.out.println("Lebar : " + lebar + "\n");

            System.out.println("Luas : " + luas(panjang, lebar, rumusLuas) + "\n");
            System.out.println("Keliling : " + keliling(panjang, lebar, rumusKeliling) + "\n");
            
        }catch(InputMismatchException e){
            System.out.println("error : " + e.getMessage());
            System.out.println("gagal memasukan input, masukan angka bilangan bulat");
        }finally{
            inputNumber.close();
        }
    }

    public static int luas(int P, int L, String rumus){
        System.out.println(rumus);
        int result = P * L;
        return result;
    }
    public static int keliling(int P, int L, String rumus){
        System.out.println(rumus);
        int result = 2 * P + L;
        return result;
    }
}