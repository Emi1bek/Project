public class Student {
    private int id, baa;
    private String fio;


    public Student(int id, String fio,int baa) {
        this.id = id;
        this.fio = fio;
        this.baa = baa;
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

    public int getBaa() {
        return baa;
    }

    public void setBaa(int baa) {
        this.baa = baa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", baa=" + baa +
                ", fio='" + fio + '\'' +
                '}';
    }
}
