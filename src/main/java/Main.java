import children.Baby;

public class Main {

    public static void main( String[] args ) {

        Baby cameron = new Baby() ;
        cameron.name = "Cameron";
        cameron.age = 1;
        cameron.eat(5);
        System.out.println( cameron );
    }

}

