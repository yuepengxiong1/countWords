/*
 * Yuepeng Xiong
 * 11/11/24
 * 
 * This program counts the number of occurences of every word
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        //check if user passes a file
        if (args.length == 1) {
            //checks for if user passes a .txt file
            if (!args[0].endsWith(".txt")) {
                System.out.println("The file must be a .txt file");
            } else {
                String file = args[0]; //store the file name 
                BufferedReader reader = new BufferedReader(new FileReader(file)); //for reading the contents
                String line;
                List<String> words = new ArrayList<>(); //storing the words. this will expand b/c arraylist is adjustable
                List<Integer> counts = new ArrayList<>(); //same thing but for a counter of words

                //this while loop reads from line to line until null
                while ((line = reader.readLine()) != null) {
                    String word = line.trim(); //trim whitespace from end to end. stores what word is on that line to word variable
                    word = word.toLowerCase(); //so that case does not matter

                    //if word is NOT empty, do...
                    if (!word.isEmpty()) {

                        //set the index to what word is currently is on the line. 
                        //if it exists in word arraylist, it will output the word in the index of word in that arraylist. 
                        //if it does not exist, index is set to -1 since it doesnt exist in the arraylist
                        int index = words.indexOf(word); 
                        //this if statment will keep counting the same word. 
                        if (index != -1) {
                            //syntax: set count of (the index of the word, the index of the counter for that word added by 1)
                            counts.set(index, counts.get(index) + 1);
                        } else {
                            //this will add a new word in the arraylist and add the counter of it by 1.
                            //the index of words and counts are the same to associate them with each other
                            words.add(word);
                            counts.add(1);
                        }
                    }
                }
                reader.close();

                //output the instance of everyword with the counter
                for (int i = 0; i < words.size(); i++) {
                    System.out.println(words.get(i) + ": " + counts.get(i));
                }
            }
        
          //if the user passes less than 1 file or more than 1 file  
        } else if (args.length < 1 || args.length > 1) {
            System.out.println("No file provided or too many files provided");
        }   
    }
}