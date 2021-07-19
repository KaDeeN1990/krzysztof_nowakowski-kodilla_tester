public class Notebook {
    int weight;
    int price;
    int year;
    public Notebook(int weight, int price, int year){
        this.weight = weight;
        this.price = price;
        this.year = year;
        }
        public void checkPrice() {
            if (this.price < 600) {
                System.out.println("This notebook is very cheap");
            }   else if (this.price >= 600 && this.price <= 1000) {
                System.out.println("This price is good");
            }   else {
                System.out.println("This notebook is expensive");
            }
        }
        public void checkWeight(){
            if (this.weight < 1000) {
                System.out.println("This weight is light");
            }    else if(this.weight >= 1000 && this.weight <= 1800){
                System.out.println("This weight is not so heavy");
            }   else {
                    System.out.println("This weight is very heavy");
            }
        }
        public void checkYear(){
            if (this.price > 900 && this.year < 2000) {
                System.out.println("This notebook is old and expensive");
            }    else if(this.price <= 900 && this.year <=2000) {
                System.out.println("Notebook is cheap and old");
            }    else if(this.price >900 && this.price <1500 && this.year > 2000 && this.year < 2011){
                System.out.println("Notebook is in normal price and is young");
            }   else if(this.price >= 1500 && this.price < 3000 && this.year <= 2021 && this.year >= 2011) {
                System.out.println("Notebook has a good price and is young");
            }   else {
                System.out.println("Notebook is young, but very expensive");
            }
        }
    }