package za.ac.cput.entity;


/* Passenger Contact.java
 Entity for Passenger Contact
 Author: Mahad Hassan
  Student number : (219122822)
  Date: 6  April 2022 */

public class Contact {
    private  String conId;
    private String contactNum;
    private String ContactDes;


    private Contact(Builder builder){
        this.conId = builder.conId;
        this.contactNum = builder.contactNum;
        this.ContactDes = builder.ContactDes;
    } // const

    public String getConId() {
        return conId;
    }

    public String getContactNum() {
        return contactNum;
    }

    public String getContactDes() {
        return ContactDes;
    } // getters

    public void setConId(String conId) {
        this.conId = conId;
    }

    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }

    public void setContactDes(String contactDes) {
        ContactDes = contactDes;
    } // setters

    @Override
    public String toString() {
        return "Contact{" +
                "contact Id='" + conId + '\'' +
                ", contact Number =" + contactNum +
                ", Contact Description='" + ContactDes;
    } // to String

    public static class Builder{
        private  String conId;
        private String contactNum;
        private String ContactDes;

        public Builder setConId(String conId) {
            this.conId = conId;
            return this;
        }

        public Builder setContactNum(String contactNum) {
            this.contactNum = contactNum;
            return this;
        }

        public Builder setContactDes(String contactDes) {
            ContactDes = contactDes;
            return this;
        } // builder class

        public Builder copy(Contact contact){
            this.conId = contact.conId;
            this.contactNum = contact.contactNum;
            this.ContactDes = contact.ContactDes;
            return this;
        } // copy method
        public Contact build(){
            return new Contact(this);
        }

    } // class builder

} // class contact
