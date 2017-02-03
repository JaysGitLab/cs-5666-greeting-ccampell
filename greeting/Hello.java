package greeting;
import java.io.*;

public class Hello {
    public static void main(String[] args) {
        String username = "";
        if (args.length != 0) {
            username = args[0]; 
            System.out.printf("Hello, %s!\n", username);
        } else {
            System.out.println("Hello, Chris!");
        }
    }
}

