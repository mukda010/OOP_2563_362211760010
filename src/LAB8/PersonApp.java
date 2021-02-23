package LAB8;

public class PersonApp {
    public static void main(String[] args) {

        //objects
        Person p1 = new Person();
        p1.setName("mukda muangsrinun");
        p1.setAge(22);

        Person p2 = new Teacher("RUTS");
        p2.setName("mook");
        p2.setAge(23);


        Person p3 =new Doctor("Thungsong");
        p3.setName("suchat");
        p3.setAge(28);

        //call introduce
        p1.introduce();
        p2.introduce();
        p3.introduce();


    }
}
