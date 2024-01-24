package Anotation.Util;

import Anotation.NotBlank;

public class Validation {
    public  static void validationReflection(Object object){
        Class aClass = object.getClass();
        java.lang.reflect.Field[] fields = aClass.getDeclaredFields();

        for(var field : fields){
            field.setAccessible(true);

            if (field.getAnnotation(NotBlank.class) != null){
                try {
                    String value = (String) field.get(object);

                    if (value == null || value.isBlank()){
                        System.out.println("Field " + field.getName() + " is blank");
                    }
                }catch (IllegalAccessException exception){
                    System.out.println("Tidak bisa mengakses field " + field.getName());
                }
            }
        }
    }
}
