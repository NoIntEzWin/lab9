import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class leagu {
    public static void main(String[] args){
        try {
            File myObj = new File("C:\\Users\\rares\\IdeaProjects\\lab 8\\lab8.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }catch (FileNotFoundException e) {
            System.out.println("An error accurred. ");
            e.printStackTrace();
        }
    }
}
