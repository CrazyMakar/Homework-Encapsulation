public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name,
                     int powerMagic,
                     int transgressDistance,
                     int cunning,
                     int determination,
                     int ambition,
                     int resourcefulness,
                     int lustForPower) {
        super(name, powerMagic, transgressDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public int sum() {
        return cunning + determination + ambition + resourcefulness + lustForPower;
    }

    public void compare(Slytherin other) {
        if (sum() > other.sum()) {
            System.out.println(this.getName() + " лучший Слизеринец, чем " + other.getName());
        } else {
            System.out.println(other.getName() + " лучший Слизеринец, чем " + this.getName());
        }
    }

    void printContent() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return super.toString() +
                ", хитрость: " + cunning +
                ", решительность: " + determination +
                ", амбициозность: " + ambition +
                ", находчивость: " + resourcefulness +
                ", жажда власти: " + lustForPower;
    }
}