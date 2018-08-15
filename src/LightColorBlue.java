public class LightColorBlue implements Command{

    Light light;
    public LightColorBlue(Light light){
        this.light = light;
    }

    public void execute() {
        light.color("Blue");
    }
}
