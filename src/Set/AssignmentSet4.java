package Set;

import java.util.Iterator;
import java.util.TreeSet;

public class AssignmentSet4 {
    TreeSet<String> h1 = new TreeSet<>();

    String saveCountryNames(String CountryName)
    {
        if(h1.add(CountryName))
            return CountryName;

        else
            return "Country Name Already Exists";
    }

    String getCountry(String CountryName)
    {
        Iterator<String> itr = h1.iterator();
        while (itr.hasNext())
        {
            String country = itr.next();
            if(country.equals(CountryName))
                return country;
        }
        return null;
    }

    public static void main(String[] args)
    {
       AssignmentSet4 object = new AssignmentSet4();

        // Adding country names
        System.out.println(object.saveCountryNames("Japan"));
        System.out.println(object.saveCountryNames("India"));
        System.out.println(object.saveCountryNames("America"));
        System.out.println(object.saveCountryNames("Russia"));
        System.out.println(object.saveCountryNames("Japan"));


        //Checking if Country name is present or not

        System.out.println(object.getCountry("India"));
        System.out.println(object.getCountry("Russia"));
        System.out.println(object.getCountry("Pakistan"));
        System.out.println(object.getCountry("China"));
    }
}
