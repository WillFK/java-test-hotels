import hotel.AbstractHotel;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    private Main() {}

    public static void main(String... args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = null;

        final HotelComparator comparator = new HotelComparator();

        Query query;
        AbstractHotel hotel;

        try {

            System.out.println("please inform date data following this format: <tipo_do_cliente>: <data1>, <data2>, <data3>");
            input = reader.readLine();
            while (!"".equals(input)) {

                    query = parseQuery(input);
                    System.out.println(query);

                    hotel = comparator.findCheapestHotel(query);
                    System.out.println("cheapest = " + hotel.toString());


                    System.out.println("please inform date data following this format: <tipo_do_cliente>: <data1>, <data2>, <data3>");
                    input = reader.readLine();
                }
            }

        catch (Exception e) {
            System.out.println("Oops");
            e.printStackTrace();
        }

        System.out.println("Goodbye!");
    }

    public static Query parseQuery(String queryString) throws ParseException {
        //Regular: 16Mar2009(mon), 17Mar2009(tues), 18Mar2009(wed)

        String[] chuncks = queryString.split(": ");
        if (chuncks.length == 2) {

            String programString = chuncks[0];
            Program program = Program.getProgramByString(programString);

            //16Mar2009(mon), 17Mar2009(tues), 18Mar2009(wed)
            String datesString = chuncks[1];
            String[] datesStringArray = datesString.split(", ");

            List<Date> dates = new ArrayList<>();
            for (String dateString: datesStringArray) {
                dates.add(parseDate(dateString));
            }

            return new Query(program, dates);

        } else {
            throw new IllegalArgumentException();
        }
    }

    private static Date parseDate(String dateString) throws ParseException {
        //18Mar2009(wed)
        final SimpleDateFormat format = new SimpleDateFormat("ddMMMyyyy");
        return format.parse(dateString);
    }
}
