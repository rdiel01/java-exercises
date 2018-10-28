package excercises;
/*
Strings:
    The first sentence of Alice's Adventures in Wonderland is below. Store this sentence in a string,
    and then prompt the user for a term to search for within this string. Print whether or not the
    search term was found. See if you can make the search case-insensitive, so that searching for
    "alice", for example, prints true
 */

public class alice {
    public static void main(String[] args) {

        String entry = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        String input;
        java.util.Scanner in = new java.util.Scanner(System.in);

        System.out.println("I have the first sentence of 'Alice in Wonderland' in memory. Try guessing a word or entry.");
        input = in.next();

        System.out.println(entry.toLowerCase().contains(input.toLowerCase()));
    }
}
