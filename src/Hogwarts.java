public class Hogwarts {

    private String name;
    private int powerMagic;
    private int transgressDistance;

    public Hogwarts(String name,
                    int powerMagic,
                    int transgressDistance) {
        this.name = name;
        this.powerMagic = powerMagic;
        this.transgressDistance = transgressDistance;
    }

    public String getName() {
        return name;
    }

    public int getPowerMagic() {
        return powerMagic;
    }

    public int getTransgressDistance() {
        return transgressDistance;
    }

    public String description() {
        return "Имя: " + name + ", сила магии: " + powerMagic + ", сила трансгрессирования: " + transgressDistance;
    }

    public void compare(Hogwarts other) {
        if (powerMagic > other.powerMagic) {
            System.out.println(name + " обладает бОльшей мощностью магии, чем " + other.name);
        } else {
            System.out.println(other.name + " обладает бОльшей мощностью магии, чем " + name);
        }
        if (transgressDistance > other.transgressDistance) {
            System.out.println(name + " обладает бОльшим расстоянием трансгрессии, чем " + other.name);
        } else {
            System.out.println(other.name + " обладает бОльшим расстоянием трансгрессии, чем " + name);
        }
    }

    void printContent() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Имя: " + name  +
                ", сила магии: " + powerMagic +
                ", сила трансгрессирования: " + transgressDistance;
    }
}

