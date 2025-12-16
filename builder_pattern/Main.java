package builder_pattern;

import builder_pattern.src.builder.User;

class Main {
    public static void main(String[] args) {
        User user = new User.Builder(1, "Manish Kumar")
                .email("manish80842@gmail.com")
                .phone("9065129628")
                .address("401, A Wing Sunshine Building no 27 chandivali")
                .build();

        System.out.println("User created: " + user.toString());
    }
}