package ru.itmo.second_course_project.application_items.io;

import java.io.*;

public class IOOperations<T> {

    private File file;

    public IOOperations() {setFile();}

    private void setFile() {
        file = new File("game_progress_file.txt");
    }

    public T readFromFile() throws FileNotFoundException{
        Object result = null;

        try(FileInputStream fileInput = new FileInputStream(file);
            ObjectInputStream objectInput = new ObjectInputStream(fileInput)
        ) {
            result = objectInput.readObject();
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return (T) result;
    }

    public void writeToFile(T object) {
        try (FileOutputStream fileOutput = new FileOutputStream(file);
             ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput)
        ) {
            objectOutput.writeObject(object);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
