package se.lexicon;




import javax.naming.Name;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
       //Usage of methods

       //Create Array and add names. Return size of Array
       String[] newNames= {"Daniel Petersson", "Lars Larsson", "Klas Klasson"};
       NameRepository.setNames(newNames);
       System.out.println("The number of elements in the arrey are: " +NameRepository.getSize()); //Should return 3

        String [] findAllNames = NameRepository.findAll();
        System.out.println("All names: " + Arrays.toString(findAllNames));

        NameRepository.clear();
        System.out.println("The number of elements in the arrey after clearing are: " +NameRepository.getSize());

        NameRepository.add("Evald Evaldsson");
        NameRepository.add("Lena Larsson");
        NameRepository.add("Stig Stigsson");






        //Boolean remove = NameRepository.remove("Daniel Petersson");
        //System.out.println("Removing Person: "  + remove);// True if match, else false
        //System.out.println(Arrays.toString());

    }
}
