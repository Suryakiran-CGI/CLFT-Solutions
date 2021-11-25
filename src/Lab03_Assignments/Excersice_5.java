package Lab03_Assignments;

import java.util.*;
import java.io.*;

import java.io.*;


class FileReader{
	
	public void displayFileData(String path) throws IOException {
		File file = new File(path);
        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader br = new BufferedReader(inputStreamReader);
  
        String line;
        int wordCount = 0;
        int characterCount = 0;
        int LineCount = 0;
  
        while ((line = br.readLine()) != null) {
            if (line.equals("")) {
            }
            else {
                characterCount += line.length();
                String words[] = line.split("\\s+");
                wordCount += words.length;
                String sentence[] = line.split("[!?.:]+");
                LineCount += sentence.length;
            }
        }
        if (LineCount >= 1) {
        }
        System.out.println("Total word count = "+ wordCount);
        System.out.println("Total number of Lines = "+ LineCount);
        System.out.println("Total number of characters = "+ characterCount);
	}
}

public class Excersice_5 {
    public static void main(String[] args) throws IOException {
        
    	Scanner sc = new Scanner(System.in);   //      "C:\\Users\\SVUDDAND\\Downloads\\DemoProgramReader.txt"
    	System.out.print("Enter the file path : ");
    	String path = sc.nextLine();
    	FileReader fr = new FileReader();
    	fr.displayFileData(path);
    }
}





/* OUTPUT : 
 * Enter the file path : C:\\Users\\SVUDDAND\\Downloads\\DemoProgramReader.txt
   Total word count = 9
   Total number of Lines = 1
   Total number of characters = 41
 * */
