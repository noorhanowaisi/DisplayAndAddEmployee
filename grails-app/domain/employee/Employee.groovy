package employee

class Employee {
     int code;
     String nameE;
     int age;
     String job;

    Employee(int code, String nameE, int age, String job) {
        this.code = code
        this.nameE = nameE
        this.age = age
        this.job = job
    }

    Employee(String code, String nameE, String age, String job) {
        this.code = Integer.valueOf(code)
        this.nameE = nameE
        this.age = Integer.valueOf(age)
        this.job = job
    }

}
