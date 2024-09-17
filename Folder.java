package com.company;
import java.util.ArrayList;
import java.util.List;

// Folder class
public class Folder {
    private String name;
    private List<File> files;
    private List<Folder> subFolders;

    public Folder(String name) {
        this.name = name;
        this.files = new ArrayList<>();
        this.subFolders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<File> getFiles() {
        return files;
    }

    public void addFile(File file) {
        files.add(file);
    }

    public void removeFile(File file) {
        files.remove(file);
    }

    public List<Folder> getSubFolders() {
        return subFolders;
    }

    public void addSubFolder(Folder folder) {
        subFolders.add(folder);
    }

    public void removeSubFolder(Folder folder) {
        subFolders.remove(folder);
    }

    public void print(String indent) {
        System.out.println(indent + "Folder: " + name);
        for (File file : files) {
            file.print(indent + "  ");
        }
        for (Folder folder : subFolders) {
            folder.print(indent + "  ");
        }
    }

}