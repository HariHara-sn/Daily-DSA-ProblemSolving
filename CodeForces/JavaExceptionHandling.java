//Custom Exception - important
class AgeException extends Exception {

    AgeException() {
        super("Not eligible to vote");
    }

    AgeException(String s) {
        super(s);
    }

}

public class JavaExceptionHandling {
    public static void agefun(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException();
        } else if (age == 18) {
            throw new AgeException("Wait for a Year!!");
        }
        System.out.println("Welcome to Arasiyal ");
    }

    public static void main(String[] args) {
        try {
            agefun(18);

        } catch (AgeException e) {
            System.out.println(e);
        }

    }
}
