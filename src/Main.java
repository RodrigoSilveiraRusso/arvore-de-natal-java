import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     int tamanho;
     System.out.println("digite o tamanho da base da sua arvore: ");
     tamanho = scanner.nextInt();

     for (int i = 1; i <= tamanho; i +=2) {
     for (int j = 0; j < (tamanho - i)/2; j++) {
         System.out.print(" ");
     }
     for (int k = 0; k < i; k++) {
         System.out.print("*");
     }
         for (int j = 0; j < (tamanho - i)/2; j++) {
             System.out.print(" ");
         }
         System.out.println();
     }
 }
}
