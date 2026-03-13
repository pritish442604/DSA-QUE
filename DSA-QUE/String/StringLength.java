public class StringLength {
    public static void main(String[] args) {// define a string and initialize a count variable to keep track of the length
        String str = "amazon";
        int count = 0;

        for (char c : str.toCharArray()) {// iterate through each character in the string and count them
            count++;
        }

        System.out.println("Length: " + count);// print the length of the string
    }
}