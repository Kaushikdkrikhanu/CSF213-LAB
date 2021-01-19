public class Initials {
    private String initials="";

    public Initials(String name){
        String[] a = name.split(" ");
        for (String x:a) {
            String b = x.charAt(0)+"";
            initials = initials + b.toUpperCase();
        }
    }
    public String getInitials() {
        return initials;
    }

    public static void main(String[] args) {
        Initials name = new Initials("Mark S. P");
        System.out.println(name.initials);
    }
}
