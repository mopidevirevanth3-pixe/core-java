 class RapidoRunner{
 public static void main(String[] args) {

        Rapido r1 = new Rapido("Revanth", 101, 120.5f, true);
        Rapido r2 = new Rapido("nithi", 102, 95.0f, false);
        Rapido r3 = new Rapido("kush", 103, 150.75f, true);
        Rapido r4 = new Rapido("polo", 104, 80.0f, true);
        Rapido r5 = new Rapido("prathi", 105, 110.25f, false);
        Rapido r6 = new Rapido("nikki", 106, 130.0f, true);
        Rapido r7 = new Rapido("niru", 107, 99.5f, true);

        r1.display();
        r2.display();
        r3.display();
        r4.display();
        r5.display();
        r6.display();
        r7.display();
    }
}