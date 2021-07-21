public class Application {
    double age;
    double height;
    public Application(double age, double height) {
        this.age = age;
        this.height = height;
    }

    public static void main(String[] args) {
        Application adam = new Application(40.5,178);
        double age = 40.5;
        double height = 178;

        if (adam != null) {
            if (age > 30 && height > 160) {
                System.out.println("User is older than 30 and higher than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }
}