package window;

public class Window {

    private boolean isOpen = true;
    private String name = "";

    public void setName (String newName) {
        this.name = newName;
    }

    public void openWindow() {

        this.isOpen = true;
    }

    public void closeWindow() {

        this.isOpen = false;
    }

    public void checkWindowStatus() {

        if ( this.isOpen ) {
            System.out.println( this.name + " window is open." );
        }
        else {
            System.out.println( this.name + " window is closed." );
        }
    }

    public boolean isOpen() {

        return isOpen;
    }

    public void setOpen( boolean open ) {

        isOpen = open;
    }

    public String getName() {

        return name;
    }
}
