import java.util.Random;

public class StudentID {
    private final String studentID;
    public StudentID(int year,String branch,String exp,String campus){
        String branchCode;
        switch (branch){
            case "CS": branchCode = "A7";
            break;
            case "CHEM": branchCode = "A1";
            break;
            case "EEE": branchCode = "A3";
            break;
            case "MECH": branchCode = "A4";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + branch);
        }
        String campusCode;
        switch (campus){
            case "Pilani": campusCode = "P";
                break;
            case "Hyderabad": campusCode = "H";
                break;
            case "Goa": campusCode = "G";
                break;
            case "Dubai": campusCode = "U";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + campus);
        }
        Random random = new Random();
        int rand = random.nextInt(999)+1;
        String r = null;
        if(rand<=99){
            r = "0"+rand;
        }
        else if(rand<=9){
            r = "00"+rand;
        }
        else r = rand+"";

        studentID = year+branchCode+exp+campusCode+r;

    }

    public String getStudentID() {
        return studentID;
    }
    public String getEmailID(){
        return studentID+"@dubai.bits-pilani.ac.in";
    }

    public static void main(String[] args) {
        StudentID studentID1 = new StudentID(2014,"CS","PS","Dubai");
        System.out.println(studentID1.getStudentID()+" "+studentID1.getEmailID());
        StudentID studentID2 = new StudentID(2014,"MECH","TS","Pilani");
        System.out.println(studentID2.getStudentID()+" "+studentID2.getEmailID());
    }
}
