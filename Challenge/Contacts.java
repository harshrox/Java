package com.gamingz.Challenge;

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

public class Contacts{


    Map<String , Long> contact = new HashMap<>();

    public Map<String, Long> getContact() {
        return contact;
    }

    public void setContact(Map<String, Long> contact) {
        this.contact = contact;
    }

    public void Show(){
        if(contact.size()==0){
            System.out.println("Contact list is empty.");

        }
        else{
            for(String s: contact.keySet()){
                System.out.println("Contact number of "+s+" is "+contact.get(s));
            }
        }
    }
    public void Add(String name,Long number){
        contact.put(name,number);
        System.out.println(name+" has been added to the contact list.");
    }
    public void Search(String name){
        if(contact.containsKey(name)){
            System.out.println("Contact number of "+name+" is "+contact.get(name));
        }
        else{
            System.out.println(name+" does not exist in the contact list.");
        }
    }
    public void Delete(String name){
        if(contact.containsKey(name)){
            contact.remove(name);
            System.out.println(name+" has been removed from the contact list.");
        }
        else{
            System.out.println(name+" does not exist in the contact list.");
        }
    }


}
