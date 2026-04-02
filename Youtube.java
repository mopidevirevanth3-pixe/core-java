class Youtube {
    String channelName;   
    int subscribers;      
    float rating;         
    boolean monetized;    

    public Youtube(String channelName, int subscribers, float rating, boolean monetized) {
        this.channelName = channelName;
        this.subscribers = subscribers;
        this.rating = rating;
        this.monetized = monetized;
    }

    public void display() {
        System.out.println("Channel Name: " + channelName);
        System.out.println("Subscribers: " + subscribers);
        System.out.println("Rating: " + rating);
        System.out.println("Monetized: " + monetized);
        System.out.println("----------------------");
    }
}
   