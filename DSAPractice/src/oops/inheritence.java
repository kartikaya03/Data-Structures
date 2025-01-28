package oops;


//parent class
class fruits {
    String food = "apple";

    public void display() {
        System.out.println("fruits");
    }
}
    //child class inherit properties and behaviour of method class
    class Eat extends fruits{
        public void display(){
            System.out.println("eat");
        }
    }
public class inheritence {
    public static void main(String[] args) {
        fruits fruits = new fruits();     //case 1 : it calls method of parent class
        fruits.display();
        System.out.println(fruits.food);  // can also access food variable



        Eat eat = new Eat();             //case 2 : it calls method of child class
        eat.display();
        System.out.println(eat.food);    // can also access food variable

        fruits fruits1 = new Eat();      //case 3 : it calls method of child class
        fruits.display();


        // Eat eat1 =  new fruits();         //case 4 : cannot convert parent class to child class
        // eat1.display();

        for (int i = 0; i <=5 ; i++) {
            System.out.println(i);
        }

        }



    }


