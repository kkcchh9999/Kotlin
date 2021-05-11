package chap06.section3;

public class KCustomerAccess {
    public static void main(String args[]){
        System.out.println(KCustomer.LEVEL);
        KCustomer.login();  //애노테이션 사용시 접근 방법
        KCustomer.Companion.login();    //코틀린에서 애노테이션을 사용하지 않았을 때 접근 방법

        KJob kjob = KCustomer.JOB;  //KJob 생성, 접근
        System.out.println(kjob.getTitle());

        KCustomer.JOB.setTitle("Accountant");   //KCustomer 을 통한 접근
        System.out.println(KCustomer.JOB.getTitle());
    }
}
