import java.util.Scanner;

public class HelloWorld{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String account = scanner.next();
        String password = scanner.next();

        if(account.equals("user") && password.equals("user")){
            System.out.println("login success.");
        }else{
            System.out.println("login fail");
        }
        
       scanner.close();
    }
}

