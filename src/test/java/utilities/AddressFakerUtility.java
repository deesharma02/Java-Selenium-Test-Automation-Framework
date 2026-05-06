package utilities;

import com.github.javafaker.Faker;
import pojo.Address;

public class AddressFakerUtility {
    public static void main(String[] args) {
        getFakerAddress();
    }

    public static Address getFakerAddress() {
        Faker faker = new Faker();
        Address address = new Address(faker.company().name(),
                faker.address().buildingNumber(),
                faker.address().streetAddress(),
                faker.address().city(),
                faker.numerify("#####"),
                faker.phoneNumber().phoneNumber(),
                faker.phoneNumber().phoneNumber(),
                faker.lorem().sentence(10),
                faker.address().secondaryAddress());

        return address;
    }
}
