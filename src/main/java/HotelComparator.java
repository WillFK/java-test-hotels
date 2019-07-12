import hotel.AbstractHotel;
import hotel.BridgewoodHotel;
import hotel.LakewoodHotel;
import hotel.RidgewoodHotel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HotelComparator {

    private List<AbstractHotel> hotels;

    public HotelComparator() {
        hotels = new ArrayList<>();
        hotels.add(new BridgewoodHotel());
        hotels.add(new RidgewoodHotel());
        hotels.add(new LakewoodHotel());
    }

    public AbstractHotel findCheapestHotel(Query query) {

        AbstractHotel cheapestHotel = null;
        int cheapestPrice = Integer.MAX_VALUE;

        for (AbstractHotel hotel : hotels) {

            int cost = 0;

            for (Date date : query.getDates()) {
                cost += hotel.getCost(date, query.getProgram() == Program.REWARD);
            }

            if (cost < cheapestPrice) {

                cheapestHotel = hotel;
                cheapestPrice = cost;

            } else if (cost == cheapestPrice) {
                if (hotel.ranking() > cheapestHotel.ranking()) {
                    cheapestHotel = hotel;
                }
            }
        }

        return cheapestHotel;
    }
}
