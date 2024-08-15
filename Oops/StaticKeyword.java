
public class StaticKeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.SchoolName = "ABC";
        Student s2 = new Student();
        s2.GetSchoolName();
    }
}

class Student {
    String name;

    static String SchoolName;

    void GetSchoolName() {
        System.out.println(SchoolName);
    }

    void SetName(String name) {
        this.name = name;

    }

    String GetName() {
        return this.name;
    }
}
