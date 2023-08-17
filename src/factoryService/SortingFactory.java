package factoryService;

import SortingService.SortingAlgorithm;
import SortingService.impl.BubbleSortAlgorithm;
import SortingService.impl.MergeSortAlgorithm;
import SortingService.impl.QuickSortAlgorithm;
import SortingService.impl.ShakerSortAlgorithm;

public class SortingFactory {
     public SortingAlgorithm creatSortingAlgorithm (factoryEnum.SortingFactory enums) {
        switch (enums){
            case BUBBLE:
                return new BubbleSortAlgorithm();
            case SHAKER:
                return new ShakerSortAlgorithm();
            case MERGE:
                return new MergeSortAlgorithm();
            case QUICK:
                return new QuickSortAlgorithm();
            default:
                throw new RuntimeException();
        }
    }
}
