import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      String univer1 =mUniver();
      String group1 = mGroup();
      String group2 = mGroup();
      String student1 = mStudent();
      String student2 = mStudent();
      String student3 = mStudent();
      String student4 = mStudent();
      String student5 = mStudent();
        System.out.println(univer1);
        System.out.println(group1+"\t"+group2);

        System.out.println(student1+"\t"+student2+"\t"+student3+"\t"+student4+"\t"+student5);


    }
    static void mUser(){
        Scanner sc= new Scanner(System.in);
        User user = new User();
        System.out.println("Regitrasia uchun tomondogulordu tolturunuz ");

        System.out.println("Atynyz");
        user.setName(sc.nextLine());

        System.out.println("Tuulgan jylynyz");
        user.setDateOfBirth(sc.nextInt());
        if(user.getDateOfBirth()<=0){
            System.out.println("jashynyz 0'don chon boluwu kerek");
            return;
        }

        System.out.println("Telefon nomer ");
        user.setPhoneNumber(sc.nextInt());

        System.out.println("Siz iygiliktuu registrasiadan ottunuz");
        System.out.printf("Atynyz: %s \n Jawynyz: %d \n Telefon: %d ",user.getName(),(2022-user.getDateOfBirth()),user.getPhoneNumber());
    }
    static String mUniver(){
        Scanner sc = new Scanner(System.in);
        University univer = new University();

        System.out.println("at");
        univer.setName(sc.nextLine());

        System.out.println("adr");
        univer.setAddress(sc.nextLine());

        System.out.println("jyl");
        univer.setYear(sc.nextInt());

        System.out.println("reg buttu");

        return (univer.getName()+"\n"+univer.getYear()+"\n"+univer.getAddress()+"");

    }
    static String mGroup(){
        Scanner sc = new Scanner(System.in);
        Group group = new Group();

        System.out.println("at");
        group.setName(sc.nextLine());

        System.out.println("Fac");
        group.setFac(sc.nextLine());

        System.out.println("Kancha okuuchu");
        group.setNumb(sc.nextInt());

        System.out.println("reg buttu");

        return (group.getName()+"\n"+group.getFac()+"\n"+group.getNumb()+"");
    }
    static String mStudent(){
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.println("at");
        student.setName(sc.nextLine());

        System.out.println("familia");
        student.setSurname(sc.nextLine());

        System.out.println("facultet");
        student.setFac(sc.nextLine());

        System.out.println("Jash");
        student.setYear(sc.nextInt());

        System.out.println("telefon");
        student.setPhone(sc.nextInt());

        System.out.println("reg buttu");

        return (student.getName()+"\n"+student.getSurname()+"\n"+student.getFac()+"\n"+student.getYear()+"\n"+student.getPhone()+"");
    }
}