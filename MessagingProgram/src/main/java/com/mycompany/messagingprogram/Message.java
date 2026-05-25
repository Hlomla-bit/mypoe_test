/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.messagingprogram;

/**
 *
 * @author Admin01
 */
public class Message {
    //Declaration
    String recipientNumber;
    String message;
    String messageHash;
    
    public Message(String number, String text)
    {
        recipientNumber = number;
        message = text;

        // Generate hash
        messageHash = createHash();
    }

    // Checking phone number wit code
    public boolean checkRecipientCell()
    {
        if(recipientNumber.startsWith("+")&& recipientNumber.length() <= 13)
        {
            return true;
        }

        return false;
    }

    // Create simple hash
    public String createHash()
    {
        String[] words = message.split(" ");

        String firstWord = words[0];
        String lastWord = words[words.length - 1];

        return firstWord.toUpperCase()+ lastWord.toUpperCase();
    }
}
