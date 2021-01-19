public class Main {

    public static void main(String[] args) {
        IPod iPod = new IPod();
        iPod.setComputePower(220);
        iPod.about();
        iPod.printComputePower();
        IPad iPad = new IPad();
        iPad.setComputePower(250);
        iPad.about();
        iPad.printComputePower();
        IPhone iPhone = new IPhone();
        iPhone.setComputePower(4500);
        iPhone.about();
        iPhone.printComputePower();
    }
}
