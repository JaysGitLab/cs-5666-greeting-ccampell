package greeting;
import java.io.*;

/**
 * Hello.java
 * @author Chris Campell
 * @version 2/2/2017
**/
public class Hello {
    /**
     * main - Main method for greeting assignment.
     * @param args -Command line arguments. 
     * @return void -Upon completion, console will output Hello, etc...
     *
    **/
    public static void main(String[] args) {
        String username = "";
        if (args.length != 0) {
            username = args[0]; 
            // If username, ensure proper case
            String[] userNamePropCase = username.split("\\s+");
            username = "";
            for (int i = 0; i < userNamePropCase.length; i++) {
                if (i != 0) {
                    username += " ";
                } 
                char firstLetter = userNamePropCase[i].charAt(0);
                firstLetter = Character.toUpperCase(firstLetter);
                System.out.printf("first letter: %c\n", firstLetter);
                String restOfName = userNamePropCase[i].substring(1, userNamePropCase[i].length());
                username += (firstLetter + restOfName);
            }
            System.out.printf("Hello, %s!\n", username);
        } else {
            System.out.println("Hello, Chris!");
        }
    }
}

