package lesson04.part02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка,
 * и выведи оставшиеся элементы в обратном порядке.
 *
 * Требования:
 * 1.	Объяви переменную типа ArrayList<String> (список строк) и сразу проинициализируй ee.
 * 2.	Считай 5 строк с клавиатуры и добавь их в список.
 * 3.	Удали третий элемент списка.
 * 4.	Выведи элементы на экран, каждый с новой строки.
 * 5.	Порядок вывода должен быть обратный.
 */

public class Task06 {
  public static void main(String[] args) throws Exception {
    ArrayList<String> arrS = new ArrayList<String>();
    Scanner scn = new Scanner(System.in);
    for (int i=0;i<5;i++){
      arrS.add(scn.next());
    }
    arrS.remove(2);
    for (int j=3;j>=0;j--){
      System.out.println(arrS.get(j));
    }
  }
}
