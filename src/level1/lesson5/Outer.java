package level1.lesson5;

/**
 * В классе Outer есть внутренний (Inner) и вложенный (Nested) классы.
 * В методе main класса Solution создай по одному объекту каждого из них.
 *
 * Требования:
 * •	В методе main класса Solution должен быть создан объект класса Inner.
 * •	В методе main класса Solution должен быть создан объект класса Nested.
 * •	Класс Outer изменять нельзя.
 */
public class Outer {
    class Inner {
        Inner() {
            System.out.println("Создание объекта внутреннего класса");
        }
    }
    static class Nested {
        Nested() {
            System.out.println("Создание объекта вложенного класса");
        }
    }
}
