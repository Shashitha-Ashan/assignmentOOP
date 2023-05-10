package com.shashitha.ashan;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        FileHandling file = new FileHandling();

        if (file.getFileStatus()){

        }else {
            file.createFile();
            System.out.print("Enter your Semester ");
            Scanner scan = new Scanner(System.in);
            int semester = scan.nextInt();

            System.out.print("Enter your group ");
            String group = scan.next();
            file.setDetails(semester,group);

        }
    }
}
