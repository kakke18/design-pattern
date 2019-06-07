package chapter23_Interpreter;

import java.io.BufferedReader;
import java.io.FileReader;

public class Chapter23Main {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/chapter23_Interpreter/program.txt"));
            String text;
            while ((text = reader.readLine()) != null) {
                System.out.println("text = \"" + text + "\"");
                Node node = new ProgramNode();
                node.parse(new Context(text));
                System.out.println("node = " + node);
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
