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
       String[] arr = {"daniel", "Stefan", "emmelie","olle"};
        System.out.println(NameRepository.getSize());
        NameRepository.findAll();
        NameRepository.setNames(arr);
        //System.out.println(NameRepository.getSize());
        //NameRepository.findAll();
        NameRepository.add("leif");
        System.out.println(Arrays.toString(NameRepository.findAll()));
        System.out.println(NameRepository.getSize());
    }
}
