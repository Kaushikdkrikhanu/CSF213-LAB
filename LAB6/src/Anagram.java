import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {
    public static boolean check(String a,String b){
        a=a.toLowerCase();
        b=b.toLowerCase();
        StringBuffer e = new StringBuffer();
        for(int i=0;i<a.length();i++){
            if(((int)a.charAt(i)>=97)&&((int)a.charAt(i)<=122)){
                e.append(a.charAt(i));

            }
        }
        StringBuffer f = new StringBuffer();
        for(int i=0;i<b.length();i++){
            if(((int)b.charAt(i)>=97)&&((int)b.charAt(i)<=122)){
                f.append(b.charAt(i));
            }
        }
        if(e.length()!=f.length()){
            return false;
        }
        char[] y = new char[e.length()];
        e.getChars(0,e.length(),y,0);
        Arrays.sort(y);


        char[] z = new char[f.length()];
        f.getChars(0,f.length(),z,0);
        Arrays.sort(z);

        for(int i=0;i<y.length;i++){
            if(y[i]!=z[i]){
                return false;
            }

        }
        return true;



    }

    public static void main(String[] args) {
        System.out.println(Anagram.check("parliament","partial men"));
        System.out.println(Anagram.check("Software","swear oft"));
    }
}
