package com.gamingz.Challenge.one;
import java.util.Map;
import java.util.HashMap;

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

public class Messages extends Contacts {


    Map<String , String> message = new HashMap<>();


    public Messages(Map<String, Long> contact) {
        this.contact = contact;
    }


    public void Show(){
        if(message.size()==0){
            System.out.println("No messages to show.");

        }
        else{
            for(String s: message.keySet()){
                System.out.println("Message sent to "+s+"-");
                System.out.println(message.get(s));
                System.out.println(" ");
            }
        }
    }
    public void Send(String name,String text){


        message.put(name,text);
        System.out.println("Message sent to "+name+".");

    }
    public boolean CheckContact(String name){
        if(contact.containsKey(name)){
            return true;
        }
        else{
            return false;
        }
    }



}
