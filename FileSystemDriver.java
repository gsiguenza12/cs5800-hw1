package com.company;

public class FileSystemDriver {
    public static void main(String[] args) {
        // Create the main folder
        Folder phpDemo1 = new Folder("php_demo1");
        Folder includePath = new Folder("Include Path");
        File remoteFiles = new File("Remote Files");

        // Create sub-folder Source files
        Folder sourceFiles = new Folder("Source files");

        // Create sub-folder app within Source files
        Folder app = new Folder("app");

        // create folder within source files
        Folder phalcon = new Folder(".phalcon");
        Folder cache = new Folder("cache");
        Folder publicFolder = new Folder("public");

        // Create folder within app called config
        Folder config = new Folder("config");
        Folder controller = new Folder("controller");
        Folder library = new Folder("library");
        Folder migrations = new Folder("migrations");
        Folder models = new Folder("models");

        // create file
        File someFile1 = new File(".htaccess");
        File someFile2 = new File(".htrouter.php");
        File someFile3 = new File("index.html");

        // add subfolders to app folder
        app.addSubFolder(config);
        app.addSubFolder(controller);
        app.addSubFolder(library);
        app.addSubFolder(migrations);
        app.addSubFolder(models);

//        add file to source file
        sourceFiles.addFile(someFile1);
        sourceFiles.addFile(someFile2);
        sourceFiles.addFile(someFile3);

        phpDemo1.addFile(remoteFiles);
        phpDemo1.addSubFolder(includePath);

        // Add sub-folder app to Source files
        sourceFiles.addSubFolder(app);

        // Add sub-folder Source files to php_demo1
        phpDemo1.addSubFolder(sourceFiles);

        // Print the folder structure
        phpDemo1.print("");

//        2.	Now delete the folder app and print out the full structure.
        System.out.println("deleting app subfolder...");
        sourceFiles.removeSubFolder(app);
        System.out.println("printing file structure after delete...");
        phpDemo1.print("");
//        3.	Now delete the folder public and print out the full structure.
        System.out.println("deleting public subfolder...");
        phpDemo1.removeSubFolder(publicFolder);
        System.out.println("printing file structure after delete...");
        phpDemo1.print("");

    }
}
