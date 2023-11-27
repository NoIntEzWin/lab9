import java.io.File;
public class delete {
    public class DeleteFile {
        public static void main(String[] args) {
            File myObj = new File("C:\\Users\\rares\\IdeaProjects\\lab 8\\lab8.txt");
            if (myObj.delete()) {
                System.out.println("Deleted the file: " + myObj.getName());
            } else {
                System.out.println("Failed to delete the file.");
            }
        }
    }
}