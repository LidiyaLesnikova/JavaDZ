package org.example.DZ6;

/*• Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
• Создать множество ноутбуков.
• Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет
ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
“Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
• Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно
также в Map.
• Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.*/

public class Main {
    public static void main(String[] args) {
        List<Notebook> notebookList = getNotebooks();
        System.out.println(notebookList);
//        Integer maxSimpleNumber = bookList.stream().max(Comparator.comparingInt(Book::getNumberPages)).get().numberPages;
//        List<Integer> simpleNumbers = getSimpleNumbers(maxSimpleNumber);
//        bookList = bookList.stream().filter(book -> book.author.contains("A") && book.yearPublication>=2010 &&
//        simpleNumbers.contains(book.numberPages)).toList();
//        System.out.println(bookList);
    }

    public static List<Notebook> getNotebooks() {
            ArrayList<Notebook> notebookList = new ArrayList<Notebook>();
            notebookList.add(new Notebook("Lenovo", 512, 8, "Windows", "grey", "China"));
            notebookList.add(new Notebook("Lenovo", 512, 8, "Windows", "grey", "China");
            notebookList.add(new Notebook("Lenovo", 512, 8, "Windows", "grey", "China"));

            return notebookList;
    }

//    String brandNotebook;
//    Integer volumeHD;
//    Integer volumeRAM;
//    String nameOS;
//    String colorProduct ;
//    String countryManufacture;

//    static List<Integer> getSimpleNumbers(int n) {
//            ArrayList<Integer> simpleNumbers = new ArrayList<>();
//            for (int i = 2; i <= n; i++) {
//            int count = 0;
//            for (int j = 2; j <= i; j++) {
//            if (i%j==0) count++;
//            }
//            if (count == 1) {
//            simpleNumbers.add(i);
//            }
//            }
//            return simpleNumbers;
//    }
}
