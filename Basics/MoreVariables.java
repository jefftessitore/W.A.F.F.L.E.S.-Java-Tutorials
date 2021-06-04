package Basics;

public class MoreVariables {
    public static void main(String[] args) {
        // We can expand upon our basic variables knowledge
        // Next, we'll learn about Strings.

        String s = "This is a string.";
        // Strings must be surrounded by quotes. Notice how the keyword String is capitalized, unlike our primitive data types.
        // This is because String is technically a class in Java, but it comes prepackaged with Java installs so we can use it like a variable.
        // More on classes and String manipulation later.

        // Lastly, Java contains a 'float' data type, which is another type that can contain decimals.
        float f = (float)3.14159;
        // You'll notice that I had to put (float) in front of the number. This is because by default, Java interprets all decimal values as doubles.
        // Putting (float) in front of the number performed something called typecasting, which is where Java will take the input and convert
        //      it to the given datatype however it needs to.
        // Alternatively, we can put an 'f' on the end of our number to tell Java that we need a float value.
        float f2 = 3.14159f;

        // For the most part, we will not use floats unless a class or package specifically requires a float input. For the purposes of our tutorials,
        //      we will stick to using doubles.

        // Java also lets us be more specific with its primitive data types. We can add different keywords in front of the primitive data type
        //      if we need to be more specific.

        // We're going to be getting into some math here, as programming really relies on binary math. It's important to know when working with
        //      extremely large numbers or extremely specific decimal numbers.
        // For this section, we'll simply take a look at the different specifications we can make with some notes and the numbers they can hold
        //      beside each type.

        byte b = 100;           // An integer type that can store values from -128 to 127, or -(2^7) to (2^7)-1
        short si = 32000;       // An integer type that can store values from -32,768 to 32,767, or -(2^15) to (2^15)-1
        // Note: I used 'si' since we already used 's' for our String earlier
        int i = 100000;         // The default integer type can store values from -(2^31) to (2^31)-1
        long l = 1234567890L;   // An integer type that can store values from -(2^63) to (2^63)-1. Notice how we end our number with 'L'

        // The math behind these specific values have to do with the number of bytes each variable is allowed to take up. A byte is a single byte,
        //      a short is two bytes, an int is four, and a long is eight. To calculate the minimum value, simply perform -1*(2^(8*bytes-1)). 
        //      To calculate the maximum value, make that number positive and subtract one.

        // To talk more about the difference between floats and decimals, we need to look at how precise they can be.
        // Floats can store fractional values between 3.4*10^(-38) and 3.4*10^(38).
        // Doubles can store fractional values between 1.7*10^(-308) and 1.7*10^(308).
        // This means we can be a lot more precise with our doubles than our floats! As a note, floats take up four bytes and doubles take up eight.
        // With doubles and floats, we can also use scientific notation.
        float slightlyPrecise = 1.4e-15f;   // notice the lowercase 'e' and the inclusion of 'f'
        double morePrecise = 2.71E-100d;    // notice the uppercase 'E' and the inclusion of 'd'
        // Try printing these values in the print statement below.
        System.out.println(slightlyPrecise);
        // Notice how the output keeps its scientific notatation! More on how to format outputs later.

        // Lastly, we'll talk a little more about characters.
        // Characters can also take a number as an input and Java will attempt to find its equivalent on the ASCII character table.
        char c = 65;
        // This character will contain an uppercase 'A'. Try it below!
        System.out.println(c);
        // Note that you should only attempt this with numbers from 32 to 126. 0-31 and 127 are "control characters" and may cause weird issues.

        // That's a lot! This is likely more than we will need for most cases, but it's a good foundation of knowledge to have.
        // Next we'll take a look at basic math operations in Java and look a little bit into the Java Math class.
    }
}
