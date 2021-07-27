public class Application {
    String name;
    double age;
    double height;

    public Application(double age, double height, String name) {
        this.age = age;
        this.height = height;
        this.name = name;
    }

    public boolean validateAge() {
        if (age > 30) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validateHeight() {
        if (height > 160) {
            return true;
        } else {
            return false;
        }
    }
    public boolean validateName(){
        if (name != null){
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Application adam = new Application(40.5, 178, "adam");

        if (adam.validateName()) {
            if (adam.validateAge() && adam.validateHeight()) {
                System.out.println("User is older than 30 and higher than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }
}