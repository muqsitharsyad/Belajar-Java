import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApp {
    public static void main(String[] args) {
        //load data
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("application.properties"));

            String host = properties.getProperty("database.host");
            String port = properties.getProperty("database.port");
            String username = properties.getProperty("database.username");
            String password = properties.getProperty("database.password");

            System.out.println(host + port + username + password);
        }catch (FileNotFoundException e){
            System.out.println("File tidak ditemukan");
        }catch (IOException e){
            System.out.println("Gagal membaca file");
        }

        //create new properties
        try {
            Properties properties = new Properties();
            properties.put("name.first", "Kin");
            properties.put("name.last", "Min");

            properties.store(new FileOutputStream("name.properties"), "Konfigurasi Nama");
        }catch (FileNotFoundException e){
            System.out.println("Gagal membuat");
        }catch (IOException e){
            System.out.println("gagal menyimpan");
        }
    }
}
