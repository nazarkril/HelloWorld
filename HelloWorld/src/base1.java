import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class base1 {
    private static float percentage(float total, float current) {
        return (current / total);
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Type in a first word: ");
        String firstWord = myObj.nextLine();
        System.out.print("Type in a first word: ");
        String secondWord = myObj.nextLine();
        System.out.print("Type in a first word: ");
        String thirdWord = myObj.nextLine();
        String arrayAll[] = {firstWord, secondWord, thirdWord};
        float counterOfUsedWords = 0;
        float index = 0;
        float totalSize = firstWord.length() + secondWord.length() + thirdWord.length();
        for (int i = 0; i < arrayAll.length; i++) {
            float currentWorldSize = arrayAll[i].length();
            System.out.print(arrayAll[i]);
            System.out.print(' ');
//            print index
            if (i == 0) {
                System.out.print(0.0);
            } else {
                System.out.print(percentage(totalSize, index));
            }
//            print percentage of used words
            System.out.print(' ');
            counterOfUsedWords += percentage(totalSize, currentWorldSize);
            System.out.print(counterOfUsedWords);
//            print percentage of currentWorldSize
            index += currentWorldSize;
            System.out.print(' ');
            System.out.println(percentage(totalSize, currentWorldSize));
        }
    }
}


//    public static List<String> inputWords() {
//        Scanner myObj = new Scanner(System.in);
//        List<String> listWords = new ArrayList<String>();
//        String newWord;
//        System.out.println("how many words are you going to type? Type a number:  ");
//        int howManyWords = myObj.nextInt();
//        for (int i = 0; howManyWords > i; i++) {
//
//            System.out.println("Type a word:");
//            newWord = myObj.nextLine();
//            listWords.add(newWord);
//        }
//        newWord = myObj.next();
//        String temp = "";
//        while (!((temp = myObj.next()).equals("stop"))) {
//            listWords.add(temp);
//        }
//        while (true) {
//            System.out.println("Type a word:");
//            newWord = myObj.next();
//            listWords.add(newWord);
//            String input = myObj.nextLine();
//            if (input.endsWith("")) {
//                break;
//            }
//        }
//        System.out.println("End of words");
//        return listWords;
//    }

//        public
//        int counterOfArrayAll = 0;
//        List<String> arrayAll = inputWords();
//        long totalSize = arrayAll.size();
//        for (int i = 0; i < arrayAll.size(); i++) {
//            long value = arrayAll.get(i).length();
//            System.out.print(arrayAll.get(i));
//            System.out.print(' ');
//            System.out.print(counterOfArrayAll / totalSize);
//            counterOfArrayAll += arrayAll.get(i).length();
//            System.out.print(' ');
//            System.out.print(counterOfArrayAll / totalSize);
//            System.out.print(' ');
//            System.out.println(arrayAll.get(i).length() / totalSize);
//        }
//    }
//}
//
//
