package utils;

import java.lang.reflect.Field;

public class ObjectPrintUtil {

    public static final void printObject(Object object) {
        StringBuilder result = new StringBuilder();
        String newLine = System.getProperty("line.separator");
        result.append(object.getClass().getName());
        result.append(" {");
        result.append(newLine);

        Field[] fields = object.getClass().getDeclaredFields();

        for (Field field : fields) {
            field.setAccessible(true);
            result.append("  ");
            try {
                result.append(field.getName());
                result.append(": ");
                //requires access to private field:
                result.append(field.get(object));
            } catch (IllegalAccessException ex) {
                System.out.println(ex);
            }
            result.append(newLine);
        }
        result.append("}");
        System.out.println(result.toString());

    }
}
