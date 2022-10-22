import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.*;
import java.util.FileWriter;
import java.util.BufferedWriter;


public class ScannerClassDemo{
    public static void main(String[] args) throws Exception{
      ArrayList<String> nombres = new ArrayList<String>();
      String texto;

        File doc = new File("E:\\Learn.txt");
        Scanner obj = new Scanner(doc);

        while (obj.hasNextLine()){
            texto = obj.nextLine();
            nombres.add(texto);
            System.out.println(texto);
        }
        System.out.println(nombres.size());
  }
}