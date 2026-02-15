package loopsPractice;

public class TicketBookingSystem {
    public static void main(String[] args) {
        int totalTickets = 100;
        int successfullyBooked = 0;

        for (int i = 1; i <= totalTickets ; i++) {
            if(i%4==0){
                continue;
            }
            successfullyBooked += 1;
        }
        System.out.println(successfullyBooked);
    }
}
