package se.lexicon;

 Part3 4
import java.util.Arrays;

public class Console {
    public static void main(String[] args) {
        //Usage of methods

        //Create Array and add names. Return size of Array
        String[] newNames = {"Daniel Petersson", "Lars Larsson", "Klas Klasson"};
        NameRepository.setNames(newNames);
        System.out.println("The number of elements in the arrey are: " + NameRepository.getSize()); //Should return 3
        //find and print all names
        String[] findAllNames = NameRepository.findAll();
        System.out.println("All names: " + Arrays.toString(findAllNames));
        //Clear array of elements
        NameRepository.clear();
        System.out.println("The number of elements in the arrey after clearing are: " + NameRepository.getSize());
        //Adding new elements to array
        NameRepository.add("Evald Evaldsson");
        NameRepository.add("Lena Larsson");
        NameRepository.add("Stig Stigsson");
        NameRepository.add("Vega Dellavega");
        NameRepository.add("Lars Larsson");
        NameRepository.add("evald evaldsson"); //Should not be added
        //Searching for elements by fullName, firstName and lastName
        System.out.println("Find name 'Evald Evaldsson': " + NameRepository.find("Evald Evaldsson"));
        System.out.println("Find firstname 'Evald': " + Arrays.toString(NameRepository.findByFirstName("evald")));
        System.out.println("Find lastname 'Larsson': " + Arrays.toString(NameRepository.findByLastName("Larsson")));
        //Updating element from array
        System.out.println("All names before uppdate: " + Arrays.toString(NameRepository.findAll()));
        boolean update = NameRepository.update("Evald Evaldsson", "Elvis Elvisson");
        //Removing element from array
        boolean remove = NameRepository.remove("Elvis Elvisson");
    }

public class Console {

}
