package ru.mirea.ikbo1319.pr2;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Stream;

public class HumanTest {

    public List<Human> getPeople(){
        List<Human> StrayKids = new ArrayList<Human>();

        StrayKids.add(new Human("Bang", "Chan", LocalDate.of(1997, 10,3), 75));
        StrayKids.add(new Human("Li", "Min-ho", LocalDate.of(1998, 10, 25),68));
        StrayKids.add(new Human("Seo", "Chang-bin", LocalDate.of(1999,8,11), 71));
        StrayKids.add(new Human("Hwang", "Hyun-jin", LocalDate.of(2000,3,20),67));
        StrayKids.add(new Human("Han", "Ji Sung", LocalDate.of(2000, 9,14), 70));
        StrayKids.add(new Human("Lee", "Felix", LocalDate.of(2000,9,15), 68));
        StrayKids.add(new Human("Kim", "Seungmin", LocalDate.of(2000, 9,22), 72));
        StrayKids.add(new Human("Yan", "Jeong In", LocalDate.of(2001, 2, 8), 70));

        return StrayKids;
    }

    public HumanTest(){
        List<Human> members = getPeople();

        Stream<Human> stream1 = members.stream();
        stream1.filter(member -> member.getAge() > 20).forEach(System.out::println);

        System.out.println(" ");
        //Stream<Human> stream2 = members.stream();
        //stream2.sorted(members.sort(Comparator.comparing(Human::getFirstName))).forEach(System.out::println);

        System.out.println(" ");
        Stream<Human> stream3 = members.stream();
        stream3.map(memberAge -> memberAge.getAge() + 3).forEach(System.out::println);

        System.out.println(" ");
        Stream<Human> stream4 = members.stream();
        stream4.mapToInt(Human::getAge).average();
    }



    public static void main(String[] args){
        new HumanTest();
    }
}
