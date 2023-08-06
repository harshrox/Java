package com.gamingz.Challenge;

import java.util.Scanner;

/*
    * Simulate your phone's contacts and messages application
    *
    * Greet the user
    * Show these 3 options: 1. Manage contacts    2. Messages    3. Quit
    * In case of selecting 1 --> show these options:
    *       1. Show all contacts
    *       2. Add a new contact
    *       3. Search for a contact
    *       4. Delete a contact
    *       5. Go back to previous menu
    * In case of selecting 2 --> show these options:
    *       1. See the list of all messages
    *       2. Send a new message
    *       3. Go back to previous menu
    * In case of selecting 3 --> Quit the application
 */
public class Main{
    public static void main(String[] args) {
        Contacts contact = new Contacts();
        Messages messages = new Messages(contact.getContact());


        int choice=0,contactChoice;
        System.out.println("Hey Harsh!"); // Greeting the user

        Scanner scan = new Scanner(System.in);
        while(choice!=3){
            System.out.println(("Choose one- 1. Manage contacts    2. Messages    3. Quit"));
            choice= scan.nextInt();
            if(choice==1){
                while (true){
                    System.out.println(" ");
                    System.out.println("Choose one-");
                    System.out.println("1. Show all contacts");
                    System.out.println("2. Add a new contact");
                    System.out.println("3. Search for a contact");
                    System.out.println("4. Delete a contact");
                    System.out.println("5. Go back to previous menu");
                    contactChoice=scan.nextInt();
                    if(contactChoice==1){
                        contact.Show();
                    }
                    else if (contactChoice==2) {
                        System.out.println("Enter name-");
                        scan.nextLine(); //to consume the newline character left in the buffer.
                        String contactName = scan.nextLine();
                        System.out.println("Enter number-");
                        Long contactNumber = scan.nextLong();
                         contact.Add(contactName,contactNumber);

                    }
                    else if (contactChoice==3) {
                        System.out.println("Enter contact name-");
                        scan.nextLine(); //to consume the newline character left in the buffer.
                        String searchName = scan.nextLine();
                        contact.Search(searchName);
                    }
                    else if (contactChoice==4) {
                        System.out.println("Enter contact name-");
                        scan.nextLine(); //to consume the newline character left in the buffer.
                        String deleteName = scan.nextLine();
                        contact.Delete(deleteName);
                    }
                    else {
                        break;
                    }


                }

            }
            else if(choice==2){
                while (true){
                    System.out.println(" ");
                    System.out.println("Choose one-");
                    System.out.println("1. See the list of all messages");
                    System.out.println("2. Send a new message");
                    System.out.println("3. Go back to previous menu");
                    contactChoice=scan.nextInt();
                    if(contactChoice==1){
                        messages.Show();
                    }
                    else if (contactChoice==2) {
                        System.out.println("Send to-");
                        scan.nextLine(); //to consume the newline character left in the buffer.
                        String name = scan.nextLine();
                        if(messages.CheckContact(name)){
                            System.out.println("Text content-");
                            String text = scan.nextLine();
                            messages.Send(name,text);
                        }
                        else{
                            System.out.println("No such contact found.");
                        }


                    }
                    else {
                        break;
                    }


                }

            }
            else {
                choice=3;
            }


        }


    }
}
