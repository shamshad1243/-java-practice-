

import java.io.File;

public class demo {
    public static void main(String[] args) {
        File f = new File("test.txt");
        if (f.exists()) {
            System.out.println("File name: " + f.getName());
            System.out.println("File path: " + f.getAbsolutePath());
        } else {
            System.out.println("File does not exist.");
        }
    }
}
