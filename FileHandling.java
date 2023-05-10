package com.shashitha.ashan;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
    private File file;
    private FileWriter fileWriter;
    public FileHandling() throws IOException {
        this.file = new File("status/status.txt");
        this.fileWriter = new FileWriter("status/status.txt");
    }

    public boolean getFileStatus(){
        return file.exists();
    }

    public boolean createFile() throws IOException {
        return file.createNewFile();
    }
    public void setDetails (int semester, String group) throws IOException {
        fileWriter.write( semester +"_" +group);
    }

}
