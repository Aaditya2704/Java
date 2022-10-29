public class PrintNames {

    static void Print(String name, int n, int i) {
        if (i == n)
            return;
        System.out.println(name);
        i++;
        Print(name, n, i);
    }

    public static void main(String[] args) {
        String name = "Aaditya";
        int n = 6;
        Print(name, n, 1);
    }
}
