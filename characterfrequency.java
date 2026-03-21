public class characterfrequency {
    public static void main(String[] args) {// Count frequency of characters in a strings
        String str = "banana";
        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {    // loop through each character in the string
            freq[str.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++) {
            if (freq[i] != 0) {
                System.out.println((char) i + " : " + freq[i]);// print character and its frequency
            }
        }
    }// for loop to count frequency of characters in the string and print the result    
}//
