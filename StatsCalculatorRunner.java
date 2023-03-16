public class StatsCalculatorRunner {
    public static void main(String[] args) {
        double[] data = {10.0, 20.0, 5.0, 15.0, 25.0, 30.0, 8.0};
        //create a StatsCalculator object
        StatsCalculator myCalculator = new StatsCalculator(data);

        myCalculator.print();
        myCalculator.sortData();
        myCalculator.printSorted();
        myCalculator.printFiveNumberSummary();
        System.out.println("\nThe mean is " + myCalculator.calculateMean());

        System.out.println();

        data = new double[]{1, 2, 3, 4, 5, 6};

        //create a StatsCalculator object
        StatsCalculator myCalculator2 = new StatsCalculator(data);

        myCalculator2.print();
        myCalculator2.sortData();
        myCalculator2.printSorted();
        myCalculator2.printFiveNumberSummary();
        System.out.println("\nThe mean is " + myCalculator2.calculateMean());

    }

}
