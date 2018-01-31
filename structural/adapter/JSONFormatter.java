package structural.adapter;

import structural.adapter.entity.User;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class JSONFormatter implements Formatter {

    private User user;

    public JSONFormatter() {

    }

    @Override
    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String format() {
        return String.format("[\n" +
                        " {\n" +
                        "  \"id\" : \"%s\", \n" +
                        "  \"firstName\" : \"%s\", \n" +
                        "  \"lastName\" : \"%s\", \n" +
                        "  \"password\" : \"%s\", \n" +
                        "  \"email\" : \"%s\" \n" +
                        " }\n" +
                        "]\n",
                this.user.getId(),
                this.user.getFirstName(),
                this.user.getLastName(),
                this.user.getPassword(),
                this.user.getEmail());
    }

    public static User deserialize(String format) {
        Map<String, String> userInfo = new HashMap<>();

        String information = format.substring(format.indexOf("\""), format.lastIndexOf("\""));

        String[] tokens = information.split(",\\s+\n");

        Arrays.stream(tokens)
                .forEach((x) -> {
                    String[] items = x.split("\\s:\\s");
                    items[0] = items[0].replace("\"", "");
                    items[1] = items[1].replace("\"", "");
                    userInfo.put(items[0].trim(), items[1].trim());
                });

        Class<User> uClass = User.class;
        User user = null;

        try {
            user = uClass.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }


        Field[] declaredFields = uClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            for (String key : userInfo.keySet()) {
                if (declaredField.getName().contains(key)) {
                    try {
                        declaredField.set(user, userInfo.get(key));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                    break;
                }
            }
        }

        return user;
    }
}
