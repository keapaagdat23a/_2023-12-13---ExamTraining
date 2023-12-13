package demo;

public class Main {
  public static void main(String[] args) {
    Swimmer s = new Swimmer();
    s.setMemberStatus(MemberStatus.ACTIVE);
    System.out.print(s.getMemberStatus().getNumber());
    System.out.println(s.getMemberStatus().getLetter());

    s.setMemberStatus(MemberStatus.PASSIVE);
    System.out.print(s.getMemberStatus().getNumber());
    System.out.println(s.getMemberStatus().getLetter());

    System.out.println("Medlemmet er " + s.getMemberStatus().toString().toLowerCase());


  }
}
