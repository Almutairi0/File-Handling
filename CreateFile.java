import java.io.*;
import java.util.*;
public class CreateFile {
    Scanner input = new Scanner(System.in);
    File MyFile = new File("MyFile.txt");
    String directoryPath = "./home/usr/Documents";
    String [] folderNames;
    public void createFile() {

        try {


            boolean success = MyFile.createNewFile();
            if (success) {
                System.out.println("File created");
            } else {
                System.out.println("File already exists");
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    public void fileWrite() {
        try {
            FileWriter MyFileWriter = new FileWriter("MyFile.txt");
                    MyFileWriter.write("Hello");
            MyFileWriter.write("QQQ");
            MyFileWriter.close();



        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    public void fileRead() {
        try {
            while (input.hasNextLine()) {
                String Data = input.nextLine();
                System.out.println(Data);
            }
            input.close();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void fileList() {
        File directory = new File(directoryPath);
        folderNames = directory.list();
        if (folderNames != null) {
            for (String folderName : folderNames) {
                System.out.println(folderName);
            }
        } else {
            System.out.println("No files found");
        }

    }
}

