package structural.adapter;

import structural.adapter.entity.User;

public class XMLFormatter implements Formatter, JsonAdapter {

    private User user;

    public XMLFormatter() {
    }

    @Override
    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String format() {
        return String.format(
                "<users>\n" +
                        "\t<user>\n"
                        + "\t <id>%s</id>\n"
                        + "\t <firstName>%s</firstName>\n"
                        + "\t <lastName>%s</lastName>\n"
                        + "\t <password>%s</password>\n"
                        + "\t <email>%s</email>\n" +
                        "\t</user>\n"
                        + "</users>\n",
                this.user.getId(),
                this.user.getFirstName(),
                this.user.getLastName(),
                this.user.getPassword(),
                this.user.getEmail());
    }

    @Override
    public String toJson() {
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
}
