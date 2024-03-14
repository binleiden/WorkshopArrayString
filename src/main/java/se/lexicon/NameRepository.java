package se.lexicon;


import javax.naming.Name;
import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Arrays;
import java.util.Scanner;

public class NameRepository {
    static String[] names = {"Daniel Petersson", "Olle Olsson"};


    //Names array
//Return number of elements i the array
    public static int getSize() {
        return names.length;
    }

    //Sends in an array that set the private static array, This should replace all existing names.
    public static void setNames(String[] names) {
        NameRepository.names = names;

    }

    //Should completely empty array
    public static void clear() {
        names = new String[names.length];
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

        if (find(fullName) != null) {
            return false;
        }

        String[] addName = Arrays.copyOf(names, names.length + 1);
        addName[addName.length - 1] = fullName;
        names = addName;
        return true;

    }

   //Searches the array trying to find all names that has passed in first name. Returns a String array containing all matches.
   public static String[] findByFirstName(final String firstName){
       // todo: Searches the array trying to find all names that has passed in first name

        return String[];
   }

   //Searches the array trying to find all names that has passed in last name. Returns a String array containing all matches.
   public static String[] findByLastName(final String lastName){
       // todo: Searches the array trying to find all names that has passed in last name
        return String[];

   }

   //Should find a name and replace it with new fullName if available. Returns true if name was found and updated
    //with the new name. False if name could not be updated because name wasn’t found or name was found but an
    // existing name matching the updatedName already exists.
   public static boolean update(final String original, final String updatedName){
       // todo: Search a name and replace it with new fullName if available. Returns true if name was found
        return true;
   }

    //Should remove a name from the array. Returns true if name was removed and false if the name was not
    //removed for some reason.
    public static boolean remove(final String fullName){
        // Todo: Remove name from array
        return true;
    }
}


