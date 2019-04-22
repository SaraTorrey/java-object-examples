package window;

public class WindowMain {

    public static void main( String[] args ) {

        Window diningWindow = new Window();
        diningWindow.setName( "Dining" );
        diningWindow.closeWindow();
        diningWindow.checkWindowStatus();


        Window kitchenWindow = new Window();
        kitchenWindow.setName( "Kitchen" );
        kitchenWindow.closeWindow();
        kitchenWindow.checkWindowStatus();
    }
}