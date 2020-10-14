package com.pa;

import java.util.HashSet;

public class Group {
    private Person chief;
    private HashSet<Person> members;

    public Group(Person chief) {
        this.chief = chief;
        members = new HashSet<>();
    }

    public void deleteMember(Person member) {
        if (member == null || member.equals(chief)) {
            throw new GroupException("member cannot be deleted");
        }
        members.remove(member);
    }

    public void changeChief(Person p) {
        if (!members.contains(p))
            throw new GroupException(" this member does not exist");
        members.add(chief);
        chief = p;
    }

    public void addMember(Person p) {
        if (members.contains(p))
            throw new GroupException(" this member already exist");

        members.add(p);
    }

    @Override
    public String toString() {
        return "com.pa.Group{" +
                "chief=" + chief +
                ", other members=" + members +
                '}';
    }
}
