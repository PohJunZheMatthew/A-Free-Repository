import java.io.FileWriter;
import java.io.File;
public class Main {
    public static void main(String[] args) {
        try{
            File file = new File("Hello-world.txt");
            if (!file.exists()){
                file.createNewFile();
            }
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("Hello world");
            fileWriter.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
