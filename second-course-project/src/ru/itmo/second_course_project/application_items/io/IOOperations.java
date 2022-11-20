package ru.itmo.second_course_project.application_items.io;

import java.io.*;

public class IOOperations<T> {

    private File file;

    public IOOperations() {setFile();}

    private void setFile() {
        file = new File("second-course-project/src/ru/itmo/second_course_project/game_progress_file.txt");
    }

    public T readFromFile() throws FileNotFoundException{
        Object result = null;

        try(FileInputStream fileInput = new FileInputStream(file);
            ObjectInputStream objectInput = new ObjectInputStream(fileInput)
        ) {
            result = objectInput.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return (T) result;
    }

    public void writeToFile(T object) {
        System.out.println(file.getAbsolutePath());
        try (FileOutputStream fileOutput = new FileOutputStream(file);
             ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput)
        ) {
            objectOutput.writeObject(object);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
