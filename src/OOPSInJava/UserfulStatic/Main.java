package OOPSInJava.UserfulStatic;

public class Main {
    public static void main(String[] args) {
        Friend friend1 = new Friend("Garvit");
        Friend friend2 = new Friend("Aayushman");

        System.out.println(Friend.numOfFriends);

        Friend.showFriends();
    }
}
