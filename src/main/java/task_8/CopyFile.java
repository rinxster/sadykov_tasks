package task_8;

import java.io.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class CopyFile {

 public static void main(String[] args) {

String file = "//notes.txt";

Scanner in = new Scanner(System.in);
        System.out.println("enter current source folder. Example: c:\\tmp");
String path = in.nextLine();
        System.out.println("enter current source folder. Example: c:\\tmp2");
String dest = in.nextLine();
in.close();

try(FileInputStream fin = new FileInputStream(path+file);
FileOutputStream fos=new FileOutputStream(dest+file)){
 byte[] buffer = new byte[fin.available()];
fin.read(buffer, 0, buffer.length);
fos.write(buffer, 0, buffer.length);
    System.out.println("Filed copied successfully!");
}
catch(IOException ex){
System.out.println(ex.getMessage());
}
}

}
