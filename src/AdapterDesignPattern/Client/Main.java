package AdapterDesignPattern.Client;

import AdapterDesignPattern.Adapter.WeightMachineAdapter;
import AdapterDesignPattern.Adapter.WeightMachineAdapterImpl;
import AdapterDesignPattern.Adaptee.WeightMachineImpl;

public class Main {
    
    public static void main(String[] args) {
        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineImpl());
        
        System.out.println(weightMachineAdapter.getWeightinKg());
    }
}
