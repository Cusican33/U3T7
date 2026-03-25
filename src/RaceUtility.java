public class RaceUtility
{
    private RaceUtility() {}

    static double MilesToKm(double miles)
    {
        return miles * 1.60934;
    }

    static double KmToMiles(double km)
    {
        return km * 0.621371;
    }

    static String makeProper(String str)
    {
        String message = "";
        for (int i = 0; i < str.length() - 1; i++)
        {
            if
            message += str.substring(i, i + 1);
        }
    }
}
