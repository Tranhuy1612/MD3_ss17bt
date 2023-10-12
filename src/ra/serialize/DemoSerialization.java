package ra.serialize;

import ra.serialize.model.Student;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class DemoSerialization {
    public static void main(String[] args) throws IOException {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Nam", 18, true));
        students.add(new Student(2, "Thảo", 18, false));

        File file = new File("student.txt");
        if(file.createNewFile()){
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            for (Student student:students) {
                objectOutputStream.writeObject(student);
            }
        }else {
            System.out.println("");
        }
    }
}
