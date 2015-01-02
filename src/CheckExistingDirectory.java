/**
 * Created by DWalker on 2014-12-08.
 */

import javafx.application.Application;

import java.io.IOException;
        import java.nio.file.*;

public class CheckExistingDirectory {

    public static void main(String[] args)throws IOException{
        Path basePath = Paths.get("E:\\Testing\\DemoHub\\FieldDesigner_4.16");
        Path endPath = Paths.get("E:\\Testing\\DemoHub\\Test1");
        boolean copyFrom = true;
        boolean copyTo = true;
        CopyOption[] options = new CopyOption[]{
                StandardCopyOption.REPLACE_EXISTING,
                StandardCopyOption.COPY_ATTRIBUTES
        };
        FolderChooserGui fc = new FolderChooserGui();
        fc.go();
        //FolderPicker FP = new FolderPicker();
        //FP.start();


        if (!Files.exists(basePath)){
            System.out.println("Reports Install is not present! Ending Process");
            copyFrom = false;
            return;
        }
        if (!Files.exists(endPath)){
            System.out.println("Directory Doesn't Exist");
            System.out.println("Creating Directory");
            copyTo = false;
            Files.createDirectories(endPath);
        }

        
        Files.copy(basePath,endPath, options);
    }
}
