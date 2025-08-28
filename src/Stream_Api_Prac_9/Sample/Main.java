package Stream_Api_Prac_9.Sample;

public class Main {

    public static void main(String[] args) {
        Pojo p=new Pojo();
        p.setName("Ram");
        p.setRoll(45);
        Pojo p2=new Pojo();
        p2.setName("Ravi");
        p2.setRoll(66);
        print(p,p2);
    }

    public static void print(Pojo p1, Pojo p2){
        System.out.println("P1::"+p1.getName());
        System.out.println("P1::"+p1.getRoll());
        System.out.println("P1::"+p2.getName());
        System.out.println("P1::"+p2.getRoll());
    }
}
