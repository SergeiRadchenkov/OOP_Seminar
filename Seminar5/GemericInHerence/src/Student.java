public class Student<T extends Comparable<T>, V> extends Person<T, V> implements Comparable<Student<T, V>> {
    private V id;

    public V getId() {
        return id;
    }
    public void setId(V id) {
        this.id = id;
    }
    
    public Student(T name, V age) {
        super(name, age);
    }
    @Override
    public String toString() {
        return "\nStudent " + super.toString();
    }
    @Override
    public int compareTo(Student<T, V> o) {
        return super.getName().compareTo(o.getName());
    }
}