package za.ac.cput.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeContactTest {

    @Test
    public void test(){

        EmployeeContact employeeContact = new EmployeeContact.Builder().setEmployeeId("101")
                .setContactId("08373727")
                .build();

        EmployeeContact employeeContact2 = new EmployeeContact.Builder().setEmployeeId("102")
                .build();

        EmployeeContact employeeContact3 = new EmployeeContact.Builder().setEmployeeId("103")
                .setContactId("087463683")
                .build();

        System.out.println(employeeContact);
        System.out.println(employeeContact2);
        System.out.println(employeeContact3);


    }

}