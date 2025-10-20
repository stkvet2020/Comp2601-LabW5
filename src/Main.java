/**
 * The main entry point for the application.
 * @author stephan knappstein A01208242
 * @version 1.0
 */
/* To Do's
 * JavaDoc HTML file .zip, Java docs for classes and methods,
code comments, coding standards are followed, UML diagram.
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
            // expressionLambda
            Wordable wordy = (s, n) -> {
            String result = "";
            for (String word : WordDictionary.getWords()) {
                result =result + word;
            }
            return result;
        };

            String concatenatedString = wordy.createString(argWord, 0);
            System.out.println("\nCommand Line argument : " + argWord);
        
            System.out.println(concatenatedString);
        }


        /* If the first command line argument is "repeat" then Wordable returns a String with words repeated args[1] times and concatanated together */ 
        if ("repeat".equalsIgnoreCase(argWord) && args.length == 2) {
           // appropriate lambda expresion 
            Wordable wordy = (s, n) -> {  
            String result = "";
            for (String word : WordDictionary.getWords()) {
                result =result + word.repeat(n);
            }
            return result;
         };

            String repeatedWordConcatanated = wordy.createString(argWord, argInt);
            System.out.println("/nCommand Line argument args[0]: " + argWord + " args[1]: " + argInt);
            System.out.println(repeatedWordConcatanated);
        }


       /*If the first command line argument is 'nth' the Wordable returns the nth 
        * word of the array list in WordDictionary
        */
         if ("nth".equalsIgnoreCase(argWord) && args.length == 2) {
            //appropriate lambda expression
            Wordable wordy= (s,n) -> {
           String nthWord = WordDictionary.getWords().get(n);
            return nthWord;

        };



            String nthWord = wordy.createString(argWord,argInt);
            System.out.println("\nCommand Line argument : " + argWord + " args[1]: " + argInt+ " will return the "+ (argInt+1) + "th word of the list ");
            System.out.println("Which is : " + nthWord);
        } 
        /*If the only command line argument is 'reverse' the Wordable returns the 
        * word of the array list in WordDictionary
        */
        if ("reverse".equalsIgnoreCase(argWord) && args.length == 1) {
            String reverseString = reverse.createString(argWord, 0);
            System.out.println("/nCommand Line argument : " + argWord);
            System.out.println(reverseString);
        } 


         // Here we use a method reference to a static method.
            // The `Runnable` interface is a perfect fit for a method that takes no arguments and returns nothing.
            Runnable displayAll = Main::printAll;
            displayAll.run(); // This executes the printAll method.
            

        }

        /**
     * Prints all words from the WordDictionary to the console, each on a new line.
     * This method uses a method reference for concise and modern Java code.
     */
    public static void printAll() {
        System.out.println("\nDefault implementation of method reference:");
        System.out.println("    All words in the dictionary:");
        WordDictionary.getWords().forEach(System.out::println);
    }
    
}

    

   
    

