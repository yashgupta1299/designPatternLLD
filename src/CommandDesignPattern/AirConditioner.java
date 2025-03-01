package CommandDesignPattern;

// reciever
public class AirConditioner {

    boolean isOn;
    int temperature;
    public void turnOnAc(){
        this.isOn = true;
        System.out.println("Ac is on");
    }
    public void turnOfAc(){
        this.isOn = false;
        System.out.println("Ac is off");
    }
    public void setTemperature(int temperature){
        this.temperature = temperature;
        System.out.println("Temperature changed to "+temperature);
    }
}