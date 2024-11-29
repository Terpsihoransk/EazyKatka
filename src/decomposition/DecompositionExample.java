package decomposition;

// Пример декомпозиции задачи
public class DecompositionExample {

    /**
     * Забрать из внешней системы записи по нашим клиентам и прихронить их в базу. Фронту нужно отдать имена этих клиентов.
     * Есть пример входных (из внешней системы) и выходных (на UI) параметров
     */

    static String clientOne = "{ " +
            "\"name\": \"Иван\", " +
            "\"surname\": \"Иванов\", " +
            "\"age\": \"28\" " +
            "}";

    static String clientTwo = "{ " +
            "\"name\": \"Анна\", " +
            "\"surname\": \"Аничкина\", " +
            "\"age\": \"25\" " +
            "}";

    public static void main(String[] args) {

        System.out.println("Первый клиент: " + clientOne);
        System.out.println("Второй клиент: " + clientTwo);

        // Пример выходных данных
        String outputExample = "Иван, Анна";

        System.out.println("Отдаём на фронт: " + outputExample);
    }
}
