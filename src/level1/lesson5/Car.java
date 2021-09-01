package level1.lesson5;

/**
 * Двигатель — сложный механизм, для описания которого недостаточно обычной переменной.
 * В классе Car создай внутренний класс (inner class) Engine.
 * В классе Engine создай boolean поле isRunning, которое принимает значение true, если двигатель запущен,
 * и false в противном случае.
 * Также в этот класс добавь методы start и stop, которые будут запускать/останавливать двигатель (устанавливать соответствующее значение полю isRunning).
 * Чтобы использовать двигатель, создай поле engine типа Engine в классе Car.
 */
public class Car {

    Engine engine = new Engine();

    class Engine{
        boolean isRunning;

        public void start() {
            this.isRunning = true;
            System.out.println("Engine has started.");
        }

        public void stop() {
            this.isRunning = false;
            System.out.println("Engine has stopped.");
        }




    }
}
