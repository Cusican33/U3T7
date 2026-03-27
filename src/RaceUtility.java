public class RaceUtility
{
    private RaceUtility() {}

    static double milesToKm(double miles)
    {
        return miles * 1.60934;
    }

    static double kmToMiles(double km)
    {
        return km * 0.621371;
    }

    static String makeProper(String str)
    {
        String message = "";
        boolean nextCap = false;
        if (Character.isUpperCase(str.charAt(0))) message += str.substring(0, 1);
        else message += str.substring(0, 1).toUpperCase();
        for (int i = 1; i < str.length() - 1; i++)
        {
            if (nextCap)
            {
                if (Character.isUpperCase(str.charAt(i))) message += str.substring(i, i + 1);
                else message += str.substring(i, i + 1).toUpperCase();
                nextCap = false;
            }
            else
            {
                if (str.charAt(i) == ' ')
                {
                    nextCap = true;
                    message += str.substring(i, i + 1);
                }
                else if (Character.isLowerCase(str.charAt(i))) message += str.substring(i, i + 1);
                else message += str.substring(i, i + 1).toLowerCase();
            }
        }
        return message;
    }
}
