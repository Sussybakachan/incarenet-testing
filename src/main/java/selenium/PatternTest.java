package selenium;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTest {
    // System.out.println(PatternTest.useRegex("2022-10-26T12:34:14.265Z"));
    //returns true
    public static boolean useRegex(final String input) {
        // Compile regular expression
        final Pattern pattern = Pattern.compile("^[0-9]{4}-[0-9]{2}-[0-9]{2}T[0-9]{2}:[0-9]{2}:[0-9]{2}(\\.[0-9]{1,3})?Z$");
        // Match regex against input
        final Matcher matcher = pattern.matcher(input);
        // Use results...
        return matcher.matches();
    }
}