package Task2.Seminal1.lesson4.service;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import Task2.Seminal1.lesson4.model.Teacher;

public class TeacherGroupIterator implements Iterator<Teacher> {
    private final List<Teacher> teacherList;
    private int position;

    public TeacherGroupIterator(List<Teacher> studentsList) {
        this.teacherList = studentsList;
    }

    public boolean hasNext() {
        return this.position < this.teacherList.size();
    }

    public Teacher next() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        } else {
            return (Teacher)this.teacherList.get(this.position++);
        }
    }

    public void remove() {
        this.teacherList.remove(--this.position);
    }
}
