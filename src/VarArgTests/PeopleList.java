package VarArgTests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Collectors;

public class PeopleList <PersonType extends Person> implements Iterable<Person> {
    private ArrayList<PersonType> personList = new ArrayList<>();

    public PeopleList(PersonType... person) {
        //Arrays.stream(person).toList().forEach(p -> this.personList.add(p));
//        personList.addAll(Arrays.stream(person).toList());
    }

    public void add(PersonType person) {
        this.personList.add(person);
    }

    public void remove(PersonType person) {
        personList.remove(person);
    }

    public int size() {
        return this.personList.size();
    }

    @Override
    public Iterator<Person> iterator() {
        return null;
    }
}
