package TestMain;

import entity.Student;

public class main {
    public static void main(String[] args) {
        Student s= new Student.StudentBuilder("1","A","BB",5,"Nam")
                .setAddress("CCC")
                .setFartherName("DDD")
                .setMotherName("FFFF")
                .setNationlity("VN")
                .setReligion("XXX")
                .build();
        System.out.println(s);
    }
}
