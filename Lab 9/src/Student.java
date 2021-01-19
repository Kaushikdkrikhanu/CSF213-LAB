public class Student implements Speaker {
    String classRank;
    Student(String classRank){
        this.classRank=classRank;
    }
    public void speak() {
        if(classRank.toLowerCase().equals("freshman"))
            System.out.println("I am a newbie here");
        else if(classRank.toLowerCase().equals("sophomore")||classRank.toLowerCase().equals("junior"))
            System.out.println("I hate School");
        else if(classRank.toLowerCase().equals("senior"))
            System.out.println("I cant wait to graduate");
    }

    public void announce(String str) {
        System.out.println("I am a Student, here is what i have to say "+str);
    }

    public static void main(String[] args) {
        Student student= new Student("sophomore");
        student.speak();
        student.announce("...");
    }
}
