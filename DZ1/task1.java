import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        //Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number n ");
        int n = scanner.nextInt();
        System.out.println(calculateProductSum(n));
        scanner.close();
    }

    /***
     * 
     * @param n число, заданное пользователем
     * @return строку с n-ым треугольным числом и n!
     */
    static String calculateProductSum(int n) {
        int prodact = 1;
        int sum = 0; 
        for (int i = 1; i <= n; i++) {
            prodact*=i;
            sum+=i;
        }
        return String.format("%d-ое треугольного числа = %d, %d! = %d \n", n, sum, n, prodact);
    }
}
