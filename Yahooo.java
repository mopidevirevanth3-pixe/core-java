class Yahooo {
    String username;   
    int age;           
    float rating;      
    boolean active;    

    public Yahooo(String username, int age, float rating, boolean active) {
        this.username = username;
        this.age = age;
        this.rating = rating;
        this.active = active;
    }

    public void display() {
        System.out.println("Username: " + username);
        System.out.println("Age: " + age);
        System.out.println("Rating: " + rating);
        System.out.println("Active: " + active);
        System.out.println("----------------------");
    }
}
  