public class Gryffindor extends Hogwarts {

    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name,
                      int powerMagic,
                      int transgressDistance,
                      int nobility,
                      int honor,
                      int bravery) {
        super(name, powerMagic, transgressDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public int sum() {
        return nobility + honor + bravery;
    }

    public void compare(Gryffindor other) {
        if (sum() > other.sum()) {
            System.out.println(this.getName() + " лучший Гриффиндорец, чем " + other.getName());
        } else {
            System.out.println(other.getName() + " лучший Гриффиндорец, чем " + this.getName());
        }
    }

    void printContent() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return super.toString() +
                ", благородство: " + nobility +
                ", честь : " + honor +
                ", храбрость: " + bravery;
    }
}