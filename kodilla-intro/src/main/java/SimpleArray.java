public class SimpleArray {
    public static void main(String[] args){
    String[] friends = new String[5];
    friends[0] = "Mateusz";
    friends[1] = "Kamil";
    friends[2] = "Krzysztof";
    friends[3] = "Patryk";
    friends[4] = "Marcin";
    String friend = friends[2];
    System.out.println(friend);
    int numberOfElements = friends.length;
    System.out.println(numberOfElements);
    System.out.println("Moja tablica zawiera 5 elementów");
    }
}
