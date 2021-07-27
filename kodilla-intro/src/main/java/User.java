public class User {
    public static void main(String[] args) {
        String[] usersName = new String[9];
        int[] usersAge = new int[9];
        usersAge[0] = 21;
        usersAge[1] = 30;
        usersAge[2] = 42;
        usersAge[3] = 27;
        usersAge[4] = 36;
        usersAge[5] = 38;
        usersAge[6] = 29;
        usersAge[7] = 53;
        usersAge[8] = 16;
        usersName[0] = "Kacper";
        usersName[1] = "Krzysztof";
        usersName[2] = "Klaudiusz";
        usersName[3] = "Marcin";
        usersName[4] = "Pawel";
        usersName[5] = "Lukasz";
        usersName[6] = "Wojtek";
        usersName[7] = "Michal";
        usersName[8] = "Adrian";
        System.out.println(usersAge[0] + " " + usersName[0]);
        System.out.println(usersAge[1] + " " + usersName[1]);
        System.out.println(usersAge[2] + " " + usersName[2]);
        System.out.println(usersAge[3] + " " + usersName[3]);
        System.out.println(usersAge[4] + " " + usersName[4]);
        System.out.println(usersAge[5] + " " + usersName[5]);
        System.out.println(usersAge[6] + " " + usersName[6]);
        System.out.println(usersAge[7] + " " + usersName[7]);
        System.out.println(usersAge[8] + " " + usersName[8]);

        int sumaAge = usersAge[0] + usersAge[1] + usersAge[2] + usersAge[3] + usersAge[4] + usersAge[5] + usersAge[6]
                + usersAge[7] + usersAge[8];
        int srednia = sumaAge / usersAge.length;
        System.out.println(sumaAge);
        System.out.println(srednia);
        if (usersAge[0] < srednia) {
            System.out.println(usersAge[0] + " " + "Kacper is younger than average age");
        }
        if (usersAge[1] < srednia) {
            System.out.println(usersAge[1] + " " + "Krzysztof is younger than average age");
        }
        if (usersAge[2] < srednia) {
            System.out.println(usersAge[2] + " " + "Klaudiusz is younger than average age");
        }
        if (usersAge[3] < srednia) {
            System.out.println(usersAge[3] + " " + "Marcin is younger than average age");
        }
    }
}