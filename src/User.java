public class User {
    private String name;
    private int dateOfBirth;
    private int phoneNumber;

    void setName(String name){this.name=name;}
    void setDateOfBirth(int dateOfBirth){this.dateOfBirth=dateOfBirth;}
    void setPhoneNumber(int phoneNumber){this.phoneNumber=phoneNumber;}

    String getName(){return name;}
    int getDateOfBirth(){return dateOfBirth;}
    int getPhoneNumber(){return phoneNumber;}

}
