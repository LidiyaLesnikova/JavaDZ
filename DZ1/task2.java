public class task2 {
    public static void main(String[] args) {
        //Вывести все простые числа от 1 до 1000
        System.out.println(primeNumbers());
    }

    /***
     * 
     * @return строку с простыми числами от 1 до 1000
     */
    static String primeNumbers() {
        String rez = "";
        for (int i = 2; i <= 1000; i++) {
            int count = 0;
            for (int j = 2; j <= i; j++) {
              if (i%j==0) count++;
            }
            if (count == 1) {
                rez+= String.format("%d; ", i);
            }
        }
        return rez.substring(0, rez.length() - 2);
    }
}
