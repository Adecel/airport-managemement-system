package za.ac.cput.entity;


/* Passenger Contact.java
 Entity for Passenger Contact
 Author: Mahad Hassan
  Student number : (219122822)
 Date: 6  April 2022 */
public class PassengerContact {
    private String PassengerId;
    private String contactId;

    public PassengerContact(Builder builder){
        this.PassengerId = builder.PassengerId;
        this.contactId = builder.contactId;

    } // constructor

    public String getPassengerId() {
        return PassengerId;
    }

    public String getContactId() {
        return contactId;
    }
    // getters


    public void setPassengerId(String passengerId) {
        PassengerId = passengerId;
    }

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }
    // setters


    @Override
    public String toString() {
        return "PassengerContact{" +
                "PassengerId='" + PassengerId + '\'' +
                ", contactId='" + contactId ;
    } // toString

    public static class Builder{
        private String PassengerId;
        private String contactId;

        public Builder setPassengerId(String passengerId) {
            PassengerId = passengerId;
            return this;
        }

        public Builder setContactId(String contactId) {
            this.contactId = contactId;
            return this;
        }

        public Builder copy(PassengerContact passengerContact){
            this.PassengerId = passengerContact.PassengerId;
            this.contactId = passengerContact.contactId;

            return this;
        } // copy method

        public PassengerContact build(){

            return new PassengerContact(this);
        }
    } // builder class
}
