/**
 * The main entry point for the application.
 * @author stephan knappstein A01208242
 * @version 1.0
 */

public class Main {
    public static void main(String[] args) {
        //Lambda expressions
        Wordable concat = (s, n) -> {
            String result = "";
            for (String word : WordDictionary.getWords()) {
                result =result + word;
            }
            return result;
        };
        Wordable repeat = (s, n) -> {  
            String result = "";
            for (String word : WordDictionary.getWords()) {
                result =result + word.repeat(n);
            }
            return result;
         };

        Wordable nth= (s,n) -> {
           String nthWord = WordDictionary.getWords().get(n);
            return nthWord;

        };

        //rewrite 
        Wordable reverse = (s, n) -> {
            String result = "";
            for (String word : WordDictionary.getWords()) {
                String reversedWord = "";
                for (int i = word.length() - 1; i >= 0; i--) {
                    reversedWord += word.charAt(i);
                }
                result += reversedWord;
            }
            return result;
        };

        if (args.length == 0) {
            System.out.println("No data entered. Please provide a word as a command-line argument.");
            return; // Exit the main method gracefully.
        }

        // Now it's safe to access the first argument.
        String argWord = args[0];
          int argInt = 0; // Default value

        // Safely parse the second argument if it exists
        if (args.length > 1) {
            try {
                argInt = Integer.parseInt(args[1]);
            } catch (NumberFormatException e) {
                System.out.println("Warning: The second argument '" + args[1] + "' is not a valid integer. Using default value 0.");
            }
        }

      

       
     /*  If the first command line argument is "concat" then Wordable returns a String with all words concatanated  together */
            
        if ("concat".equalsIgnoreCase(argWord) && args.length == 1) {
            String concatenatedString = concat.createString(argWord, 0);
            System.out.println("/nCommand Line argument : " + argWord);
        
            System.out.println(concatenatedString);
        }


        /* If the first command line argument is "repeat" then Wordable returns a String with words repeated args[1] times and concatanated together */ 
        if ("repeat".equalsIgnoreCase(argWord) && args.length == 2) {
            String repeatedWordConcatanated = repeat.createString(argWord, argInt);
            System.out.println("/nCommand Line argument args[0]: " + argWord + " args[1]: " + argInt);
            System.out.println(repeatedWordConcatanated);
        }


       /*If the first command line argument is 'nth' the Wordable returns the nth 
        * word of the array list in WordDictionary
        */
         if ("nth".equalsIgnoreCase(argWord) && args.length == 2) {
            String nthWord = nth.createString(argWord,argInt);
            System.out.println("\nCommand Line argument : " + argWord + " args[1]: " + argInt+ " will return the "+ argInt+  "th word of the list ");
            System.out.println("Which is : " + nthWord);
        } else {System.out.println("Incorrect number of arguments was provided");}

        if ("reverse".equalsIgnoreCase(argWord) && args.length == 1) {
            String reverseString = reverse.createString(argWord, 0);
            System.out.println("/nCommand Line argument : " + argWord);
            System.out.println(reverseString);
        } 
        }
     // Method reference to print entire list of words.   
    void printAll(){for (String word : WordDictionary.getWords()){
        System.out.println( " \n" + word);
    }};
    }

   

