package homeWork3;

import homeWork3.arrays.ArraysMethods;
import homeWork3.user.USER;

public class Main {
    public static void main(String[] args) {
//        int[] arr = {23, 7868, 99};


//        CheckSeasons checkSeasons = new CheckSeasons();
//        checkSeasons.checkSeasons(MONTH.SEPTEMBER);

//        ArraysMethods arraysMethods = new ArraysMethods();
////        arraysMethods.printSortArray(arr);
//        arraysMethods.printMaxValue(arr);

         USER user = USER.USER3;
         user.printNameAndLastname();
         user.upAge( 7);
    }
}

