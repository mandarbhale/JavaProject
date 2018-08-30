
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class FirstThree {
	 static int count =0;  
     public static void main(String [ ] args) throws FileNotFoundException {
           
    	 	new FirstThree().findLongestWords();
         }

     public String findLongestWords() throws FileNotFoundException {

       String longest_word = "";
       String current;
       Scanner sc = new Scanner(new File("D:\\Docs\\first.txt"));


       while (sc.hasNext()) {
          current = sc.next();
          if(count<3)
          System.out.println(current);
          count++;

       }
         System.out.println("\n"+longest_word+"\n");
            return longest_word;
            }
}
