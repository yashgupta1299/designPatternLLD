package AdapterDesignPattern.Adapter;

import AdapterDesignPattern.Adaptee.WeightMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter{
    WeightMachine weightMachine;
    public WeightMachineAdapterImpl(WeightMachine weightMachine){
        this.weightMachine = weightMachine;
    }
    public double getWeightinKg(){
        double weightInPounds = weightMachine.getWeightInPounds(); 
        double weightInKg = weightInPounds * 0.453592;
        return weightInKg;
    }
}
