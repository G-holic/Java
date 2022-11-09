package cn.itcast.review;

import org.junit.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestObjectOutputStream {
    @Test
    public void test() {
        Student student = new Student("张三", new Teacher());
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("stu.dat"));) {
            oos.writeObject(student);
        } catch (IOException e) {
        }

    }
}
