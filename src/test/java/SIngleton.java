class Singleton {

    private void singleton() {

    }

    private static String word;

    public static String getWord() {

        if (word == null) {
            System.out.println("First time call. Word object is null " + "Assigning a new value  now");

            word = "something";
        } else {
            System.out.println("Word is already has a value");
        }
        return word;
    }
}
