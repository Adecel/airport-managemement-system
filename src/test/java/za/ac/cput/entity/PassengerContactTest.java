package za.ac.cput.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassengerContactTest {

    @Test
    public void test(){
        PassengerContact passengerContact = new PassengerContact.Builder()
                .setPassengerId("999")
                .setContactId("07823")
                .build();

        PassengerContact passengerContact2 = new PassengerContact.Builder()
                .setPassengerId("111")
                .build();

        System.out.println(passengerContact);
        System.out.println(passengerContact2);


    }

}