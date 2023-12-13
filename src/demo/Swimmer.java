package demo;

public class Swimmer {
  // NO:
  // private String memberStatus = "active";

  // MAYBE IT'S ACTUALLY PRETTY OK:
  // private boolean isActive = true;

  // NO:
  // private enum MemberStatus { }

  private MemberStatus memberStatus;

  public void setMemberStatus(MemberStatus memberStatus) {
    this.memberStatus = memberStatus;
  }

  public MemberStatus getMemberStatus() {
    return memberStatus;
  }
}
