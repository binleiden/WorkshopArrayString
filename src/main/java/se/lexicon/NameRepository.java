package se.lexicon;


import javax.naming.Name;
import java.util.Arrays;
import java.util.Scanner;

public class NameRepository {
    static String[] names = {"Daniel Petersson", "Olle Olsson"};


    //Names array
//Return number of elements i the array
    public static int getSize() {
        int arrayLength = names.length;
        return arrayLength;
    }

    //Sends in an array that set the private static array, This should replace all existing names.
    public static void setNames(String[] names) {
        NameRepository.names = names;

    }

    //Should completely empty array
    public static void clear() {
        Arrays.fill(names, null);
    }

    //Returns all names in a new array
    public static String[] findAll() {
        String[] addName = Arrays.copyOf(names, names.length);
        return addName;
    }

    //Returns name if found and null if not found
    public static String find(String findName) {
        for (String element : names) {
            if (findName.equalsIgnoreCase(element)) {
                System.out.println("Match found: " + element);
                return element;
            }
        }
        System.out.println("No match found");
        return null;
    }

    //Should add a new name to the array. Returns true when name was added and false when the array contains the name.
    public static boolean add(final String fullName) {
        //todo check if name exist
        if (find(fullName) != null) {
            return false;
        }

        //todo add name to array if true
        String[] addName = Arrays.copyOf(names, names.length + 1);
        addName[addName.length - 1] = fullName;
        names = addName;
        return true;

    }
}


