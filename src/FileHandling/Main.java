package FileHandling;

import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        // How to write a file using Java (4 popular options)

        // FileWriter = Good for small or medium-sized text files
        // BufferedWriter = Better performance for large amounts of text
        // PrintWriter = Best for structured data, like reports or logs
        // FileOutputStream = Best for binary files (e.g., images, audio files)

        String filePath = "C:\\Users\\Dell\\OneDrive\\Desktop\\test.txt";
        String textContent = "My name is Dheeraj Soni.\nI am a student.";
        try(FileWriter writer = new FileWriter(filePath)){
            writer.write(textContent);
            System.out.println("File has been written.");
        } catch(FileNotFoundException e){
            System.out.println("Could not locate file location!");
        }
        catch (IOException e){
            System.out.println("Could not write file!");
        }



        //How to read a file

        // How to read a file using Java (3 popular options)

        // BufferedReader + FileReader: Best for reading text files line-by-line
        // FileInputStream: Best for binary files (e.g., images, audio files)
        // RandomAccessFile: Best for read/write specific portions of a large file

       try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
           System.out.println("That file exists.");
           String line;
           while((line = reader.readLine()) != null ){
               System.out.println(line);
           }
       } catch (FileNotFoundException e){
           System.out.println("Could not locate file.");
       } catch (Exception e) {
           System.out.println("Something went wrong!");
       }
    }
}
