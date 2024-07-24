public class Main {
    public static void main(String[] args) {
        try {
            Numbers nums = new Numbers();
            nums.num();
        } catch (Exception e) {
            System.out.println("Вы ввели не целое число");
        }

        Words word = new Words();
        word.line();

        Arrays arrays = new Arrays();
        arrays.arr();
    }
}