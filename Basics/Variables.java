package Basics;

public class Variables {
    public static void main(String[] args) {
        // Java has several different basic variable types by default
        // In this tutorial we will learn about Primitive Data Types.
        // Let's start with numbers

        // This is an integer. Integers can contain whole number values, but not decimals
        int x = 5;
        // You can also make integers negative
        int y = -5;

        // This is a double. A double can take any number values, including decimals!
        double z = 44.76;

        // Now that we've covered numbers, let's move on to non-numeric variables

        // This is a character, or 'char' for short. It can contain a single character value, and MUST be surrounded by single apostrophes
        char c = 'w';
        // Chars can be lowercase, capital, or not even letters at all! These are all valid characters.
        char u = 'B';
        char n = '1';
        char s = ';';
        // Notice how our character s is a semicolon. This works even though we end lines with semicolons since it's inside the apostrophes.
        // This is why apostrophes are important to remember with chars.

        // Lastly for the simple variable types, or "Primitive Data Types", we have the boolean. This variable can only be 'true' or 'false'.
        boolean bool1 = true;
        boolean bool2 = false;
        // Notice how true and false are NOT in quotes or apostrophes. These are both keywords, which means they must be types without quotes
        //      in order to function properly.

        // Lastly, you can print out a variable simply by typing in the variable name. Try changing the argument for the print statement below!
        System.out.println(x);
    }
}
