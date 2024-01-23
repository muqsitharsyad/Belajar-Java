package Anotation.Reflection;

import Anotation.Util.Validation;

public class ReflectionApp {
    public static void main(String[] args) {
        CreateUserRequest request = new CreateUserRequest();
        request.setUsername("Kinmin");

        Validation.validationReflection(request);
    }
}
