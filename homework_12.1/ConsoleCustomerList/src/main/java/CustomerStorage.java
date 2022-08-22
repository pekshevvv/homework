import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class CustomerStorage {
    private final Map<String, Customer> storage;

    public CustomerStorage() {
        storage = new HashMap<>();
    }

    public void addCustomer(String data) {
        final int INDEX_NAME = 0;
        final int INDEX_SURNAME = 1;
        final int INDEX_EMAIL = 2;
        final int INDEX_PHONE = 3;

       String[] components = data.split("\\s+");
        if (components.length != 4){
            throw new IllegalArgumentException("неверно");
        }

        String regex1 = "[+][7][0-9]{10}";
        if (!components[INDEX_PHONE].matches(regex1)){
            throw new IllegalArgumentException("неверно телефон");
        }

        String regex2 = "[a-zA-Z0-9]{3,15}[.][a-zA-Z0-9]{3,15}@[a-zA-Z0-9]{3,15}([.][a-zA-Z]{2,5}){1,2}";
        if (!components[INDEX_EMAIL].matches(regex2)){
            throw new IllegalArgumentException("неверно почта");
        }

        String name = components[INDEX_NAME] + " " + components[INDEX_SURNAME];
        storage.put(name, new Customer(name, components[INDEX_PHONE], components[INDEX_EMAIL]));
    }

    public void listCustomers() {
        storage.values().forEach(System.out::println);
    }

    public void removeCustomer(String name) {
        storage.remove(name);
    }

    public Customer getCustomer(String name) {
        return storage.get(name);
    }

    public int getCount() {
        return storage.size();
    }
}