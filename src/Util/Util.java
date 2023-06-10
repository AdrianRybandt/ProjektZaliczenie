package Util;

public class Util {
    public static boolean implementsInterface(Object object, Class interf)
    {
        return interf.isInstance(object);
    }
}
