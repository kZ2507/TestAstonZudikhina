import java.util.Scanner;

public class Words {
    public void line() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первую строку: ");
        String a = in.next();
        System.out.println("Введите вторую строку: ");
        String b = in.next();

        if (a.equals(b))
            System.out.println("Строки идентичны");
        else
            System.out.println("Строки неидентичны");
    }
}
