//Carlinbhert Adryanne De Guzman
//CITCS 1N - A
//CC2 Final Challenge No. 2
//November 7, 2024

public class WeatherTracker {
    public static void main(String[] args) {

        // Temperatures for the 3 cities, each row represents the temps for one city
        double[][] temperatures =
                {
                {32.5, 23, 28, 21, 22, 26.4, 30.7},
                {20.2, 20, 26.2, 17, 15.3, 19, 20.9},
                {30.1, 29.2, 32, 33.3, 40.5, 29, 35.4}
                };

        // Loop through each city
        for (int i = 0; i < 3; i++) {
//            total temperature values are initialized
            double total = 0;
//            highest temperature is initialized
            double highestTemperature = temperatures[i][0];
            // Take the total and find the highest temperature for each city through another loop
            for (int j = 0; j < 7; j++) {
//                Loop through each temperature one by one and getting the total
                total += temperatures[i][j];
//                if statement to check for the highest temperature and the value is updated
                if (temperatures[i][j] > highestTemperature) {
                    highestTemperature = temperatures[i][j];
                }
            }

//            Calculate the average temperature by dividing it by the number of days
            double averageTemperature = total / 7;

//            Display the average and highest temperatures for each city
            System.out.println("City " + (i + 1) + " Temperatures:");
            System.out.println("Average: " + averageTemperature);
            System.out.println("Highest: " + highestTemperature);
        }
    }
}
