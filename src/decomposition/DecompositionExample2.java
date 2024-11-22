package decomposition;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class DecompositionExample2 {
    public static void main(String[] args) {

        // [Шаг 1] - получить данные

        // В данной ситуации для получения данных, мы просто обратились к соседнему классу, в котором эти данные есть
        String clientOne = DecompositionExample.clientOne;
        String clientTwo = DecompositionExample.clientTwo;

        // Проверим, что они пришли в том же виде (валидация)
        System.out.println(clientOne);
        System.out.println(clientTwo);

        // [Шаг 2] - сохранить данные у себя

        // Вместо БД в примере будем использовать List (динамический массив)
        List<String> data = new ArrayList<>();
        data.add(clientOne);
        data.add(clientTwo);

        System.out.println(data);

        // [Шаг 3] - вытащить часть данных (names)
        // Самое сложное. У нас строка с разными символами
        // Нужно вытащить только поля name
        String names = data
                .stream()
                .map(DecompositionExample2::extractName)
                .reduce((name1, name2) -> name1 + ", " + name2)
                .orElse("");

        // [Шаг 4] - отдать на фронт итоговые значения
        System.out.println(names);
    }

    private static String extractName(String json) {
        Pattern pattern = Pattern.compile("\"name\": \"(.*?)\"");
        Matcher matcher = pattern.matcher(json);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return "";
    }
}