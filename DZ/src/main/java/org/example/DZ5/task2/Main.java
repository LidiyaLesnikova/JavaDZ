package org.example.DZ5.task2;

import java.util.*;
import java.util.stream.Collectors;

/*Пусть дан список сотрудников:
Иван Иванов
Светлана Петрова
Кристина Белова
Анна Мусина
Анна Крутова
Иван Юрин
Петр Лыков
Павел Чернов
Петр Чернышов
Мария Федорова
Марина Светлова
Мария Савина
Мария Рыкова
Марина Лугова
Анна Владимирова
Иван Мечников
Петр Петин
Иван Ежов
Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. Отсортировать
по убыванию популярности.*/
public class Main {
    public static void main(String[] args) {
        ArrayList<String> wokers = getListWokers();
        countDoubleName(wokers);
    }

    static void countDoubleName(ArrayList<String> wokers) {
        Map<String, Integer> mp = new HashMap<>();
        String name = "";
        for (int i = 0; i < wokers.size(); i++) {
            name = wokers.get(i).split(" ")[0];
            mp.putIfAbsent(name, 0);
            mp.put(name, mp.get(name)+1);
        }

        Map<String, Integer> sortedMp = mp.entrySet().stream()
                .sorted(Comparator.comparingInt(e -> -e.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> { throw new AssertionError(); },
                        LinkedHashMap::new
                ));

        for (var item : sortedMp.entrySet()) {
            System.out.println(item.getKey()+" = "+item.getValue());
        }
    }

    static ArrayList<String> getListWokers() {
        ArrayList<String> wokers = new ArrayList<>();
        wokers.add("Иван Иванов");
        wokers.add("Светлана Петрова");
        wokers.add("Кристина Белова");
        wokers.add("Анна Мусина");
        wokers.add("Анна Крутова");
        wokers.add("Иван Юрин");
        wokers.add("Петр Лыков");
        wokers.add("Павел Чернов");
        wokers.add("Петр Чернышов");
        wokers.add("Мария Федорова");
        wokers.add("Марина Светлова");
        wokers.add("Мария Савина");
        wokers.add("Мария Рыкова");
        wokers.add("Марина Лугова");
        wokers.add("Анна Владимирова");
        wokers.add("Иван Мечников");
        wokers.add("Петр Петин");
        wokers.add("Иван Ежов");
        return wokers;
    }
}
