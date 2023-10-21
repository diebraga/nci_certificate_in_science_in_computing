package softwareDevelopment.week5Lab.Lab2;

public class HotelRoom {
    private String guestName;
    private int nights;
    private int age;
    private static final int COST_PER_NIGHT = 90;

    public HotelRoom(String receivdGuestName, int receivedNights, int receivedAge) {
        guestName = receivdGuestName;
        nights = receivedNights;
        age = receivedAge;
    }

    // will return false if types -18 age
    public boolean canBook() {
        return age >= 18;
    }

    public int calculateTotalCost() {
        return nights * COST_PER_NIGHT;
    }

    @Override
    public String toString() {
        return "Guest Name: " + guestName + ", Nights: " + nights + ", Age: " + age;
    }
}
