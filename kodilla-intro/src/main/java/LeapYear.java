public class LeapYear {
    public static void main(String[] args) {
        int year = 1900;
        if (year % 4 > 0 ) {
            System.out.println("Rok jest nieprzestępny");
        }if (year % 4 > 0 && year % 100 >0 ){
                System.out.println("Rok jest nieprzestępny");}
                if (year % 4 > 0 && year % 100 > 0 && year % 400 >0 ){
                    System.out.println("rok jest nieprzestępny");}
                    else {
                        System.out.println("rok jest przestępny");
            }
            }
        }