public class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Гарри Поттер", 80, 70, 50, 40, 55);
        Gryffindor hermioneGranger = new Gryffindor("Гермиона Грейнджер", 70, 60, 100, 65, 35);
        Gryffindor ronWeasley = new Gryffindor("Рон Уизли", 65, 64, 45, 45, 35);
        Hufflepuff zachariahSmith = new Hufflepuff("Захария Смит", 65, 55, 55, 45, 55);
        Hufflepuff cedricDiggory = new Hufflepuff("Седрик Диггори", 45, 40, 45, 40, 30);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Джастин Финч-Флетчли", 45, 60, 35, 40, 50);
        Ravenclaw zhouChangs = new Ravenclaw("Чжоу Чанг", 60, 50, 50, 50, 50, 40);
        Ravenclaw padmaPatil = new Ravenclaw("Падма Патил", 40, 45, 40, 45, 35, 50);
        Ravenclaw marcusBelby = new Ravenclaw("Маркус Белби", 50, 55, 30, 45, 40, 40);
        Slytherin dracoMalfoy = new Slytherin("Драко Малфой", 65, 65, 55, 45, 55, 45, 75);
        Slytherin grahamMontague = new Slytherin("Грэхэм Монтегю", 45, 40, 45, 40, 30, 35, 45);
        Slytherin gregoryGoyle = new Slytherin("Грегори Гойл", 45, 60, 35, 40, 50, 30, 40);



        harryPotter.printContent();
        System.out.println("~~~~~~~~~~~");
        hermioneGranger.printContent();
        System.out.println("~~~~~~~~~~~");
        ronWeasley.printContent();
        System.out.println("~~~~~~~~~~~");
        zachariahSmith.printContent();
        System.out.println("~~~~~~~~~~~");
        cedricDiggory.printContent();
        System.out.println("~~~~~~~~~~~");
        justinFinchFletchley.printContent();
        System.out.println("~~~~~~~~~~~");
        zhouChangs.printContent();
        System.out.println("~~~~~~~~~~~");
        padmaPatil.printContent();
        System.out.println("~~~~~~~~~~~");
        marcusBelby.printContent();
        System.out.println("~~~~~~~~~~~");
        dracoMalfoy.printContent();
        System.out.println("~~~~~~~~~~~");
        grahamMontague.printContent();
        System.out.println("~~~~~~~~~~~");
        gregoryGoyle.printContent();
        System.out.println();

        System.out.println("===========");

        System.out.println();
        zhouChangs.compare(marcusBelby);
        System.out.println("~~~~~~~~~~~");
        ronWeasley.compare(hermioneGranger);
        System.out.println("~~~~~~~~~~~");
        cedricDiggory.compare(justinFinchFletchley);
        System.out.println("~~~~~~~~~~~");
        gregoryGoyle.compare(grahamMontague);
        System.out.println("~~~~~~~~~~~");
        padmaPatil.compare(zhouChangs);
        System.out.println("~~~~~~~~~~~");
        harryPotter.compare(dracoMalfoy);
        System.out.println("~~~~~~~~~~~");
        hermioneGranger.compare(zachariahSmith);
    }
}