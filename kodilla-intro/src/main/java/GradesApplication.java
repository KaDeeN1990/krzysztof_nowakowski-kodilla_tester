public class GradesApplication {
    public static void main(String[] args) {
        Grades grades = new Grades();
        grades.add(5);
        grades.add(8);
        int result = grades.lastCharacter();
        System.out.println(result);
        int average = grades.averageCharacter();
        System.out.println(average);

    }
}
