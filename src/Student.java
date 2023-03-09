public class Student {
    private int id, age;
    private String fio;


    public Student(int id, String fio,int age) {
        this.id = id;
        this.fio = fio;
        this.age = age;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", baa=" + age +
                ", fio='" + fio + '\'' +
                '}';
    }
}
