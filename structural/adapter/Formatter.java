package structural.adapter;

import structural.adapter.entity.User;

public interface Formatter {

    String format();

    void setUser(User user);
}
