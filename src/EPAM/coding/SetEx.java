package EPAM.coding;

import java.util.HashSet;
import java.util.Set;

public class SetEx {
    public static void main(String[] args) {
        Set<Integer> set = Set.of(10,20,30);
        //Set.of() is static method gives inmodifible set that not to be changed we have it from jdk 9

        System.out.println(set);

    }
}
