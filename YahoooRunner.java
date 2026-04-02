class YahoooRunner{
 
public static void main(String[] args) {

        Yahooo y1 = new Yahooo("user1", 20, 4.5f, true);
        Yahooo y2 = new Yahooo("user2", 22, 4.2f, false);
        Yahooo y3 = new Yahooo("user3", 25, 4.8f, true);
        Yahooo y4 = new Yahooo("user4", 21, 4.1f, true);
        Yahooo y5 = new Yahooo("user5", 23, 4.6f, false);
        Yahooo y6 = new Yahooo("user6", 24, 4.3f, true);
        Yahooo y7 = new Yahooo("user7", 26, 4.7f, true);

        y1.display();
        y2.display();
        y3.display();
        y4.display();
        y5.display();
        y6.display();
        y7.display();
    }
}