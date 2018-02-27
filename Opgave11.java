package Kap11Exercise11;

import java.util.HashSet;
import java.util.Set;

public class Opgave11
{
    /*
    Write a method called symmetricSetDifference that accepts two Sets as parameters
    and returns a new Set containing their symmetric set difference
    (that is, the set of elements contained in either of the two sets but not in both).
    For example, the symmetric difference between the sets
    [1, 4, 7, 9] and [2, 4, 5, 6, 7] is [1, 2, 5, 6, 9].
    */

    public static void main(String[] args)
    {
        Set<Integer> firstSet = new HashSet<>();
        firstSet.add(1);
        firstSet.add(4);
        firstSet.add(7);
        firstSet.add(9);

        Set<Integer> secondSet = new HashSet<>();
        secondSet.add(2);
        secondSet.add(4);
        secondSet.add(5);
        secondSet.add(6);
        secondSet.add(7);

        System.out.println(symmetricSetDifference(firstSet, secondSet));

    }

    public static Set<Integer> symmetricSetDifference(Set<Integer> setOne, Set<Integer> setTwo)
    {
        Set<Integer> setIntersect = new HashSet<Integer>(setOne);
        setIntersect.removeAll(setTwo);

        setTwo.removeAll(setOne);
        setIntersect.addAll(setTwo);

        return setIntersect;
    }
}
