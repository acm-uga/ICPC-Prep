import java.util.Scanner;

public class twostones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num % 2 == 1 ? "Alice" : "Bob");
    }
}