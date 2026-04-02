class YoutubeRunner{

 public static void main(String[] args) {

        Youtube y1 = new Youtube("TechWorld", 500000, 4.5f, true);
        Youtube y2 = new Youtube("Foodies", 250000, 4.2f, true);
        Youtube y3 = new Youtube("GamingPro", 1000000, 4.8f, false);
        Youtube y4 = new Youtube("TravelVlogs", 300000, 4.3f, true);
        Youtube y5 = new Youtube("EducationHub", 450000, 4.7f, true);
        Youtube y6 = new Youtube("MusicBeats", 800000, 4.6f, false);
        Youtube y7 = new Youtube("FitnessLife", 200000, 4.1f, true);

        y1.display();
        y2.display();
        y3.display();
        y4.display();
        y5.display();
        y6.display();
        y7.display();
    }
}