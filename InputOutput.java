import java.util.Scanner;

public class InputOutput{
 public static void main(String[]args){
  Scanner scanner = new Scanner(System.in);

  String nama;
  System.out.print("Masukkan nama: ");
  nama = scanner.nextLine();
  System.out.print("Hai " + nama);
 }
}