package com.Hibernate_jpa;

import com.DAO.CountryDAO;
import com.DAO.RegionDAO;
import com.entity.Country;
import com.entity.Region;

public class App {
    public static void main(String[] args) {

        RegionDAO regionDAO = new RegionDAO();
        CountryDAO countryDAO = new CountryDAO();

        // To Add the Region
        Region asia = new Region("Asia");
        regionDAO.addRegion(asia);
        System.out.println("Added Region: " + asia);

        // To Add The Country
        Country india = new Country("IND", "India", asia);
        countryDAO.insertCountry(india);
        System.out.println("Added Country: " + india);

        // to Fetch Region
        Region fetchedRegion = regionDAO.getRegion(asia.getRegion_id());
        System.out.println("Fetched Region: " + fetchedRegion);

        // To Fetch Country
        Country fetchedCountry = countryDAO.getCountry("IND");
        System.out.println("Fetched Country: " + fetchedCountry);

        //To Update Region Name
        regionDAO.updateRegionName(asia.getRegion_id(), "South Asia");
        System.out.println("Updated Region Name.");

        // Update Country Name
        countryDAO.changeCountryName("IND", "Bharat");
        System.out.println("Updated Country Name.");

        // Delete Country
        countryDAO.deleteCountry("IND");
        System.out.println("Deleted Country.");

        // Delete Region
        regionDAO.deleteRegion(asia.getRegion_id());
        System.out.println("Deleted Region.");
    }
}
