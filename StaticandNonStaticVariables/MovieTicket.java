public class MovieTicket {
    static int totalTicketsSold = 0;
    String movieName;
    int seatNumber;

    public MovieTicket(String movieName, int seatNumber) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        totalTicketsSold++; 
    }

    public void displayTicket() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
    }

    public static void displayTotalTicketsSold() {
        System.out.println("Total Tickets Sold: " + totalTicketsSold);
    }

    public static void main(String[] args) {
        MovieTicket t1 = new MovieTicket("HarryPotter-1", 12);
        MovieTicket t2 = new MovieTicket("HarryPotter-2", 13);
        MovieTicket t3 = new MovieTicket("HarryPotter-3", 14);

        t1.displayTicket();
        System.out.println("-----");
        t2.displayTicket();
        System.out.println("-----");
        t3.displayTicket();
        System.out.println("-----");

        MovieTicket.displayTotalTicketsSold();
    }
}
