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
       String[] namesArray = {"Daniel Petersson", "Stefan Stefansson", "Emelie Emeliesson","Olle Ollson", "Daniel Klasson"};
       NameRepository.setNames(namesArray);
       System.out.println("The number of elements in the arrey are: " +NameRepository.getSize());


    }
}
