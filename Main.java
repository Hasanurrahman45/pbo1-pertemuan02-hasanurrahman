import koneksi.Database;
import model.Mahasiswa;

public class Main{
 public static void main(String[]args){
  System.out.println("ini program main");

  Database.hubungkan();
  Mahasiswa.info();
 }
}