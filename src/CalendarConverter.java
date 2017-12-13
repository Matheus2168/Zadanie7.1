public class CalendarConverter {

    final static int MONDAY = 1;
    final static int TUESDAY = 2;
    final static int WEDNESDAY = 3;
    final static int THURSDAY = 4;
    final static int FRIDAY = 5;
    final static int SATURDAY = 6;
    final static int SUNDAY = 7;

    public static String convertDayToString(int dayNumber){
        String result = null;
        switch (dayNumber) {
            case MONDAY:
                result = "Poniedzialek";
                break;
            case TUESDAY:
                result = "Wtorek";
                break;
            case WEDNESDAY:
                result = "Sroda";
                break;
            case THURSDAY:
                result = "Czwartek";
                break;
            case FRIDAY:
                result = "Piatek";
                break;
            case SATURDAY:
                result = "Sobota";
                break;
            case SUNDAY:
                result = "Niedziela";
                break;
            default:
                result = "niewlasciwa liczba";
        }
        return result;
        }




    }



