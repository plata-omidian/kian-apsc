package piglatin;

import java.util.Scanner;

public class PigLatinTranslator {
    public static Book translate(Book input) {
        Book translatedBook = new Book();

        // TODO: Add code here to populate translatedBook with a translation of the
        // input book.
        // Curent do-nothing code will return an empty book.
        // Your code will need to call translate(String input) many times.

        return translatedBook;
    }

    public static String translate(String input) {
        System.out.println("  -> translate('" + input + "')");

        String result = "";

        // TODO: translate a string input, store in result.
        // The input to this function could be any English string.
        // It may be made up of many words.
        // This method must call translateWord once for each word in the string.
        result = translateWord(input);

        return result;
    }

    private static String translateWord(String input) {
        System.out.println("  -> translateWord('" + input + "')");

        String result = "";

        // TODO: Replace this code to correctly translate a single word.
        // Start here first!
        // This is the first place to work.
        if(input==null||input.trim().isEmpty()){
          return("");
        }
        Scanner scnr = new Scanner(input);
       // String word="";
       // String fullString="";
      //  while(scnr.hasNext()){
      //   word=scnr.next();
        String word=input;
        if(word.length()>0){
         //find the punc 
          if(word.endsWith(".")){
            tail=word.substring(word.length()-1);
            String temp =(word.substring(firstVowel,word.length()-1)+word.substring(0, firstVowel)+"ay"+tail);
            if(Character.isUpperCase(word.charAt(0))){
             return temp.substring(0,1).toUpperCase()+temp.substring(1).toLowerCase();
            }
            return temp;
          }
         // find the vowel
          for (int i=0; i<word.length(); i++){
      String currentLetter = word.substring(i,i+1);
      if (isVowel(currentLetter)){
        firstVowel=i;
        break;
      }
    }
          if(Character.isUpperCase(word.charAt(0))){
            return(word.substring(firstVowel,firstVowel+1).toUpperCase()+word.substring(firstVowel+1)+word.substring(0, firstVowel).toLowerCase()+"ay");
          }
       
    return(word.substring(firstVowel)+word.substring(0, firstVowel)+"ay");
    }
    else{
      return(word);
  
    }
        

        //return result;
    }

    // Add additonal private methods here.
    // For example, I had one like this:
    // private static String capitalizeFirstLetter(String input)
    static int firstVowel;
    static String tail;
    public static boolean isVowel(String letter){
    if (letter.length() == 1)
    {
      String vowels = "aeiouy";
      if (vowels.indexOf(letter) != -1)
      {
        return true;
      }
    }
    return false;
  }
}
