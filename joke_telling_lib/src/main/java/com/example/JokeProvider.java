package com.example;

import java.security.SecureRandom;

public class JokeProvider {

        private String[] jokeList = {
                "I lost my job at the bank on my very first day. \u2013 A woman asked me to check" +
                        " her balance, so I pushed her over.",
                "A prisoner was told how he\u2019ll be executed. Needless to say, he was shocked.",
                "My poor knowledge of Greek mythology has always been my Achilles\u2019 elbow.",
                "How does Moses prepare his tea? \u2013 Hebrews it.",
        };

        public JokeProvider() {};

        public String tellJoke() {
            SecureRandom random = new SecureRandom();
            int number = random.nextInt(4);
            return jokeList[number];
        }
}
