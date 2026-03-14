public class removeduplicate {

    public static void main(String[] args) {

        String str = "programming";// define a string and initialize an empty result string to store unique characters
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (result.indexOf(ch) == -1) {// check if the character is not already in the result string
                result += ch;
            }
        }

        System.out.println("After removing duplicates: " + result);// print the string after removing duplicates
    }
}