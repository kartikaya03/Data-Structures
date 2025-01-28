package oops;

public class ClassAndObj {   //classes are called blueprint of an object
    String name ;
    String email;                      //attributes
    String id;
    String Class;

    void showName(){     // Behaviour
        name="kartikaya";
        System.out.println("name is "+name);
    }

    void showAll() {
        email = "kartik@gmail.com";
        id = "101";
        Class = "12th";
        System.out.println("All details are " + email + "\n" + id + "\n" + Class);
    }
        public static void main (String[] args){
            ClassAndObj cao = new ClassAndObj();
            cao.showName();
            cao.showAll();
        }




}
