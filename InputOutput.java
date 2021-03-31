import java.util.Scanner;

public class InputOutput{
 public static void main(String[]args){
  String nama;
  int usia;
  double ipk;

  Scanner scanner = new Scanner(System.in);

  System.out.print("input nama : ");
  nama = scanner.nextLine();

  System.out.print("input usia : ");
  usia = scanner.nextInt();

  System.out.print("input ipk : ");
  ipk = scanner.nextDouble();

  System.out.println("Hai " + nama);
  System.out.println("usia :" + usia);
  System.out.println("ipk :" + ipk);
 }
}