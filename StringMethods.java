class StringMethods {

    public static void main(String[] args) 
    {
        String text ="We realizes that while our workers were thriving, the surrounding villages were still suffering. It became our goal to uplift their quality of life as well. I remember seeing a family of 4 on a motorbike in the heavy Bombay rain — I knew I wanted to do more for these families who were risking their lives for lack of an alternative” The alternative mentioned here is the Tata Nano, which soon after came as the worlds cheapest car on retail at a starting price of only Rs 1 lakh. These were the words of Ratan Tata in a recent post by Humans of Bombay which formed the basis of his decision to come up with a car like Tata Nano";

        // Using various String methods

        // returns a character at a specific index position in a string.
        char characterAtIndex10 = text.charAt(10);
        System.out.println("\nCharacter at index 10: " + characterAtIndex10);
        
        System.out.println();


        // returns a positive number (difference of character value)
        String anotherString = "Comparison string";
        int compareResult = text.compareTo(anotherString);
        System.out.println("Compare to 'Comparison string': " + compareResult);

        System.out.println();

        // returns a combined string like appending another string.
        String concatString = text.concat(". Additional text appended.");
        System.out.println("Concatenated String: " + concatString);

        System.out.println();

        // returns true if the sequence of char values is found in this string otherwise returns false.
        boolean containsBombay = text.contains("Bombay");
        System.out.println("Contains 'Bombay': " + containsBombay);

        System.out.println();

        // returns true if string ends with the given suffix; else returns false.
        boolean endsWithNano = text.endsWith("Nano");
        System.out.println("Ends with 'Nano': " + endsWithNano);


        System.out.println();

        // returns true if all characters are equal else retrun false
        String anotherText = "Different text";
        boolean isEqual = text.equals(anotherText);
        System.out.println("Is equal to 'Different text': " + isEqual);

        System.out.println();

        // If any character is not matched, it returns false, else returns true.
        String upperCaseText = "WE REALIZES THAT WHILE OUR WORKERS WERE THRIVING";
        boolean isEqualIgnoreCase = text.equalsIgnoreCase(upperCaseText);
        System.out.println("Is equal ignoring case: " + isEqualIgnoreCase);



        System.out.println();

        // returns the formatted string by given locale, format and arguments.
        String formattedString = String.format("Formatted: %s", text);
        System.out.println(formattedString);


        System.out.println();

        // Returns Sequence of bytes
        byte[] textBytes = text.getBytes();
        System.out.println("String as bytes: " + textBytes.length);

        System.out.println();

        // It doesn't return any value
        char[] charArray = new char[20];
        text.getChars(5, 25, charArray, 0);
        System.out.println("Chars from index 5 to 25: " + new String(charArray));


        System.out.println();

        // returns index of the searched string or character
        int indexOfTata = text.indexOf("Tata");
        System.out.println("Index of 'Tata': " + indexOfTata);


        System.out.println();

        // Returns interned string
        String internedText = text.intern();
        System.out.println("Interned String: " + internedText);


        System.out.println();

        // Returns true if length is 0 otherwise false
        boolean empty = text.isEmpty();
        System.out.println("Is empty: " + empty);


        System.out.println();

        // Returns joined string with delimiter
        String joinedString = String.join("-", "Part1", "Part2", "Part3");
        System.out.println("Joined String: " + joinedString);


        System.out.println();

        // returns last index of the string
        int lastIndexTata = text.lastIndexOf("Tata");
        System.out.println("Last index of 'Tata': " + lastIndexTata);


        System.out.println();

        // returns the length of the string
        int textLength = text.length();
        System.out.println("Length of the string: " + textLength);


        System.out.println();

        // returns the replaced string
        String replacedString = text.replace("Nano", "Tata Nano");
        System.out.println("Replaced 'Nano' with 'Tata Nano': " + replacedString);



        System.out.println();

        // replace all the occurrences of a single word or set of words
        String replacedAllString = text.replaceAll("Tata", "New Tata");
        System.out.println("Replaced all 'Tata' with 'New Tata': " + replacedAllString);



        System.out.println();

        // Returns array of strings
        String[] parts = text.split(" ");
        System.out.println("Splitting the text into parts:");
        for (String part : parts) {
            System.out.println(part);
        }

        System.out.println();


        // returns true if this string starts with the given prefix; else returns false.
        boolean startsWithWe = text.startsWith("We");
        System.out.println("Starts with 'We': " + startsWithWe);


        System.out.println();

        // Returns specified string
        String subString = text.substring(20, 40);
        System.out.println("Substring from index 20 to 40: " + subString);



        System.out.println();

        // returns a newly created character array, its length is similar to this string
        char[] charArrayFromString = text.toCharArray();
        System.out.println("Converted to char array: " + new String(charArrayFromString));



        System.out.println();

        // converts the text into lowercase
        String lowerCaseText = text.toLowerCase();
        System.out.println("Lowercase text: " + lowerCaseText);


        System.out.println();

        // converts the text into Uppercase
        String upperCaseText2 = text.toUpperCase();
        System.out.println("Uppercase text: " + upperCaseText2);



        System.out.println();

        // Returns string with omitted leading and trailing spaces
        String trimmedText = text.trim();
        System.out.println("Trimmed text: " + trimmedText);


        System.out.println();

        // Returns string representation of given value
        int value = 100;
        String valueAsString = String.valueOf(value);
        System.out.println("Value of '100' as string: " + valueAsString);

        System.out.println();
    }
}
