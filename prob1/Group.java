package prob1;

import java.util.ArrayList;
import java.util.List;

public class Group <T>{
    private T specialElement;
    private List<T> elements=new ArrayList<>();

    public Group(T specialElement, List<T> elements) {
        this.specialElement = specialElement;
        this.elements = elements;
    }

    public T getSpecialElement() {
        return specialElement;
    }

    public List<T> getElements() {
        return elements;
    }

    public void setSpecialElement(T specialElement) {
        this.specialElement = specialElement;
    }

    public  static Group<?> copy(Group<?> group){
     return  copyHelper(group);
    }

    private static <T> Group<T> copyHelper(Group<T> group) {
        List<T> elements = new ArrayList<>(group.getElements());
        return new Group<>(group.getSpecialElement(), elements);
    }
}
