package corejava.comparbleVsComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ComparatorMain {
    public ComparatorMain() {
        super();
    }

    public static void main(String[] args) {

        Country indiaCountry = new Country(1, "India ");
        Country chinaCountry = new Country(4, "China ");
        Country nepalCountry = new Country(3, "Nepal ");
        Country bhutanCountry = new Country(2, "Bhutan ");
        Country bhutanCountry2 = new Country(2, "Bhutan ");
        List<Country> listOfCountries = new ArrayList<Country>();
        listOfCountries.add(indiaCountry);
        listOfCountries.add(chinaCountry);
        listOfCountries.add(nepalCountry);
        listOfCountries.add(bhutanCountry);
        listOfCountries.add(bhutanCountry2);

        System.out.println("Before Sort  :  ");
        for (int i = 0; i < listOfCountries.size(); i++) {
            Country country = (Country)listOfCountries.get(i);
            System.out.println("Country Id:  " + country.getCountryId() +
                               "|| " + "Country name:  " +
                               country.getCountryName());

        }
        /////////////////////1111111111////////////////////////////////////
        //Collections.sort(listOfCountries);
        Collections.sort(listOfCountries, new CountrySortByIdComparator());

        System.out.println("After Sort  :  ");

        for (int i = 0; i < listOfCountries.size(); i++) {
            Country country = (Country)listOfCountries.get(i);
            System.out.println("Country Id:  " + country.getCountryId() +
                               "||  " + "Country name:  " +
                               country.getCountryName());
        }
        /////////////////////1111111111////////////////////////////////////


        /////////////////////222222222222222///////////////////////////////
        //Adding to treeset
        //        Set treeSet = new TreeSet();
        //        for (int i = 0; i < listOfCountries.size(); i++) {
        //            Country country = (Country)listOfCountries.get(i);
        //            treeSet.add(country);
        //        }
        //        System.out.println("After Sort  :  ");
        //        Iterator it = treeSet.iterator();
        //        while(it.hasNext()){
        //            Country country = (Country)it.next();
        //            System.out.println("Country Id:  " + country.getCountryId() +
        //                               "||  " + "Country name:  " +
        //                               country.getCountryName());
        //        }

        /////////////////////222222222222222///////////////////////////////


    }
}
