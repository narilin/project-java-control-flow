public class WeatherAdvisor {
    public static void main(String[] args) {
        int temperature = 35; // Temperatura en grados Celsius

        System.out.println("The temperature is " + temperature + "°C.");

        // TODO: Agrega sentencias if-else aquí para dar consejos climáticos
        if (temperature > 30) {
    System.out.println("It's a hot day. Remember to stay hydrated!");
} else if (temperature > 20) {
    System.out.println("It's a nice warm day. Enjoy the weather!");
} else if (temperature > 10) {
    System.out.println("It's a bit cool. You might need a light jacket.");
} else {
    System.out.println("It's cold. Wear warm clothes!");
}
    }
}