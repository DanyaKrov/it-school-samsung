import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class AAAA {
    public static void main(String[] args) {
        clearFile();
    }
    public void clearFile(String fileName) throws IOException {
        File file = new File(fileName);
        file.delete();
        file.createNewFile();
    }
}