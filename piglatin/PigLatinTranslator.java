package piglatin;

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
       for (int i=0; i<input.length(); i++){
      String currentLetter = input.substring(i,i+1);
      if (isVowel(currentLetter)){
        firstVowel=i;
        break;
      }
    }
    return(input.substring(firstVowel)+input.substring(0, firstVowel)+"ay");

        //return result;
    }

    // Add additonal private methods here.
    // For example, I had one like this:
    // private static String capitalizeFirstLetter(String input)
    static int firstVowel;
    public static boolean isVowel(String letter)
  {
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
