package za.ac.cput.entity;


/* Passenger Contact.java
 Entity for Passenger Contact
 Author: Mahad Hassan
 Student number : (219122822)
 Date: 6  April 2022 */

public class EmployeeContact {

private String employeeId;
private String contactId;

public EmployeeContact(Builder builder){
    this.employeeId = builder.employeeId;
    this.contactId = builder.contactId;

 } // constructor

    public String getEmployeeId() {
        return employeeId;
    }

    public String getContactId() {
        return contactId;
    } // getters

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setContactId(String contactId) {
        this.contactId = contactId;
    } // setters

    @Override
    public String toString() {
        return "Employee Contact{" +
                "employee Id='" + employeeId + '\'' +
                ", contact Id='" + contactId;
    } // toString

    public static class Builder{
        private String employeeId;
        private String contactId;

        public Builder setEmployeeId(String employeeId) {
            this.employeeId = employeeId;
            return this;
        }

        public Builder setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        } // setters

        public Builder copy(EmployeeContact employeeContact){
            this.employeeId = employeeContact.employeeId;
            this.contactId = employeeContact.contactId;
            return this;

        } // copy method

        public EmployeeContact build(){
            return new EmployeeContact(this);
        }

    } // builder class
} // class employeeTest
