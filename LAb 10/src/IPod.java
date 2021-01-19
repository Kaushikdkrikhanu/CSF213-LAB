public class IPod implements Apple{
    public String name;
    Double computePower;

    public IPod(){
        this.name = "ipod";
    }
    public void about() {
        System.out.println(name);
    }

    public void setComputePower(double power) {
        computePower=power;
    }

    public void printComputePower() {
        System.out.println("The "+ name+" has a computing power of "+computePower+" MIPS");
    }
}
