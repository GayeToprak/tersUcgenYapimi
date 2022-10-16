import java.util.Scanner;

public class tersUcgen {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("üçgeniniz kaç basamaklı olsun:");
        int n = inp.nextInt();

        for(int i = n; i>0; i--){
            for(int k = 1; k<=(n-1); k++){
                System.out.print(" ");
            }
            for(int j = 1; j <= (2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
}
