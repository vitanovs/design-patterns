package structural.adapter;

import structural.adapter.entity.User;

public class AdapterDesignPatter {
    public static void main(String[] args) {
        User user = new User();
        user.setFirstName("Stoyan");
        user.setLastName("Vitanov");
        user.setEmail("stoyan@vitanov.com");
        user.setPassword("1234");

        JSONFormatter jsonFormatter = new JSONFormatter();
        JsonAdapter jsonAdapter = new XMLFormatter();

        jsonFormatter.setUser(user);
        jsonAdapter.setUser(user);

        String xml = jsonAdapter.format();
        String json = jsonFormatter.format();

        System.out.println(json);
        System.out.println(xml);

        User deserializeUser = JSONFormatter.deserialize(jsonAdapter.toJson());
        System.out.println();

    }
}
