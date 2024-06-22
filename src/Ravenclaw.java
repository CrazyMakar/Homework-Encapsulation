public class Ravenclaw extends Hogwarts {

    private int mind;
    private int wisdom;
    private int witty;
    private int creativity;

    public Ravenclaw(String name,
                     int powerMagic,
                     int transgressDistance,
                     int mind,
                     int wisdom,
                     int witty,
                     int creativity) {
        super(name, powerMagic, transgressDistance);
        this.mind = mind;
        this.wisdom = wisdom;
        this.witty = witty;
        this.creativity = creativity;
    }

    public int getMind() {
        return mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreativity() {
        return creativity;
    }

    public int sum() {
        return mind + wisdom + witty + creativity;
    }

    public void compare(Ravenclaw other) {
        if (sum() > other.sum()) {
            System.out.println(this.getName() + " лучший Когтевранец, чем " + other.getName());
        } else {
            System.out.println(other.getName() + " лучший Когтевранец, чем " + this.getName());
        }
    }

    void printContent() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return super.toString() +
                ", ум: " + mind +
                ", мудрость: " + wisdom +
                ", остроумие: " + witty +
                ", творчество: " + creativity;
    }
}