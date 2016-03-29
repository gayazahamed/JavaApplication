package corejava.comparbleVsComparator;

public class Country implements Comparable {

    int countryId;
    String countryName;

    public Country(int countryId, String countryName) {
        super();
        this.countryId = countryId;
        this.countryName = countryName;
    }

    @Override
    public int compareTo(Object arg0) {
        Country country = (Country)arg0;
        if (this.countryId < country.countryId) {
            return -1;
        } else if (this.countryId > country.countryId) {
            return 1;
        } else {
            return 0;
        }
        //or we can use below
        //        return (this.countryId < country.countryId) ? -1 :
        //               (this.countryId > country.countryId) ? 1 : 0;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
