package za.ac.cput.entity;



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactTest {

    @Test
    public  void test(){

        Contact contact = new Contact.Builder().setConId("001")
                        .setContactNum("0643990440")
                                .setContactDes("manager")
                                        .build();

        Contact contact2 = new Contact.Builder()
                        .setContactNum("078399034")
                                .setContactDes("HR")
                                        .build();

        System.out.println(contact);
        System.out.println(contact2);
    }

}