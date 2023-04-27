package org.example.DZ5.task1;
/*Подсчитать количество искомого слова, через map (наполнением значение, где искомое слово будет являться ключом),
вносить все слова не нужно
Пример:
Россия идет вперед всей планеты. Планета — это не Россия.
Запрос: Россия
Ответ: Россия - 2
toLoverCase().
(Усложнение - игнорировать пунктуацию)**/

import java.util.List;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String text = "Россия идет вперед всей планеты. Планета — это не Россия.";
        List<String> textList = Arrays.asList(text.toLowerCase().replaceAll("\\.|\\,|\\-|\\—","").split(" "));
        countWord(textList, "Россия");
    }

    static void countWord(List<String> text, String strRequest) {
        Map<String, Integer> mp = new HashMap<>();
        for (int i = 0; i < text.size(); i++) {
            if (text.get(i).contains(strRequest.toLowerCase())) {
                mp.putIfAbsent(text.get(i), 0);
                mp.put(text.get(i), mp.get(text.get(i)) + 1);
            }
        }
        for (var entry : mp.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
