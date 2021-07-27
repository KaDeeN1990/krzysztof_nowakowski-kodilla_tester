public class user1 {
    int age;
    String name;
    public user1(int age, String name){
        this.age = age;
        this.name = name;
    }

    public static void main(String[] args) {
        user1 kacper = new user1(21, "kacper");
        user1 krzysztof = new user1(30, "krzysztof");
        user1 klaudiusz = new user1(42, "klaudiusz");
        user1 pawel = new user1(36, "pawel");
        user1 marcin = new user1(28, "marcin");
        user1 michal = new user1(58, "michal");

        user1[] users = {kacper, krzysztof, klaudiusz, pawel, marcin, michal};
        int result = 0;
        for (int i = 0; i < users.length; i++) {
            result = result + users[i].age;
        }
        result = result / users.length;
        System.out.println(result);
        for (int i = 0; i < users.length; i++) {
            if (users[i].age < result) {
                System.out.println(users[i].name);
            }
        }

    }}
