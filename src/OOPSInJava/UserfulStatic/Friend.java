package OOPSInJava.UserfulStatic;

public class Friend {
    // static = Modifies a variable or method belong to the class,
    //               rather than to any specific object.
    //               Commonly used for utility methods or shared resources.

    String name;
    static int numOfFriends = 0;

    Friend(String name){
        this.name = name;
        numOfFriends++;
    }

    static void showFriends(){
        System.out.println("You have " + numOfFriends + " friends");
    }
}
