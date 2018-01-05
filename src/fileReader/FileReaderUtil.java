package fileReader;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Files;

public class FileReaderUtil {

    public void listFiles(String directoryName) throws IOException{

        File directory = new File(directoryName);
        //get all the files from a directory
        File[] fList = directory.listFiles();

        //looping through the list of files to retrieve file name, file length, file extension, mime type
        for (File file : fList){
            if (file.isFile()){
                System.out.println("File Name :"+ file.getName());
                System.out.println("File size :"+ file.length());
                System.out.println("File type :"+ getFileExtension(file));
                System.out.println("File Mime type :"+ Files.probeContentType(file.toPath()));

            }
        }
    }

    //method to retrieve file extension
    private String getFileExtension(File file) {
        String name = file.getName();
        try {
            return name.substring(name.lastIndexOf(".") + 1);
        } catch (Exception e) {
            return "";
        }


    }

    //Method to retrieve files based on directory and extension
    public File[] finder( String dirName, String fileType){
        File dir = new File(dirName);
        File[] fileList = null;
        fileList = dir.listFiles(new FilenameFilter() {
            public boolean accept(File dir, String filename)
            { return filename.endsWith("."+fileType); }
        } );

        return fileList;

    }


}
