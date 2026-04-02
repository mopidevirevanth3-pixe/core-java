class Rapido {
    String driverName;   
    int rideId;          
    float fare;         
    boolean available;   

    public Rapido(String driverName, int rideId, float fare, boolean available) {
        this.driverName = driverName;
        this.rideId = rideId;
        this.fare = fare;
        this.available = available;
    }

    public void display() {
        System.out.println("Driver Name: " + driverName);
        System.out.println("Ride ID: " + rideId);
        System.out.println("Fare: " + fare);
        System.out.println("Available: " + available);
        System.out.println("----------------------");
    }
	}