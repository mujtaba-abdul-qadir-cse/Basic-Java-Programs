import java.util.*;
import java.io.*;

// The total number of seats in the stadium is 5000

class Stadium{

    File f1 = new File("vipseats.txt");
    File f2 = new File("grandstandseats.txt");
    File f3 = new File("galleryseats.txt");

    public boolean checkAvailability(int n){
        try {
            if (n == 1) {
                Scanner sc = new Scanner(f1);
                int seats = sc.nextInt();
                if (seats > 0 &&  seats <= 20) {      // if a VIP seat is available (seats 0 to 20)

                    return true;
                }
            } else if (n == 2) {
                Scanner sc = new Scanner(f2);
                int seats = sc.nextInt();
                if (seats > 20 && seats <= 100) {     // if a Grand Stand seat is available (seats 21 to 100)
                    return true;
                }
            } else if (n == 3) {
                Scanner sc = new Scanner(f3);
                int seats = sc.nextInt();
                if (seats > 100 && seats <= 5000) {     // if a gallery seat is available (seats 101 to 5000)
                    return true;
                }
            }
        } catch (IOException i) {
            System.out.println("I/O Exception");
        }
        return false;
    }jk
}

class Match{
    String date;
    String startingTime;
    String teamOne;
    String teamTwo;
    Scanner scanner = new Scanner(System.in);
    File datafile = new File("matchdata.txt");

    void viewMatchData(){
        try {
            Scanner scn = new Scanner(datafile);
                String data = scn.nextLine();
                System.out.println(data);
            scn.close();
        }
        catch (FileNotFoundException f){
            System.out.println("File not found");
        }
    }

    void editMatchData(){
        System.out.println("Enter date:");
        date = scanner.nextLine();
        System.out.println("Enter starting time:");
        startingTime = scanner.nextLine();
        System.out.println("Enter name of one team:");
        teamOne = scanner.nextLine();
        System.out.println("Enter name of the other team:");
        teamTwo = scanner.nextLine();


        try{
            FileWriter f = new FileWriter(datafile);
            BufferedWriter b = new BufferedWriter(f);
            String data = "Date: " + date + "\tStarting Time: " + startingTime + "\t" + teamOne + " vs " + teamTwo;
            b.write(data);
            b.close();
            f.close();
        }
        catch (IOException i){
            System.out.println("IO exception");
        }
    }
}

class Admin
{
    void takeBooking(){
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        File b = new File("bookings.txt");
        Stadium st = new Stadium();
        String buyerName;
        int option;

        System.out.println("Enter Buyer Name:");
        buyerName = s1.nextLine();

        System.out.println("Choose seat type:\n");
        System.out.println("1. VIP seat");
        System.out.println("2. Grand Stand seat");
        System.out.println("3. Gallery Seat");

        option = s2.nextInt();

        if(option == 1){
            if(st.checkAvailability(1)==true){
                try{
                    File v = new File("vipseats.txt");
                    Scanner scr = new Scanner(v);
                    int SeatNo = scr.nextInt();


                    FileWriter fw = new FileWriter(b, true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    String data = "Seat no.: " + SeatNo  + "\tName: " + buyerName + "\tSeat type: VIP\n";
                    bw.write(data);
                    bw.close();
                    fw.close();

                    SeatNo--;          // decrement no. of seats available by 1
                    Writer w = new FileWriter(v);
                    w.write(String.valueOf(SeatNo));     // write updated no. of available seats
                    w.close();

                    System.out.println("Booking successful!");
                    System.out.println(data);

                }
                catch (IOException e){
                    System.out.println("IOException");
                }
            }
            else{
                System.out.println("VIP Seat not Available!");
            }
        }
        else if(option == 2){
            if(st.checkAvailability(2)==true){
                try{
                    File gs = new File("grandstandseats.txt");
                    Scanner scr = new Scanner(gs);
                    int SeatNo = scr.nextInt();


                    FileWriter fw = new FileWriter(b, true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    String data = "Seat no.: " + SeatNo  + " Name: " + buyerName + " Seat type: Grand Stand\n";
                    bw.write(data);
                    bw.close();
                    fw.close();

                    SeatNo--;                // decrement no. of seats available by 1
                    Writer w = new FileWriter(gs);
                    w.write(String.valueOf(SeatNo));     // write updated no. of available seats
                    w.close();

                    System.out.println("Booking successful!");
                    System.out.println(data);
                }
                catch (IOException e){
                    System.out.println("IOException");
                }
            }
            else{
                System.out.println("Grand Stand Seat not Available!");
            }
        }
        else if(option == 3){
            if(st.checkAvailability(3)==true){
                try{
                    File gl = new File("galleryseats.txt");
                    Scanner scr = new Scanner(gl);
                    int SeatNo = scr.nextInt();


                    FileWriter fw = new FileWriter(b, true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    String data = "Seat no.: " + SeatNo  + " Name: " + buyerName + " Seat type: Gallery\n";
                    bw.write(data);
                    bw.close();
                    fw.close();

                    SeatNo--;                 // decrement no. of seats available by 1
                    Writer w = new FileWriter(gl);
                    w.write(String.valueOf(SeatNo));     // write updated no. of available seats
                    w.close();

                    System.out.println("Booking successful!");
                    System.out.println(data);
                }
                catch (IOException e){
                    System.out.println("IOException");
                }
            }
            else{
                System.out.println("Gallery Seat not Available!");
            }
        }

    }
    void viewBookings(){
        try {
            File file1 = new File("bookings.txt");
            Scanner scn = new Scanner(file1);
            while (scn.hasNextLine()) {
                String dataset = scn.nextLine();
                System.out.println(dataset);
            }
            scn.close();
        }
        catch (FileNotFoundException f){
            System.out.println("File not found");
        }

    }
}
public class Main {

    public static void main(String[] args) {

        Admin adm = new Admin();
        Match nextmatch = new Match();

        Scanner sc = new Scanner(System.in);
        int option;

        System.out.println("1. Take booking");
        System.out.println("2. View booking data");
        System.out.println("3. View match data");
        System.out.println("4. Enter or edit match data");
        System.out.println();
        System.out.println("Enter your choice:");
        option = sc.nextInt();

        if(option == 1){
            adm.takeBooking();
        }
        else if(option == 2){
            adm.viewBookings();
        }
        else if(option == 3){
            nextmatch.viewMatchData();
        }
        else if(option == 4){
            nextmatch.editMatchData();
        }
    }
}
