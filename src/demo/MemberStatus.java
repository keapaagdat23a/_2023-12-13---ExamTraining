package demo;

public enum MemberStatus {
  ACTIVE (1, 'a'),
  PASSIVE (0, 'p');

  private int number;
  private char letter;

  MemberStatus(int number, char letter) {
    this.number = number;
    this.letter = letter;
  }

  public int getNumber() {
    return number;
  }

  public char getLetter() {
    return letter;
  }
}
