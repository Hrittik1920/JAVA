import java.util.Random;

class Student {
    String name;
    String email;
    private String password;

    private void setPassword(String pas) {
        this.password = pas;
    }

    public String getPassword() {
        Random ran = new Random();
        String sbb = "";
        for(int i=0;i<8;i++) {
            sbb += ran.nextInt(10);
        }
        setPassword(sbb);
        return this.password;
    }
}

public class Practice {
    public static void main(String[] args) {
        Student s1  = new Student();
        System.out.println(s1.getPassword());
    }
}