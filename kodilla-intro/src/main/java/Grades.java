public class Grades {
    private int[] grades;
    private int size;
    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }
    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;

    }
    public int lastCharacter(){
        return this.grades[--this.size];
    }
    public int averageCharacter(){
        int result = 0;
        for (int i = 0; i < this.size; i++){
            int number = this.grades[i];
            result = result + number;
        }
            return result / this.size;
    }
}
