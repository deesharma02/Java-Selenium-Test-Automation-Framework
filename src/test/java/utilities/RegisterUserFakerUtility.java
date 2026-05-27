package utilities;

import com.github.javafaker.Faker;
import pojo.RegisterUser;

public class RegisterUserFakerUtility {

    public static RegisterUser getFakerRegisterUser() {
        Faker faker = new Faker();
        return new RegisterUser(faker.internet().emailAddress(),
                faker.name().firstName(),
                faker.name().lastName(),
                faker.internet().password(8, 12, true, true, true));
    }
}
