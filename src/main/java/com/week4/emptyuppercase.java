package com.week4;


    import java.util.Optional;

    public class emptyuppercase {
        public static Optional<String> toUpperCase(Optional<String> inputOptional) {
            if (inputOptional.isPresent()) {
                String input = inputOptional.get();
                return Optional.of(input.toUpperCase());
            } else {
                return Optional.empty();
            }
        }

        public static void main(String[] args) {
            Optional<String> inputOptional = Optional.of("Hello, JAVA!!!!");
            Optional<String> uppercaseOptional = toUpperCase(inputOptional);
            if (uppercaseOptional.isPresent()) {
                System.out.println("Uppercase string: " + uppercaseOptional.get());
            } else {
                System.out.println("Input optional is empty.");
            }
        }
    }


