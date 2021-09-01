package level1.lesson4;

/**
 * В методе main конвертируй строку string в тип double с помощью статического метода parseDouble класса Double.
 * Затем округли полученное значение, используя статический метод round класса Math.
 * Результат выведи на экран.
 *
 * Требования:
 * •	В методе main должен вызываться метод parseDouble класса Double.
 * •	В методе main должен вызываться метод round класса Math.
 * •	В консоли должно выводиться число 13.
 * }
 */
public class Main{
//    public static void main(String[] args) {
//        String string = "12.84";
//        System.out.println(Math.round(Double.parseDouble(string)));
//    }
    public static void main(String[] args) {
        Window window = new Window();
        window.printSize();
        window.changeSize(4, 5);
        window.printSize();
    }
}
