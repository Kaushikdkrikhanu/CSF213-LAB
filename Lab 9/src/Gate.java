public abstract class Gate {
    boolean a,b,c;
    void setInput(boolean a,boolean b){
        this.a= a;
        this.b= b;
    }
    void displayOutput(){
        System.out.println(c);
    }
    abstract void computeResult();
}
