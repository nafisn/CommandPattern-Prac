package Lights;

public class Light {

    private boolean on = false;
    private String color = "White";
    public void switchOn(){
        on = true;
    }
    public void switchOff(){
        on = false;
    }

    public void color(String color){
        this.color = color;
    }

    public void showStatus(){
        if (this.on){
            System.out.println("The light is on and the color is " + color);
        } else {
            System.out.println("The light is off.");
        }
    }

}
