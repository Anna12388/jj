package homeWork3;

public class CheckSeasons {

import static homeWork3.seasons.MONTH
        public void checkSeasons(MONTH month) {
            switch (month) {
                case MAY:
                case APRIL:
                case MARCH:
                    System.out.println(" - это весна");
                    break;
                case JUNE:
                case JULY:
                case AUGUST:
                    System.out.println(" - это лето");
                    break;
                case SEPTEMBER:
                case OCTOBER:
                case NOVEMBER:
                    System.out.println(" - это осень");
                case DECEMBER:
                case JANUARY:
                case FEBRUARY:
                    System.out.println(" - это зима");
                    break;

            }
        }
    }
