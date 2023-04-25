package homeWork3;

public class CheckSeasons {
    public void checkSeasons(MONTH month){
        switch(month){
            case MARCH:
            case APRIL:
            case MAY:
                System.out.println("весна");
                break;
            case JUNE:
            case JULY:
            case AUGUST:
                System.out.println("лето");
                break;
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                System.out.println("осень");
                break;
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                System.out.println("зима");
                break;

        }
    }
}


