import java.util.Scanner;

public class HelloWorld{

    private static final Users[] ACCOUNTS = {
        new Users("user", "user"),
        new Users("peter", "123"),
        new Users("admin", "admin")
    };


    private static boolean validateLogin(String account, String password) {
        for (Users user : ACCOUNTS) {
            if (user.getUsername().equals(account) && user.getPassword().equals(password)) {
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

