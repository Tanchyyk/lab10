package builder;

public class Main {
    public static void main(String[] args) {
        User user1 = User.builder().age(18).gender("f").occupation("ucu").build();
        System.out.println(user1);
    }
}
