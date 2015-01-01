/**
 * Created by DWalker on 2014-12-08.
 */

import java.io.IOException;
        import java.nio.file.*;

public class CheckExistingDirectory {

    public static void main(String[] args) throws Exception {
        Path basePath = Paths.get("E:\\Testing\\DemoHub\\FieldDesigner_4.16");
        Path endPath = Paths.get("E:\\Testing\\DemoHub\\Test1");
        boolean copyFrom = true;
        CopyOption[] options = new CopyOption[]{
                StandardCopyOption.REPLACE_EXISTING,
                StandardCopyOption.COPY_ATTRIBUTES
        };
        if (!Files.exists(basePath)){
            System.out.println("Reports Install is not present! Ending Process");
            copyFrom = false;
            return;
        } else if (!Files.exists(endPath)){
            System.out.println("Directory Doesn't Exist");
            System.out.println("Creating Directory");
            Files.createDirectories(endPath);
        }

        FolderPicker ChoosePath = new FolderPicker();
        try {
            ChoosePath.start();
        } catch (Exception e) {
            e.printStackTrace();
        }

        Files.copy(basePath,endPath, options);
    }
}
