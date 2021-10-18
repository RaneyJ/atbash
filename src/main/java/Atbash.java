import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Atbash {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Asking for input from user
        System.out.println("Enter String : ");

        try {
            String input = reader.readLine();
            System.out.println(atbash(input));
        } catch (IOException ioe) {
            System.out.println(ioe);
        }

    }

    public static String atbash(String original) {
        String converted = "";
        for(char c : original.toCharArray()) {
            converted += convert(c);
        }

        return converted;
    }

    private static char convert(char c) {
        if(Character.isUpperCase(c)) {
            int pos = c - 65;
            return (char) (90 - pos);
        } else if(Character.isLowerCase(c)) {
            int pos = c - 97;
            return (char) (122 - pos);
        } else {
            return c;
        }
    }

}
