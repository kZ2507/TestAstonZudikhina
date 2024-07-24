public class Arrays {
    public void arr() {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Целые числа: ");
        for (int j : a) {
            if (j % 2 == 0)
                System.out.print(j + " ");
        }
    }
}
