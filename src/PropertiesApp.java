import java.io.*;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;

public class PropertiesApp {
    public static void main(String[] args) {

        Properties prt = new Properties();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input path to properties file: ");
        String pathToProp = scanner.nextLine();

        try {
            prt.load(new FileReader(pathToProp));
        } catch (IOException e) {
            e.printStackTrace();
        }
        printProperties(prt);


        System.out.println("Input path to target XML file: ");
        String pathToXml = scanner.nextLine();

        try (OutputStream output = new FileOutputStream(pathToXml)){
            prt.storeToXML(output,"New XML with properties");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printProperties(Properties prt){
        for (Map.Entry<Object, Object> pair: prt.entrySet())
        {
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }
    }

}
