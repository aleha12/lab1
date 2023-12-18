package bsu.rfe.java.group5.lab1.Tristen.varA10;

public class Keks extends Food {
    private String type;

    public Keks(String type) {
        super("Кекс");
        this.type = type;
    }

    @Override
    public void consume() {
        System.out.println(this + " съеден");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object arg0) {
        if (super.equals(arg0)) {
            if (!(arg0 instanceof Keks)) return false;
            return type.equals(((Keks) arg0).type);
        } else
            return false;
    }

    @Override
    public String toString() {
        return super.toString() + " типа '" + type.toUpperCase() + "'";
    }
}
