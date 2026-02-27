package chapter2.Report1;

import java.util.Locale;
import java.util.Random;

public class WordRepository {

    private final String[] words = {
            "airplane", "apple", "arm", "bakery", "banana", "bank", "bean",
            "belt", "bicycle", "biography", "blackboard", "boat", "bowl",
            "broccoli", "bus", "car", "carrot", "chair", "cherry", "cinema",
            "class", "classroom", "cloud", "coat", "cucumber", "desk", "dictionary",
            "dress", "ear", "eye", "fog", "foot", "fork", "fruits", "hail",
            "hand", "head", "helicopter", "hospital", "ice", "jacket",
            "kettle", "knife", "leg", "lettuce", "library", "magazine",
            "mango", "melon", "motorcycle", "mouth", "newspaper", "nose",
            "notebook", "novel", "onion", "orange", "peach", "pharmacy",
            "pineapple", "plate", "pot", "potato", "rain", "shirt", "shoe",
            "shop", "sink", "skateboard", "ski", "skirt", "sky", "snow",
            "sock", "spinach", "spoon", "stationary", "stomach", "strawberry",
            "student", "sun", "supermarket", "sweater", "teacher", "thunderstorm",
            "tomato", "trousers", "truck", "vegetables", "vehicles", "watermelon",
            "wind"
    };

    private final Random random = new Random();

    public String randomWord() {
        return words[random.nextInt(words.length)].toUpperCase(Locale.ROOT);
    }
}
