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

        System.out.println("Email");
        System.out.println("abc@yahoo.com -> " + (regexValidator.validateEmail("abc@yahoo.com") ? "Valid" : "Invalid"));
        System.out.println("abc-100@yahoo.com -> " + (regexValidator.validateEmail("abc-100@yahoo.com") ? "Valid" : "Invalid"));
        System.out.println("abc.100@yahoo.com -> " + (regexValidator.validateEmail("abc.100@yahoo.com") ? "Valid" : "Invalid"));
        System.out.println("abc111@abc.com -> " + (regexValidator.validateEmail("abc111@abc.com") ? "Valid" : "Invalid"));
        System.out.println("abc-100@abc.net -> " + (regexValidator.validateEmail("abc-100@abc.net") ? "Valid" : "Invalid"));
        System.out.println("abc.100@abc.com.au -> " + (regexValidator.validateEmail("abc.100@abc.com.au") ? "Valid" : "Invalid"));
        System.out.println("abc@1.com -> " + (regexValidator.validateEmail("abc@1.com") ? "Valid" : "Invalid"));
        System.out.println("abc@gmail.com.com -> " + (regexValidator.validateEmail("abc@gmail.com.com") ? "Valid" : "Invalid"));
        System.out.println("abc+100@gmail.com -> " + (regexValidator.validateEmail("abc+100@gmail.com") ? "Valid" : "Invalid"));
        System.out.println("abc -> " + (regexValidator.validateEmail("abc") ? "Valid" : "Invalid"));
        System.out.println("abc@.com.my -> " + (regexValidator.validateEmail("abc@.com.my") ? "Valid" : "Invalid"));
        System.out.println("abc123@gmail.a -> " + (regexValidator.validateEmail("abc123@gmail.a") ? "Valid" : "Invalid"));
        System.out.println("abc123@.com -> " + (regexValidator.validateEmail("abc123@.com") ? "Valid" : "Invalid"));
        System.out.println("abc123@.com.com -> " + (regexValidator.validateEmail("abc123@.com.com") ? "Valid" : "Invalid"));
        System.out.println(".abc@abc.com -> " + (regexValidator.validateEmail(".abc@abc.com") ? "Valid" : "Invalid"));
        System.out.println("abc()*@gmail.com -> " + (regexValidator.validateEmail("abc()*@gmail.com") ? "Valid" : "Invalid"));
        System.out.println("abc@%*.com -> " + (regexValidator.validateEmail("abc@%*.com") ? "Valid" : "Invalid"));
        System.out.println("abc..2002@gmail.com -> " + (regexValidator.validateEmail("abc..2002@gmail.com") ? "Valid" : "Invalid"));
        System.out.println("abc.@gmail.com -> " + (regexValidator.validateEmail("abc.@gmail.com") ? "Valid" : "Invalid"));
        System.out.println("abc@abc@gmail.com -> " + (regexValidator.validateEmail("abc@abc@gmail.com") ? "Valid" : "Invalid"));
        System.out.println("abc@gmail.com.1a -> " + (regexValidator.validateEmail("abc@gmail.com.1a") ? "Valid" : "Invalid"));
        System.out.println("abc@gmail.com.aa.au -> " + (regexValidator.validateEmail("abc@gmail.com.aa.au") ? "Valid" : "Invalid"));


    }
}