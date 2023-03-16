import java.util.Arrays;

public class StatsCalculator {
    private double[] values;
    private double[] sortedValues;

    StatsCalculator() {
        values = new double[20];
        sortedValues = new double[20];
    }
    StatsCalculator(double[] values) {
        this.values = values;
        sortedValues = values;
    }

    public void sortData() {
        Arrays.sort(sortedValues);
    }

    public double calculateMax() {
        int index = sortedValues.length;
        double max = sortedValues[index-1];
        return max;
    }

    public double calculateMin() {
        double min = sortedValues[0];
        return min;
    }

    public double calculateFirstQuartile() {
        int index = values.length/2;
        index = ((int)Math.round((double)index / 2)) - 1;
        return sortedValues[index];
    }

    public double calculateThirdQuartile() {
        int index = values.length/2;
        index = (index+values.length)/2;
        return sortedValues[index];
    }

    public double calculateMedian() {
        int index = values.length/2;
        if(values.length % 2 != 0) {
            return sortedValues[index];
        }
        else {
            return (sortedValues[index-1]+sortedValues[index])/2.0;
        }
    }

    public double calculateSum() {
        double sum = 0;
        for(double value:values) {
            sum += value;
        }
        return sum;
    }

    public double calculateMean() {
        return (this.calculateSum() / values.length);
    }

    public void print() {
        System.out.print("Your data is:");
        for(double value:values) {
            System.out.print(" "+value);
        }
        System.out.println();
    }

    public void printSorted() {
        System.out.print("Your sorted data is:");
        for(double value:sortedValues) {
            System.out.print(" "+value);
        }
        System.out.println();
    }

    public void printFiveNumberSummary() {
        System.out.println("The five number summary is: ");
        System.out.println("\tMinimum: "+this.calculateMin());
        System.out.println("\tFirst Quartile: "+this.calculateFirstQuartile());
        System.out.println("\tMedian: "+this.calculateMedian());
        System.out.println("\tThird Quartile: "+this.calculateThirdQuartile());
        System.out.print("\tMax: "+this.calculateMax());
    }
}
