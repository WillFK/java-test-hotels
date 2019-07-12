import hotel.AbstractHotel;
import org.junit.Assert;
import org.junit.Test;

import java.text.ParseException;

public class ComparatorTest {

    @Test
    public void testLakewood() throws ParseException {
        //
        String testString = "Regular: 16Mar2009(mon), 17Mar2009(tues), 18Mar2009(wed)";

        HotelComparator comparator = new HotelComparator();
        Query query = Main.parseQuery(testString);

        AbstractHotel hotel = comparator.findCheapestHotel(query);
        Assert.assertEquals("Lakewood", hotel.name());
    }

    @Test
    public void testBridgewood() throws ParseException {
        //
        String testString = "Regular: 20Mar2009(fri), 21Mar2009(sat), 22Mar2009(sun)";

        HotelComparator comparator = new HotelComparator();
        Query query = Main.parseQuery(testString);

        AbstractHotel hotel = comparator.findCheapestHotel(query);
        Assert.assertEquals("Bridgewood", hotel.name());
    }

    @Test
    public void testRidgewood() throws ParseException {
        //
        String testString = "Rewards: 26Mar2009(thur), 27Mar2009(fri), 28Mar2009(sat)";

        HotelComparator comparator = new HotelComparator();
        Query query = Main.parseQuery(testString);

        AbstractHotel hotel = comparator.findCheapestHotel(query);
        Assert.assertEquals("Ridgewood", hotel.name());
    }
}
