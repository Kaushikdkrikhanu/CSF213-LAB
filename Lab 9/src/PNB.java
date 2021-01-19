public class PNB extends Bank{
    float rate;
    float principle;
    float time;
    float interest;

    PNB(float principle,float time,float interest){
        this.principle = principle;
        this.time = time;
    }
    void getRateOfInterest(float rate) {
        this.rate = rate;
    }
    void calculateInterest(){
        interest = principle*(rate/100)*time;
    }

}
