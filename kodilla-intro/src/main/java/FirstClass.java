public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 1000, 2010);
        System.out.println(notebook.weight + " " + notebook.price + " " + notebook.year);
       notebook.checkPrice(); notebook.checkWeight(); notebook.checkYear();
        Notebook heavyNotebook = new Notebook(2000, 1500, 2021);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price + " " + heavyNotebook.year);
        heavyNotebook.checkPrice(); heavyNotebook.checkWeight(); heavyNotebook.checkYear();
        Notebook oldNotebook = new Notebook(1200, 500, 1999);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price + " " + oldNotebook.year);
        oldNotebook.checkPrice(); oldNotebook.checkWeight(); oldNotebook.checkYear();
        Notebook lenovoNotebook = new Notebook(3200, 4200, 2021);
        System.out.println( lenovoNotebook.weight + " " + lenovoNotebook.price + " " + lenovoNotebook.year);
        lenovoNotebook.checkPrice(); lenovoNotebook.checkWeight(); lenovoNotebook.checkYear();
    }
}
