package construct;
//생성자-오버로딩 과 this()
public class ConstructMain2 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("User1",15,90);
        MemberConstruct member2 = new MemberConstruct("User2",16);

        MemberConstruct[] members = {member1,member2};

        for(MemberConstruct s : members){
            System.out.println("이름: " + s.name + "나이:" + s.age + "성적: " + s.grade);
        }


    }
}
