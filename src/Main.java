public class Main {
    public static void main(String[] args) {
        try {
            start(4);
        } catch (TooManyPeopleException | TooLowPeopleException e) {
            System.out.println(e.getMessage());
        }
    }

    static void start(int peoples) {
        if (peoples < 3) throw new TooLowPeopleException();
        if (peoples > 10) throw new TooManyPeopleException();
        System.out.println("катаю " + peoples + " человек");
    }
}

class TooManyPeopleException extends IllegalArgumentException {
    public TooManyPeopleException() {
        super("слишком много людей");
    }
}

class TooLowPeopleException extends IllegalArgumentException {
    public TooLowPeopleException() {
        super("слишком мало людей");
    }
}