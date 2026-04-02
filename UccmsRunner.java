class UccmsRunner{

public static void main(String[] args) {

        Uccms s1 = new Uccms("Revanth", 101, 85.5f, true);
        Uccms s2 = new Uccms("purvaj", 102, 78.0f, true);
        Uccms s3 = new Uccms("nikki", 103, 65.5f, true);
        Uccms s4 = new Uccms("nithi", 104, 92.0f, true);
        Uccms s5 = new Uccms("prathi", 105, 55.0f, false);
        Uccms s6 = new Uccms("madhu", 106, 88.5f, true);
        Uccms s7 = new Uccms("kush", 107, 60.0f, true);

        s1.display();
        s2.display();
        s3.display();
        s4.display();
        s5.display();
        s6.display();
        s7.display();
    }
}