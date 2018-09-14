public class Member {

    String name="";
    int age;
    double salary;
    void setdetails(String nam,int n,double s){
        name=nam;
        age=n;
        salary=s;
    }
}

class MemberVariable{

    public static void main(){
        Member temp = new Member();
        temp.setdetails("Harry Potter",30,2500.3);
        System.out.println(temp.name);
        System.out.println(temp.age);
        System.out.println(temp.salary);
    }
}
