package testcase;

import org.testng.annotations.Test;

import java.io.*;
import java.net.URL;
import java.util.Properties;

public class ReadingDataFromPropertyFile {
    @Test
    public void test() {
        File file = null;

        String fileName = "Dataconfig.txt";
        ClassLoader classLoader = getClass().getClassLoader();

        URL resource = classLoader.getResource(fileName);
        if (resource == null) {
            throw new IllegalArgumentException("file is not found!");
        } else {
            file = new File(resource.getFile());
        }

        if (file == null) return;

        try (FileReader reader = new FileReader(file);
             BufferedReader br = new BufferedReader(reader)) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testData() throws FileNotFoundException, IOException {
        File file = null;

        String fileName = "Data.properties";
        ClassLoader classLoader = getClass().getClassLoader();

        URL resource = classLoader.getResource(fileName);
        if (resource == null) {
            throw new IllegalArgumentException("file is not found!");
        } else {
            file = new File(resource.getFile());
        }

        if (file == null) return;

        try {
            InputStream input = new FileInputStream(file);
            Properties prop = new Properties();
            prop.load(input);
            System.out.println(prop.getProperty("Browser"));


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();


        }
    }
}
