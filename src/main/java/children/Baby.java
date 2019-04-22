package children;

public class Baby {

    public String name;
    public int age = 0;
    public int poopCount = 0;


    public void cry() {

        System.out.println( name + " age " + age + " is crying." );

        for ( int i = 0; i < 10; i++ ) {
            System.out.println( "waaaaa waaaa" );
        }
    }



    public void poop() {

        this.poopCount++;
        System.out.println( "poopoo" );
        if ( poopCount > 3 ) {
            for ( int i = 0; i < poopCount; i++ ) {
                System.out.print( "💩" );
            }
            System.out.println( "💩Diaper is FULL!!" );
        }
    }

    public void eat( int numberOfSpoonFulls ) {

        for ( int i = 0; i < numberOfSpoonFulls; i++ ) {
            System.out.println( "nom!" );
            poop();
        }
        System.out.println( name + " ate " + numberOfSpoonFulls + " spoon fulls." );
    }

    public void changeDiaper() {

        System.out.println( "Diaper changed" );
        poopCount = 0;
    }


    @Override public String toString() {
        if (poopCount == 0) {
            return "How great!";
        }
        return "Hi, my name is " + name + " and I am " + age + " years old. I pooped " + poopCount + " times in my diaper right now";
    }
}
