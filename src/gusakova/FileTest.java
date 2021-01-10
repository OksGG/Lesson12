package gusakova;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileTest {

    public static void main(String[] args) throws IOException {
        boolean success;
        File file = new File("C:\\Users\\Public\\note.txt");
        file.createNewFile();
        File file2 = new File("C:\\Users\\Public\\notes2.txt");
        File file3 = new File("C:\\Users\\Public\\Test.txt");
        File file4 = new File("C:\\Users\\Public\\Documents\\notes.txt");
        success= file.renameTo(file2);
        Path path1 = file3.toPath();
        Path path2 = file4.toPath();
        Files.copy(path1, path2);
       file2 = new File("fileToDelete");
        success = file.delete();
        success = file2.delete();
        observeDirectory(new File("C:\\Users\\ZenBook 13\\Downloads"));
    }
    public static void observeDirectory(File file) {
        if (file.isDirectory()) {
            File[] fls = file.listFiles();
            if (fls.length > 0) {
                for (File f : fls) {
                    observeDirectory(f);
                }
            }
        }
    }


}
