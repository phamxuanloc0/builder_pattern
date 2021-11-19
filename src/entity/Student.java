package entity;

public class Student {
    //requirement
    private String id;
    private String name;
    private String className;
    private int age;
    private String gender;
    // optional
    private String address;
    private String fartherName;
    private String motherName;
    private String nationlity;
    private String religion;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getClassName() {
        return className;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public String getFartherName() {
        return fartherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public String getNationlity() {
        return nationlity;
    }

    public String getReligion() {
        return religion;
    }
    private Student(StudentBuilder builder){
        this.id=builder.id;
        this.name= builder.name;
        this.className=builder.className;
        this.age=builder.age;
        this.gender=builder.gender;
        this.address=builder.address;
        this.fartherName=builder.fartherName;
        this.motherName=builder.motherName;
        this.nationlity=builder.nationlity;
        this.religion=builder.religion;
    }
    public static class StudentBuilder{
        //requirement
        private String id;
        private String name;
        private String className;
        private int age;
        private String gender;
        // optional
        private String address;
        private String fartherName;
        private String motherName;
        private String nationlity;
        private String religion;

        public StudentBuilder(String id, String name, String className, int age, String gender) {
            this.id = id;
            this.name = name;
            this.className = className;
            this.age = age;
            this.gender = gender;
        }

        public StudentBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public StudentBuilder setFartherName(String fartherName) {
            this.fartherName = fartherName;
            return this;
        }

        public StudentBuilder setMotherName(String motherName) {
            this.motherName = motherName;
            return this;
        }

        public StudentBuilder setNationlity(String nationlity) {
            this.nationlity = nationlity;
            return this;
        }

        public StudentBuilder setReligion(String religion) {
            this.religion = religion;
            return this;
        }
        public Student build(){
            return new Student(this);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", className='" + className + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", fartherName='" + fartherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", nationlity='" + nationlity + '\'' +
                ", religion='" + religion + '\'' +
                '}';
    }
}
