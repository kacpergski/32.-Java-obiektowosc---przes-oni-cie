public class ToyShop {
    private Bear [] bears = new Bear[10];
    private int indexBear = 0;

    private  Car [] cars = new Car[10];
    private  int indexCar = 0;

    private  Book [] books = new Book[10];
    private  int indexBook = 0;

    private  Puzzle[] puzzles = new Puzzle[10];
    private  int indexPuzzle = 0;



    public void addBear(Bear bear){
        if (indexBear < bears.length){
        bears[indexBear++] = bear;}
       else System.out.println("Brak miejsca");
            }


    public void addCar(Car car) {
        if (indexCar < cars.length){
            cars[indexCar++] = car;}
        else System.out.println("Brak miejsca na car");
    }

    public void addBook(Book book) {
        if (indexBook < books.length){
            books[indexBook++] = book;}
        else System.out.println("Brak miejsca na book");
    }
    public void addPuzzle(Puzzle puzzle) {
        if (indexPuzzle < puzzles.length){
            puzzles[indexPuzzle++] = puzzle;}
        else System.out.println("Brak miejsca na puzzle");
    }


    public void displayAll(){

        for (int i = 0; i <indexBear ; i++) {
            bears[i].display();
        }
        for (int i = 0; i <indexCar ; i++) {
            cars[i].display();
        }
        for (int i = 0; i <indexBook ; i++) {
            books[i].display();
        }
        for (int i = 0; i <indexPuzzle ; i++) {
            puzzles[i].display();
        }
    }
}
