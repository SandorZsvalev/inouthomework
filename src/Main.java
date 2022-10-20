import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {


       Scanner scn = new Scanner(System.in);
//       System.out.println( "Введите путь до  исходного файла: ");
//        String source = scn.nextLine();
        String source = "source.txt";
//       System.out.println( "Введите путь до первого файла out: ");
//        String firstOut = scn.nextLine();
        String firstOut = "one.txt";
//       System.out.println( "Введите путь до второго файла out: ");
//        String secondOut = scn.nextLine();
        String secondOut = "two.txt";

        FileReader reader = new FileReader(source);
        BufferedReader bufReader = new BufferedReader(reader);

        String s = bufReader.readLine();
        String s2 = bufReader.readLine();

        System.out.println(s);
        System.out.println(s2);

        FileWriter writer_one = new FileWriter(firstOut);
        FileWriter writer_two = new FileWriter(secondOut);
        writer_one.write(s2);
        writer_two.write(s);

        writer_one.close();
        writer_two.close();


        //работа собственного класса writer

        ArrayList<String> listOfStrings = new ArrayList<>();
        listOfStrings.add("first string ");
        listOfStrings.add("second string ");
        listOfStrings.add("third string ");
        listOfStrings.add("fourth string ");
        listOfStrings.add("fifth string");

        MyOwnWriter myOwnWriter = new MyOwnWriter();
        myOwnWriter.writeAllList(listOfStrings);

        System.out.println(myOwnWriter);

    }
}