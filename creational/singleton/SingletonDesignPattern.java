package creational.singleton;

public class SingletonDesignPattern {
    public static void main(String[] args){

        User initialInstance = User.getInstance();
        initialInstance.setName("Stoyan");
        initialInstance.setHomeTown("Plovdiv");
        initialInstance.setCurrentTown("Sofia");
        initialInstance.setEmail("stoyan@mail.co.uk");
        initialInstance.setPassword("1234");


        User newInstance = User.getInstance();
        System.out.println(newInstance);

    }
}
