public class Poisonous_frog extends Frog{ // ядовитая лягушка
    private int speed_poison; // через сколько секунд вы потеряете сознание после укуса
    void poison(int speed_poison) {
        System.out.println("You will lose consciousness after " + speed_poison + " seconds.");
    }
}
