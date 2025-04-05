import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ticket_number;
        System.out.print("Enter your ticket number:");
        ticket_number = input.next();

        if (ticket_number.length() >9 && ticket_number.length() <=12){
            char removedChar = ticket_number.charAt(ticket_number.length()-1);  // the removed character
            int removedValue = Character.getNumericValue(removedChar);   // convert the removed character to its numeric value

            String trimmed  = ticket_number.substring(0, ticket_number.length()-1); //removing the last character
           long actual_ticket = Long.parseLong(trimmed);    // getting the numeric value of the ticket

           if(actual_ticket % 7 == removedValue) {
               System.out.println("The ticket number you entered was valid.");
           }
           else System.out.println("The ticket number is invalid, enter again!");
        }
        else System.out.println("Ticket must contain at least 10 digits and not more than 12 digits\n" + "Try again");

    }
}