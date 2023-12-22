package info.nahid.unitteast.business;

import info.nahid.unitteast.data.DataService;

import java.util.Arrays;

public class BusinessImpl {

    private  DataService dataService;

    public void setDataService(DataService dataService) {
        this.dataService = dataService;
    }

    //functional Programming
    public int calculateSum(int[] data) {
        return Arrays.stream(data).reduce(Integer::sum).orElse(0);
    }

    public int calculateSumUsingDataService() {
        int sum = 0;
        int[] data = dataService.retrieveAllData();
        for (int value : data) {
            sum += value;
        }
        return sum;
    }
}
