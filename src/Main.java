import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        randMessages();
    }

    public static void randMessages() throws FileNotFoundException {

        File file = new File(".\\text");

        String[] listfiles = file.list();
        for (String files : listfiles) {

            File pathFiles = new File(".\\text\\" + files);

            Scanner jokeOfComp = new Scanner(new FileInputStream(pathFiles));
            ArrayList<String> jokeOfCompList = new ArrayList<String>();

            while (jokeOfComp.hasNextLine()) {
                jokeOfCompList.add(jokeOfComp.nextLine());
            }

            Random jokeOfCompRand = new Random();
            System.out.println("\nрандом фраза из файла " + files + "\n" +  jokeOfCompList.get(jokeOfCompRand.nextInt(jokeOfCompList.size())));

        }

//        FileWriter writer = new FileWriter("./text/output.txt", false);
//        writer.write(resString.trim());
//        writer.flush();







//            System.out.println(files);
//            System.out.println(pathFiles);
//        Scanner jokeOfComp = new Scanner(new FileInputStream("./text/1comp.txt"));
//        ArrayList<String> jokeOfCompList = new ArrayList<String>();
//
//        while (jokeOfComp.hasNextLine()) {
//            jokeOfCompList.add(jokeOfComp.nextLine());
//        }
//
//        Random jokeOfCompRand = new Random();
//        System.out.println("\nрандом фраза1: " + jokeOfCompList.get(jokeOfCompRand.nextInt(jokeOfCompList.size())));
//
//
//        Scanner aphorOfMerfi = new Scanner(new FileInputStream("./src/3merfi.txt"));
//        ArrayList<String> aphorOfMerfiList = new ArrayList<String>();
//
//        while (aphorOfMerfi.hasNextLine()) {
//            aphorOfMerfiList.add(aphorOfMerfi.nextLine());
//        }
//
//        Random aphorOfMerfiRand = new Random();
//        System.out.println("\nрандом фраза2: " + aphorOfMerfiList.get(aphorOfMerfiRand.nextInt(aphorOfMerfiList.size())));

    }
}


//        System.out.println("2");
//        int qqq = 0;
//            qqq += 1;
//            System.out.println("счетчик: " + qqq);

//            System.out.println("3");

//        System.out.println("длина списка: " + list1.size());
//        for (String qaz : list1) {
//            System.out.println(qaz);
//        }


//        List test1 = new List();
//            System.out.println(test.nextLine());
//            list123.add(test.nextLine());


//        while (test.hasNextLine()) {
//
//            System.out.println("3");
//
//            System.out.println(test.nextLine());
//
//            test1.add(test.nextLine());
//
//
//            System.out.println("4");
//
////            System.out.println(test.nextLine());
//
//            }


//        System.out.println("длина списка: " + test1.getSize());

//        for (String qaz : test1) {
//            System.out.println("4");
//            System.out.print(qaz);
//            System.out.println("5");

//        }

//            qqq += 1;
//        из данного цикла получают переменную размер для нашего будущего массива


//        int qqq = 0;
//        while (test.hasNextLine()) {
//            System.out.println(test.nextLine());
//            qqq += 1;
//        }
//
////        создаем массив для наших данных (предложения из файла)
//        String[] www = new String[qqq];
//        int i = 0;
//
//        System.out.println("1");
//        while (test.hasNextLine()) {
//            System.out.println("2");
//            System.out.println(i);
//            www[i] = test.nextLine();
//            System.out.println(test.nextLine());
//            i +=1;
//            System.out.println(i);
//
//        }


//        System.out.println("\n\nпеременная qqq: " + qqq);

//        System.out.println("1");
//            System.out.println("2-1");
//            System.out.println(qqq);

//            test.close();

//            System.out.println("\nразмер массива: " + fromcomp.length);
//            for (String qaz : fromcomp) {
////                System.out.println("4");
//                System.out.print(qaz + " ");
////                System.out.println("5");
//            }
//            String[] fromcomp = test.nextLine().split(" ");

//            System.out.println("3");

//        int qwe = 0;
//        while (test.hasNextLine()) {
//            qwe +=1;
//            System.out.println(qwe);
//        }

//        System.out.println(qwe);

//        System.out.println("3");
//
//
//        while (test.hasNextLine()) {
//
//            String[] fromcomp;
//
//
//
//            String qaz = test.nextLine();
//            System.out.println(qaz);
////            System.out.println("3");
//        }
//
//        System.out.println("4");
//    }
//}
//        while (test.hasNextLine()) {
//            System.out.println("3");
////            System.out.println(comp.hasNext());
////            System.out.println(test.hasNextLine());
//        }


//        comp.close();

//        String[] fromcomp = comp.nextLine().split(".");
//        String[] fromcomp = comp.nextLine().split(".");


//        for (String qaz : fromcomp) {
//            System.out.println("4");
//            System.out.print(qaz);
//            System.out.println("5");
//        }


//        проходит 3 раза
//        while (comp.hasNextLine()) {

//            System.out.println("3");

//            String[] fromcomp = comp.nextLine().split(".");
//
//            System.out.println("4");
//            System.out.print(fromcomp);
//            System.out.println("5");


//        }
//        return qaz;
