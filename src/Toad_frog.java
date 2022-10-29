public class Toad_frog extends Frog{ // жабовидная лягушка
    private int sound; // уровень распространения звука "квааа" (от 1 до 10)

    void kvaktf(int sound) { // лягушка может квакать 3 раза подряд.
        for (int i = 0; i < sound; i++) {
            System.out.println("Kvaaaa");
        }
    }

    @Override
    public void jump(int paws) { // лягушка не может прыгать. Жаба же тяжелая
        if (paws == 2) {
            System.out.println("I have " + paws + "paws.");
            System.out.println("But I can't jump");
        }
        else System.out.println("strange frog");
    }
}