import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        File newDir = new File("Games");
        if (newDir.mkdir())
            System.out.println("Каталог создан");
        else
            System.out.println("Что то пошло не так");

        File file1 = new File("Games", "srs");
        if (file1.mkdir())
            System.out.println("Каталог создан");
        else
            System.out.println("Что то пошло не так");

        File file2 = new File("Games", "res");
        if (file2.mkdir())
            System.out.println("Каталог создан");
        else
            System.out.println("Что то пошло не так");

        File file3 = new File("Games", "savegames");
        if (file3.mkdir())
            System.out.println("Каталог создан");
        else
            System.out.println("Что то пошло не так");

        File file4 = new File("Games", "temp");
        if (file4.mkdir())
            System.out.println("Каталог создан");
        else
            System.out.println("Что то пошло не так");

        File file5 = new File("Games/srs// main");
        if (file5.mkdir())
            System.out.println("Каталог создан");
        else
            System.out.println("Что то пошло не так");

        File file6 = new File("Games/srs//test");
        if (file6.mkdir())
            System.out.println("Каталог создан");
        else
            System.out.println("Что то пошло не так");

        File myfile = new File("Games/main//Main.java");
        try {
            if (myfile.createNewFile())
                System.out.println("Файл был создан");
        } catch (IOException ex) {
            System.out.println("Исключение:");
            System.out.println(ex.getMessage());

        }
        File myfile1 = new File("Games/main//Utils.java");
        try {
            if (myfile1.createNewFile())
                System.out.println("Файл был создан");
        } catch (IOException ex) {
            System.out.println("Исключение:");
            System.out.println(ex.getMessage());

        }

        File file7 = new File("Games/res//drawables");

        if (file7.mkdir())
            System.out.println("Каталог создан");
        else
            System.out.println("Что то пошло не так");

        File file8 = new File("Games/res//vectors");

        if (file8.mkdir())
            System.out.println("Каталог создан");
        else
            System.out.println("Что то пошло не так");

        File file9= new File("Games/res//icons");
        if (file9.mkdir())
            System.out.println("Каталог создан");
        else
            System.out.println("Что то пошло не так");

        File myfile2 = new File("Games/temp//temp.txt");
        try {
            if (myfile2.createNewFile())
                System.out.println("Файл был создан");
        } catch (IOException ex) {
            System.out.println("Исключение:");
            System.out.println(ex.getMessage());

        }


    }
}