package com.example.learnerlab.people;

import com.example.learnerlab.model.Person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People<PersonType extends Person> implements Iterable<PersonType> {
    protected final List<PersonType> personList;

    public People(List<PersonType> personList) {
        this.personList = new ArrayList<>(personList);
    }

    @SafeVarargs
    public People(PersonType... people) {
        this.personList = new ArrayList<>();
        for (PersonType p : people) {
            this.personList.add(p);
        }
    }

    public void add(PersonType person) {
        personList.add(person);
    }

    public void remove(PersonType person) {
        personList.remove(person);
    }

    public int size() {
        return personList.size();
    }

    public void clear() {
        personList.clear();
    }

    public void addAll(Iterable<PersonType> people) {
        for (PersonType p : people) {
            personList.add(p);
        }
    }

    public PersonType findById(long id) {
        for (PersonType p : personList) {
            if (p.getId() == id) return p;
        }
        return null;
    }

    public List<PersonType> findAll() {
        return personList;
    }

    @Override
    public Iterator<PersonType> iterator() {
        return personList.iterator();
    }

    @Override
    public String toString() {
        return personList.toString();
    }
}
