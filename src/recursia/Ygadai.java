package recursia;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by pc on 23.02.2016.
 */
public class Ygadai {
    public static void mm (int[]vb){
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int x=0;
        int y= vb.length;
        if(vb.length==7){
         x = rand.nextInt(100);
            System.out.println("Вводите числа");}
        else if(vb.length==5){
            x = rand.nextInt(60);
            System.out.println("Вводите числа");}
        else if(vb.length==4){
            x = rand.nextInt(30);
            System.out.println("Вводите числа");}
        int k  =0;
        for(int i =0 ;i<vb.length;i++){
          // int  c[]= new int[vb.length];
            vb[i]= scanner.nextInt();
            if(vb[i]==x){
                System.out.println("Поздравляю ты угaдал(а) с "+ k+"попытки");
                break;}
            else if(vb[i]>x){
                System.out.println("Не угaдал, меньше. Осталось "+(y-1)+"попыток(и)");
            }else if(vb[i]<x){
                System.out.println("НЕ угадал, больше. Осталось "+(y-1)+"попыток(и)");

            }
            if(y == 1)

                System.out.println("Мне жаль ты проиграл это было число: "+x);

            k++;
        y--;}
    return ;}
    public static void main(String[] args) {
      //  Random rand = new Random();

        System.out.println("Давай поиграем я загадаю число а ты попробуй угадать.");
        System.out.println("Выбери уровень сложно:" +'\n'+ "1.легкий. Числа от 0 до 30(попыток: 4)"+'\n'+ "2.средний. Числа от 0 до 60(попыток: 5)"+'\n'+ "3.сложный. Числа от 0 до 100(попыток 7)");
       // System.out.println(x);
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        if(w==3){
            int c []= new int[7];
          mm(c);
        }else if(w==2){
            int c []= new int[5];
            mm(c);
        }else if(w==1){
            int c []= new int[4];
            mm(c);
        }
         /*   int x= rand.nextInt(100);
        int k  =0;
        for(int i =0 ;i<7;i++){
            int c[]=new int[7];
            c[i]= scanner.nextInt();
            if(c[i]==x){
                System.out.println("Поздравляю ты угaдал(а) с "+ k+"попытки");
                break;
            }else if(c[i]>x){
                System.out.println("Не угaдал, меньше");
            }else if(c[i]<x){
                System.out.println("НЕ угадал, больше");

            }
            else
                System.out.println("Мне жаль ты проиграл это было число: "+x);

   k++;
        }}
        if(w==2){
            int x= rand.nextInt(60);
            int k  =0;
            for(int i =0 ;i<5;i++){
                int c[]=new int[5];
                c[i]= scanner.nextInt();
                if(c[i]==x){
                    System.out.println("Поздравляю ты угaдал(а) с "+ k+"попытки");
                    break;
                }else if(c[i]>x){
                    System.out.println("Не угaдал, меньше");
                }else if(c[i]<x){
                    System.out.println("НЕ угадал, больше");

                }
                else
                    System.out.println("Мне жаль ты проиграл это было число: "+x);

                k++;
            }}*/



    }
    }
