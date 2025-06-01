package com.cc;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
public class Dog {
    public String name;
    private static String color;
    int age=23;
    public int getAge() {
        return age;
    }
    private Dog(){

    }
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> aClass = Class.forName("com.cc.Dog");
        Field name1 = aClass.getField("name");
        Field[] declaredFields = aClass.getDeclaredFields();

        Constructor<?> constructor = aClass.getDeclaredConstructor();
        Dog dog= (Dog) constructor.newInstance();
        declaredFields[1].set(dog,"assas");
        System.out.println(declaredFields[1].get(dog));

        System.out.println(dog.name);
    }
}