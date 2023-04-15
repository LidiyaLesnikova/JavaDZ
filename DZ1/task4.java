public class task4 {
    public static void main(String[] args) {
        /* +Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком 
        вопроса, например,  2? + ?5 = 69. Требуется восстановить выражение до верного равенства.
        Предложить хотя бы одно решение или сообщить, что его нет.
        */

        int q,w,e;
        do{
            q = getNumber(10);
            w = getNumber(10);
            e = getNumber(100);           
        } while ((q<0 && q>9) && (w<0 && w>9) && (e<10 && e>99));

        System.out.printf("Дано выражение: %d? + ?%d = %d \n",q,w,e);
    
        String rez = "";
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if ((q*10+i) + (j*10+w) == e){
                    rez += String.format("%d%d + %d%d = %d \n",q,i,j,w,e);
                }              
            }
        } 
        System.out.println((rez == "") ? "Возможных значений ? не существует" : "Возможные значения ?: \n"+rez);
    }

    /***
     * функция выдает случайное число с указанной разрядностью
     * @param i разрядность числа
     * @return случайное число с указанной разрядностью
     */
    public static int getNumber(int i) {
        double n = Math.random()*i;
        return (int)n;
    }
}
