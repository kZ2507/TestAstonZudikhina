import java.util.Scanner;

public class Numbers {
    int c;
    double d;

    public void num() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = in.nextInt();
        System.out.print("Введите второе число: ");
        int b = in.nextInt();

        if(a>b)
            System.out.println("a > b");
        else if (a<b)
            System.out.println("a < b");
        else
            System.out.println("a = b");

        c = a + b;
        System.out.println("Сумма: " + c);
        c = a - b;
        System.out.println("Разница: " + c);
        c = a * b;
        System.out.println("Произведение: " + c);

        if (b == 0)
            System.out.println("На ноль делить нельзя");
        else {
            d = (double) a / b;
            System.out.println("Результат деления: " + d);
        }
    }
}
