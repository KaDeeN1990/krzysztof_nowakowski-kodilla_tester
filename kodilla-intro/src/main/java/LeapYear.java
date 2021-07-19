public class LeapYear {
    public static void main(String[] args) {
        int year = 2027;
        if (year % 4 == 0 && year % 100 !=0) {
            System.out.println("Rok jest przestępny");
        }   else if(year % 400 == 0){
            System.out.println("Rok jest przestępny");
        }
        else {
                        System.out.println("Rok jest nieprzestępny");}
            }
            }