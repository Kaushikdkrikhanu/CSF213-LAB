public class IPad implements Apple{
    public String name;
    Double computePower;

    public IPad(){
        this.name = "ipad";
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
