import java.util.*;

public class Client {

    public static void main(String[] args) {
        //invoker
        RemoteControl control = new RemoteControl();
        //Receiver
        Light light = new Light();

        //Concrete Commands
        Command lightsOn = new LightOnCommand(light);
        Command lightsOff = new LightOffCommand(light);
        Command status = new LightStatus(light);
        Command colorGreen = new LightColorGreen(light);
        Command colorRed = new LightColorRed(light);
        Command colorBlue = new LightColorBlue(light);


        List<Command> commands = new ArrayList<>();
        commands.add(status);
        commands.add(lightsOn);
        commands.add(colorBlue);
        commands.add(status);
        commands.add(lightsOff);
        commands.add(status);
        commands.add(colorGreen);
        commands.add(lightsOn);
        commands.add(status);
        commands.add(colorRed);
        commands.add(status);
        commands.add(lightsOff);
        commands.add(status);


        for(Command c: commands){

            control.setCommand(c);
            control.pressButton();

        }

        System.out.println("Done\n");

        for (int i = commands.size()-1; i >= 0; i--){
            control.setCommand(commands.get(i));
            control.pressUndo();
        }


    }
}
