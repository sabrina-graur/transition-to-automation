package mainclass.exercises.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListFriend {
    public static void main(String[] args) {
        String[] friends = {"Mike", "Vlada", "Boris", "Rina", "Birendra"};
        List<String> listOfFriends = Arrays.asList(friends);
        Iterator<String> iterator = listOfFriends.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        List<String> secondFriends = new ArrayList<>();
        secondFriends.add("Strahd");
        secondFriends.add("Vollo");
        secondFriends.add("Zintrana");
        for (String friend : secondFriends)
            System.out.printf("%n%s", friend);
    }
}
