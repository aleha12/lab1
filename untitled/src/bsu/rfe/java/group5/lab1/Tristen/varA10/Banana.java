package bsu.rfe.java.group5.lab1.Tristen.varA10;

public class Banana extends Food {
    private String size;

    // Конструктор класса Banana, принимает размер банана в качестве аргумента
    public Banana(String size) {
        super("Банан");
        this.size = size;
    }

    // Переопределение метода consume для вывода сообщения о съеденном банане
    @Override
    public void consume() {
        System.out.println(this + " съеден");
    }

    // Геттер для получения размера банана
    public String getSize() {
        return size;
    }

    // Сеттер для установки нового размера банана
    public void setSize(String size) {
        this.size = size;
    }

    // Переопределение метода toString для возврата информации о банане в виде строки
    @Override
    public String toString() {
        return super.toString() + " размера '" + size.toLowerCase() + "'";
    }
}
