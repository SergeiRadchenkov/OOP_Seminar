import java.util.Iterator;
import java.util.List;

public class StudentGroup<T extends Comparable<T>, V> implements Iterable<Student<T, V>> {
    // Инициализация списка студентов входящих в группу
    private List<Student<T, V>> group;
    // Инициализация номера группы
    private V idGroup;

    // Конструктор StudentGroup
    public StudentGroup(List<Student<T, V>> group, V idGroup) {
        this.group = group;
        this.idGroup = idGroup;
    }
    // Getter и Setter list
    public List<Student<T, V>> getGroup() {
        return group;
    }
    public void setGroup(List<Student<T, V>> group) {
        this.group = group;
    }
    // Getter и Setter idGroup
    public V getIdGroup() {
        return idGroup;
    }
    public void setIdGroup(V idGroup) {
        this.idGroup = idGroup;
    }
    // ToString для корректировки выведения в консоль
    @Override
    public String toString() {
        return "StudentStream " + group + "\nidGroup=" + idGroup + "\n";
    }
    // Конструктор итератора
    @Override
    public Iterator<Student<T, V>> iterator() {
        return new StudentIterator<T, V>(group);
    }
}