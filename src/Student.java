public class Student {
    private String name;
    private String surname;
    private int year;
    private int phone;
    private String fac;


    void setName(String name){this.name=name;}
    void setSurname(String surname){this.surname=surname;}
    void setYear(int year){this.year=year;}
    void setPhone(int phone){this.phone=phone;}
    void setFac(String fac){this.fac=fac;}

    String getName(){return name;}
    int getYear(){return year;}
    int getPhone(){return phone;}
    String getSurname(){return surname;}
    String getFac(){return fac;}
}
