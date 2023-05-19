import java.util.Scanner;


public class UserInput {
    Scanner scanner = new Scanner(System.in);
  String myInput;

    public String getMyInput() {
        return scanner.next();
    }
}
