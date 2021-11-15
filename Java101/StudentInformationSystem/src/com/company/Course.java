package com.company;


public class Course {
    Course course;
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int verbalGrade;
    int note;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }


    public Course getCourse() {
        return course;
    }

    public int getNote() {
        return note;
    }

    public void verbalGradeMat(double note, double verbalGrade){
        System.out.println("Mat Not ortalaması : "+((0.5*this.note)+(0.5*verbalGrade)));
    }

    public void verbalGradeFizik(double note,double verbalGrade){
        System.out.println("Fizik Not ortalaması : "+((0.8*this.note)+(0.2*verbalGrade)));
    }

    public void verbalGradeKimya(double note,double verbalGrade){
        System.out.println("Kimya Not ortalaması : "+((0.7*this.note)+(0.3*verbalGrade)));
    }

}
