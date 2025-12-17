public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the program for user registration and validation");

        RegexValidator regexValidator = new RegexValidator();
        //Check for validation of first name
        System.out.println("First Name");
        System.out.println("Ashutosh-> " + (regexValidator.validateFirstName("Ashutosh") ? "Valid" : "Invalid"));
        System.out.println("ashutosh-> " + (regexValidator.validateFirstName("ashutosh") ? "Valid" : "Invalid"));
        System.out.println("a-> " + (regexValidator.validateFirstName("a") ? "Valid" : "Invalid"));
        System.out.println("AshuH-> " + (regexValidator.validateFirstName("AshuH") ? "Valid" : "Invalid"));
        System.out.println();

        //Check for validation of Last name
        System.out.println("Last Name");
        System.out.println("Mishra-> " + (regexValidator.validateLastName("Mishra") ? "Valid" : "Invalid"));
        System.out.println("M-> " + (regexValidator.validateLastName("M") ? "Valid" : "Invalid"));
        System.out.println("mishra-> " + (regexValidator.validateLastName("mishra") ? "Valid" : "Invalid"));
        System.out.println("MishrA-> " + (regexValidator.validateLastName("MishrA") ? "Valid" : "Invalid"));

        System.out.println();

    }
}