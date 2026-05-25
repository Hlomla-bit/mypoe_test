/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.messagingprogram;

/**
 *
 * @author Admin01
 */
import java.util.Scanner;
public class MessagingProgram
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Declared variables
        String number;
        String text;
        int choice;

        System.out.print("Enter recipient number: ");
        number = input.nextLine();

        System.out.print("Enter your message: ");
        text = input.nextLine();

        // Checking message length
        if(text.length() > 250)
        {
            System.out.println("Message is too long.");
            return;
        }

        // calling messaging class
        Message m = new Message(number, text);

        // Checking phone number
        if(m.checkRecipientCell())
        {
            System.out.println("Cell number captured.");
        }
        else
        {
            System.out.println("Cell number is wrong.");
        }

        // Display details
        System.out.println("--- MESSAGE DETAILS ---");

        System.out.println("Recipient: "+ m.recipientNumber);

        System.out.println("Message: "+ m.message);

        System.out.println("Message Hash: "+ m.messageHash);

        // Options
        System.out.println("1. Send");
        System.out.println("2. Discard");
        System.out.println("3. Store");

        System.out.print("Choose option: ");
        choice = input.nextInt();

        if(choice == 1)
        {
            System.out.println("Message successfully sent.");
        }
        else if(choice == 2)
        {
            System.out.println("Message discarded.");
        }
        else if(choice == 3)
        {
            System.out.println("Message stored.");
        }
        else
        {
            System.out.println("Invalid option.");
        }
    }
}