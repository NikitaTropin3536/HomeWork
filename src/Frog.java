public class Frog { // родительский класс - лягушки
    String color; // цвет кожи
    private String title; // название земноводного
    protected int paws = 2; // количество лап
    protected int spine_length; // длина позвоночника

    public void kvak() { // лягушка может квакать
        System.out.println("Kvaaaa");
    }

    public void jump(int paws) { // лягушка может прыгать
        if (paws == 2) System.out.println("I have " + paws + "paws. " + "And I jump"); // прыжок
        else System.out.println("strange frog");
    }

    public void eatMosquito() { // лягушка может съесть комара
        System.out.println("AMM, it is delicious");
    }

    public String getTitle() { // можно вывести имя лягушки
        return title;
    }

    public void setTitle(String frogTitle) { // лягушку можно назвать
        title = frogTitle;
    }

    public String frogColor(String color) {
        return "This frog is" + color;
    }

    public String frogColor(int spine_length) {
        return "This frog have spine. Spine_length " + spine_length;
    }
}