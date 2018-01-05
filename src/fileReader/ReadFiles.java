package fileReader;

import java.io.File;
import java.io.IOException;

public class ReadFiles {

    public static void main(String[] args) throws IOException {

        FileReaderUtil filereader = new FileReaderUtil();

        // list of all the files from the specified directoryName
        // please place your files in local directory and mention the path of the directory here
        String directoryName = "/Users/Koraboinas/Downloads";
        filereader.listFiles(directoryName);

        // list of csv files in the directory with csv extension
        File[] file = filereader.finder(directoryName, "csv");
        for(File f:file) {
            System.out.println("File Name : "+f.getName());
        }
        // list xsl files in the directory with xlsx extension
        File[] file2 = filereader.finder(directoryName, "xlsx");
        for(File f2 : file2)
        {
            System.out.println("File Name : "+f2.getName());
        }
    }

}