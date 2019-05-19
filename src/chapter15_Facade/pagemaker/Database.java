package chapter15_Facade.pagemaker;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

//public class Database {
//    private Database(){} // newでインスタンス生成させないために

/*--- kadai15-1 ---*/
class Database {
    public static Properties getProperties(String dbname) {
        String filename = "src/chapter15_Facade/" + dbname + ".txt";
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream(filename));
        } catch (IOException e) {
            System.out.println("Warning: " + filename + " is not found.");
        }
        return prop;
    }
}
