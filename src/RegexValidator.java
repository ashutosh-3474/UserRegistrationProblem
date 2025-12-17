import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Custom class for regex pattern and matcher
public class RegexValidator {
    //Regex pattern for first name
    private static final String  FirstNameRegex = "^[A-Z][a-zA-Z]{2,}$";


    //Regex pattern for Last name
    private static final String  LastNameRegex = "^[A-Z][a-zA-Z]{2,}$";

    //Method to validate the input with the regex pattern
    private static boolean validate(String input, String regex)
    {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    //Method to validate first name
    public static boolean validateFirstName(String firstName) {
        return validate(firstName, FirstNameRegex);
    }

    //Method to validate last name
    public static boolean validateLastName(String lastName) {
        return validate(lastName, LastNameRegex);
    }
}
