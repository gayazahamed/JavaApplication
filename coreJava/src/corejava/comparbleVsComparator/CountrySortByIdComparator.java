package corejava.comparbleVsComparator;

import java.util.Comparator;

public class CountrySortByIdComparator implements Comparator<Country> {
    @Override
    public int compare(Country country1, Country country2) {

        if (country1.getCountryId() < country2.getCountryId()) {
            return -1;
        } else if (country1.getCountryId() > country2.getCountryId()) {
            return 1;
        } else {
            return 0;
        }
        //or we can use below

        //        return (country1.getCountryId() < country2.getCountryId()) ? -1 :
        //               (country1.getCountryId() > country2.getCountryId()) ? 1 : 0;
    }
}
