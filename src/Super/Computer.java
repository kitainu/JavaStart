package Super;

public class Computer {
    private double cpuTempearture;
    private int ramMemory;

    public int getRamMemory() {
        return ramMemory;
    }


    public void setRamMemory(int ramMemory) {
        this.ramMemory = ramMemory;
    }

    public double getCpuTempearture(){
        return cpuTempearture;
    }
    public void setCpuTemperature(double cpuTempearture){
        this.cpuTempearture=cpuTempearture;
    }
    public Computer(double cpuTempearture, int ramMemory){
        setCpuTemperature(cpuTempearture);
        setRamMemory(ramMemory);
    }




}
