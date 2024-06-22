public class Hufflepuff extends Hogwarts {

    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name,
                      int powerMagic,
                      int transgressDistance,
                      int diligence,
                      int loyalty,
                      int honesty) {
        super(name, powerMagic, transgressDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public int sum() {
        return diligence + loyalty + honesty;
    }

    public void compare(Hufflepuff other) {
        if (sum() > other.sum()) {
            System.out.println(this.getName() + " лучший Пуффендуец, чем " + other.getName());
        } else {
            System.out.println(other.getName() + " лучший Пуффендуец, чем " + this.getName());
        }
    }

    void printContent() {
        System.out.println(toString());
    }
    @Override
    public String toString() {
        return super.toString() +
                ", трудолюбивость: " + diligence +
                ", верность: " + loyalty +
                ", честность: " + honesty;
    }
}