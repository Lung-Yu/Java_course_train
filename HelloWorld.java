import java.util.Scanner;

public class HelloWorld{

    private static final String[][] ACCOUNTS = {
        {"user", "user"},
        {"peter", "123"},
        {"admin", "admin"}
    };

    private static boolean validateLogin(String account, String password) {
        for (String[] credentials : ACCOUNTS) {
            if (credentials[0].equals(account) && credentials[1].equals(password)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String account = scanner.next();
        String password = scanner.next();
        
        if(validateLogin(account, password)){
            System.out.println("login success.");
        }else{
            System.err.println("login fail.");
        }
        
       scanner.close();
    }
}

