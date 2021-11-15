package com.company;

public class Main {
    public static void main(String[] args) {

        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", 4, "140144015", mat, fizik, kimya);
        s1.addBulkExamNote(50,20,40);
        s1.isPass();
        mat.verbalGradeMat(s1.getMatNote(),60);
        fizik.verbalGradeFizik(s1.getFizikNote(),85);
        kimya.verbalGradeKimya(s1.getKimyaNote(),74);


        Student s2 = new Student("Güdük Necmi", 4, "2211133", mat, fizik, kimya);
        s2.addBulkExamNote(100,50,40);
        s2.isPass();
        mat.verbalGradeMat(s2.getMatNote(),75);
        fizik.verbalGradeFizik(s2.getFizikNote(),90);
        kimya.verbalGradeKimya(s2.getKimyaNote(),83);

        Student s3 = new Student("Hayta İsmail", 4, "221121312", mat, fizik, kimya);
        s3.addBulkExamNote(50,20,40);
        s3.isPass();
        mat.verbalGradeMat(s3.getMatNote(),45);
        fizik.verbalGradeFizik(s3.getFizikNote(),71);
        kimya.verbalGradeKimya(s3.getKimyaNote(),100);
    }
}