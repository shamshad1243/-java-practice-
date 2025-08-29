package fileoperations;

import java.io.File;
    import java.io.IOException;
    public class create {
        public static void main(String[] args) {
            try {
                File myFile = new File("example.txt");
                if ( myFile.createNewFile()) {
                    System.out.println("file create : " + myFile.getName());
                } else {
                    System.out.println("file already exists");
                }
            } catch (IOException e) {
                System.out.println("An error Occurred .");
                e.printStackTrace();
            }

        }
    }



