public class Light {

    private boolean on;
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
            System.out.println("The light is on.");
            System.out.println("The color is white.");
        } else {
            System.out.println("The light is off.");
        }
    }

}
