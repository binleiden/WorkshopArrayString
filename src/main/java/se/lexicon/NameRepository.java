package se.lexicon;


import java.util.Arrays;

public class NameRepository {
    //Part 1

    //Names array
    static String[] names = new String[0];

    //Return number of elements i the array
    public static int getSize() {
        return names.length;
    }

    //Sends in an array that set the private static array, This should replace all existing names.
    public static void setNames(String[] newNames) {
        names = Arrays.copyOf(newNames, newNames.length);

    }

    //Should completely empty array
    public static void clear() {
        names = new String[0];

    }

    //Returns all names in a new array
    public static String[] findAll() {
        System.out.println(Arrays.toString(names));
        return names = Arrays.copyOf(names, names.length);

    }
    //End Part 1

    //Part 2

    //Returns name if found and null if not found
    public static String find(String findName) {
        for (String element : names) {
            if (findName.equalsIgnoreCase(element)) {
                System.out.println("Match found: " + element);
                return element; //return the name if found
            }
        }
        System.out.println("No match found");
        return null; //return null if the name is not found
    }

    //Should add a new name to the array. Returns true when name was added and false when the array contains the name.
    public static boolean add(final String fullName) {
        if (find(fullName) != null) {
            System.out.println("Person already exist cannot add");
            return false; //return false if the array already includes the name
        }

        String[] addName = Arrays.copyOf(names, names.length + 1);
        addName[addName.length - 1] = fullName;
        names = addName;
        return true; //return true as the name is added successfully

    }

    //End of part 2

    //Part 3
    //Searches the array trying to find all names that has passed in first name. Returns a String array containing all matches.
    public static String[] findByFirstName(final String firstName) {
        String[] matches = new String[0];//new string to hold matching firstNames
        for (String fullName : names) {
            String[] parts = fullName.split(" ");
            if (parts[0].equalsIgnoreCase(firstName)) {
                matches = Arrays.copyOf(matches, matches.length + 1);
                matches[matches.length - 1] = fullName;
            }
        }
        return matches;

    }


    //Searches the array trying to find all names that has passed in last name. Returns a String array containing all matches.
    public static String[] findByLastName(final String lastName) {
        String[] matches = new String[0];//new string to hold matching lastNames
        for (String fullName : names) {
            String[] parts = fullName.split(" ");
            if (parts[1].equalsIgnoreCase(lastName)) {
                matches = Arrays.copyOf(matches, matches.length + 1);
                matches[matches.length - 1] = fullName;
            }
        }
        return matches;

    }

    //Should find a name and replace it with new fullName if available. Returns true if name was found and updated
    //with the new name. False if name could not be updated because name was not found or name was found but an
    // existing name matching the updatedName already exists.
    public static boolean update(final String original, final String updatedName) {
        for (String name : names) {
            if (name.equalsIgnoreCase(updatedName)) {
                return false; // Name matches the updatedName
            }
        }

        // Update the name if original is found
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(original)) {
                names[i] = updatedName;
                printNames();
                return true; // Name updated
            }
        }
        return false; // Name not found
    }

    //End of part 3

    //Part 4

    //Should remove a name from the array. Returns true if name was removed and false if the name was not
    //removed for some reason.
    public static boolean remove(final String fullName) {
        if (find(fullName) == null) {
            return false; //return false if the array already includes the fullName
        }

        String[] removeName = new String[names.length - 1];
        int index = 0; //index to store matching name
        for (String name : names) {
            if (!name.equalsIgnoreCase(fullName)) {
                removeName[index++] = name;

            }
        }
        names = removeName;
        printNames();
        return true; //return true name removed successfully

    }

    public static void printNames() {
        System.out.println("Updated array: ");
        for (String name : names) {
            if (name != null) {
                System.out.println(name);
            }
        }
    }
}

//End of part 4


