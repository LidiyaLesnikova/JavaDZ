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

import java.lang.reflect.Field;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Notebook> notebookList = getNotebooks();
        Map<Integer, Object> filter = selectUser(notebookList);
        System.out.println((filter.isEmpty()) ? "Фильтр пользотелем не задан. Полный список:"+notebookList:filterNotebook(notebookList,filter));
    }

    /**
     * Создание множества ноутбуков
     * @return список ноутбуков
     */
    public static List<Notebook> getNotebooks() {
            ArrayList<Notebook> notebookList = new ArrayList<>();
            notebookList.add(new Notebook("Lenovo","SSD",512, 8, "Windows 10", "grey", "China", 20000.00));
            notebookList.add(new Notebook("Lenovo","HD",218, 4, "Windows 8", "black", "China", 15000.00));
            notebookList.add(new Notebook("iRU","HD",1000, 8, "Windows 10", "grey", "Russia", 30000.00));
            notebookList.add(new Notebook("Acer","SSD" ,512, 8, "Windows 10", "grey", "China", 30000.00));
            notebookList.add(new Notebook("Acer","HD" ,218, 4, "Windows 10", "grey", "China", 19000.00));
            notebookList.add(new Notebook("Echips","SSD" ,512, 8, "Windows 11", "grey", "China", 18000.00));
            notebookList.add(new Notebook("Makbook","SSD" ,512, 16, "macOS", "white", "China", 80000.00));
            return notebookList;
    }

    /**
     * метод запрашивает у пользователя критерии отбора ноутбуков из имеющихся в базе и возвращает полученный фильтр
     * @param notebookList список всех ноутбуков
     * @return отбор (фильтр), определенный пользователем.
     */
    public static Map<Integer, Object> selectUser(List<Notebook> notebookList) {
        Map<Integer, Object> filter = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        int n = 0;
        do {
            System.out.println("\n");
            Field[] fields = Notebook.class.getDeclaredFields();
            for(int i = 0; i < fields.length; i++) {
                System.out.printf("%d - %s\n",i+1,fields[i].getName());
            }
            System.out.println(
                    "---------\n" +
                    "0 - EXIT\n" +
                    "Введите номер, соответствующий необходимому критерию отбора: ");
            n = scan.nextInt();
            scan.nextLine();
            if (n>=1 && n<=fields.length) {
                Set<Object> list = new HashSet<>();
                for (Notebook notebook : notebookList) {
                    list.add(notebook.getField(n));
                }
                System.out.println(list);

                if (list.iterator().next() instanceof String ) {
                    System.out.println("введите отбор из приведенных выше: ");
                    String rez = scan.nextLine().toLowerCase();
                    if (list.toString().toLowerCase().contains(rez))
                        filter.put(n, rez);
                    else
                        System.out.println("Таких параметров нет");
                } else if (list.iterator().next() instanceof Integer) {
                    System.out.println("введите отбор (минимум из приведенных выше)): ");
                    Integer rez = scan.nextInt();
                    filter.put(n, rez);
                } else {
                    System.out.println("введите диапазон цены от: ");
                    List<Double> price = new ArrayList<>(2);
                    price.add(scan.nextDouble());
                    System.out.println("введите диапазон цены до: ");
                    price.add(scan.nextDouble());
                    filter.put(n, price);
                }
            }
            else {
                if (n!=0) System.out.println("Неверно введенный номер, попробуйте еще раз");
            }
        } while (n!=0);
        scan.close();
        System.out.println("Отбор: "+filter);
        return filter;
    }

    /**
     *
     * @param notebookList список всех ноутбуков
     * @param filter отбор (фильтр), определенный пользователем
     * @return отфильтрованный список ноутбуков
     */
    public static List<Notebook> filterNotebook(List<Notebook> notebookList, Map<Integer, Object> filter) {
        for (int i = 1; i <= Notebook.class.getDeclaredFields().length; i++) {
            if (filter.containsKey(i)) {
                Integer temp = i;
                if (filter.get(i) instanceof String) {
                    notebookList = notebookList.stream().filter(nb -> nb.getField(temp).toString().toLowerCase().contains((String)filter.get(temp))).toList();
                } else if (filter.get(i) instanceof Integer) {
                    notebookList = notebookList.stream().filter(nb -> (Integer) nb.getField(temp) >= (Integer) filter.get(temp)).toList();
                } else {
                    notebookList = notebookList.stream().filter(nb -> ((Double) nb.getField(temp) >= ((ArrayList<Double>)filter.get(temp)).get(0)) &&
                            ((Double) nb.getField(temp) <= ((ArrayList<Double>)filter.get(temp)).get(1))).toList();
                }
            }
        }
        return notebookList;
    }
}
