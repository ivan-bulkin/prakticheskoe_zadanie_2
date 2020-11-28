package prakticheskoe_zadanie_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {//просто пиши пока так и не думай
        System.out.println();
        System.out.println("Практическое задание по уроку № 2");
        System.out.println("Какое из практических заданий Вы хотите увидеть? Выберите:");
        System.out.println("1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;");
        System.out.println("2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;");
        System.out.println("3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;");
        System.out.println("4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;");
        System.out.println("5. Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);");
        System.out.println("6. Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место,");
        System.out.println("      в котором сумма левой и правой части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,");
        System.out.println("      граница показана символами ||, эти символы в массив не входя");
        System.out.println("7. Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),");
        System.out.println("      при этом метод должен сместить все элементы массива на n позиций. Для усложнения задачи нельзя пользоваться вспомогательными массивами.");
        System.out.println("Сделал Иван Булкин");
        Scanner in = new Scanner(System.in);
        System.out.print("Выбирайте смелее, Вас ни кто не обидит: ");
        int nomer_zadaniya = in.nextInt();
//1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        if (nomer_zadaniya == 1) {
            Zadat_tselochislennyy_massiv();
        }
//2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        if (nomer_zadaniya == 2) {
            Zadat_tselochislennyy_massiv_8();
        }
//3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        if (nomer_zadaniya == 3) {
            Zadat_massiv_proyti_tsiklom();
        }
//4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        if (nomer_zadaniya == 4) {
            System.out.println();
            System.out.println("Сейчас мы будем создавать квадратный двумерный целочисленный массив.");
            System.out.printf("Введите количество строк, оно будет равно количеству столбцов, но не более 10-ти: ");
            int kol_vo_strok_stolbtsov = (int) (in.nextInt());//Фиг его знает, как здесь сделать защиту от Дурака на тот случай, если пользователь вводит не целое число, а букву или какую-то другую хрень. Думаю, что Тимофей нам позже про это расскажет
            if (kol_vo_strok_stolbtsov < 1 || kol_vo_strok_stolbtsov > 10) {
                System.out.println("Вы ввели: " + kol_vo_strok_stolbtsov + ", а можно вводить только числа от 1 до 10-ти.");
                System.out.println("Попробуйте ещё разик, количество строк от 1 до 10");
            } else Sozdat_kvadratnyy_dvumernyy_tselochislennyy_massiv(kol_vo_strok_stolbtsov);
        }
//5. Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
        if (nomer_zadaniya == 5) {
            System.out.println();
            System.out.println("Сейчас мы создадим одномерный массив, заполним его случайными числами от 0 до 100 и затем найдём в нём минимальный и максимальный элементы.");
            System.out.printf("Вам надо ввести количество элементов массива, введите число не более 25-ти: ");
            int kol_vo_strok_strok = (int) (in.nextInt());//Фиг его знает, как здесь сделать защиту от Дурака на тот случай, если пользователь вводит не целое число, а букву или какую-то другую хрень. Думаю, что Тимофей нам позже про это расскажет
            if (kol_vo_strok_strok < 1 || kol_vo_strok_strok > 25) {
                System.out.println("Вы ввели: " + kol_vo_strok_strok + ", а можно вводить только числа от 1 до 25-ти.");
                System.out.println("Попробуйте ещё разик, количество строк от 1 до 25");
            } else Zadat_odnomernyy_massiv(kol_vo_strok_strok);
        }
//6. Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.
        if (nomer_zadaniya == 6) {
            System.out.println();
            System.out.println("Сейчас мы в массиве будем проверять равны или нет сумма левой и правой части массива.");
            System.out.printf("Нажмите 1 - у проверяемого массива левая и правая части равны, 2 - не равны: ");
            int lev_prav_ravno_ili_ne_ravno = (int) (in.nextInt());//Фиг его знает, как здесь сделать защиту от Дурака на тот случай, если пользователь вводит не целое число, а букву или какую-то другую хрень. Думаю, что Тимофей нам позже про это расскажет
            if (lev_prav_ravno_ili_ne_ravno < 1 || lev_prav_ravno_ili_ne_ravno > 2) {
                System.out.println("Вы ввели: " + lev_prav_ravno_ili_ne_ravno + ", а можно ввести только число 1 или 2.");
                System.out.println("Попробуйте ещё разик, введя 1 или 2");
            } else Levaya_i_pravaya_chast_massiva_ravny(lev_prav_ravno_ili_ne_ravno);
//            if (levo_pravo_ravno == true) {System.out.println("Метод вернул true");}
        }
//7. Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен сместить все элементы массива на n позиций. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
        if (nomer_zadaniya == 7) {
            System.out.println();
            System.out.println("Сейчас мы создадим одномерный массив, заполним его случайными числами от 0 до 100 и затем сместим все элементы массива на n позиций.");
            System.out.printf("Вам надо ввести количество элементов массива, введите число не более 25-ти: ");
            int kol_vo_strok_strok = (int) (in.nextInt());//Фиг его знает, как здесь сделать защиту от Дурака на тот случай, если пользователь вводит не целое число, а букву или какую-то другую хрень. Думаю, что Тимофей нам позже про это расскажет
            if (kol_vo_strok_strok == 1) {
                System.out.println("Вы ввели: " + kol_vo_strok_strok + ", нет смысла сдвигать элементы массива, если в массиве всего один элемент.");
                System.out.println("Попробуйте ещё разик, количество строк от 2 до 25");
                return;
            }
            if (kol_vo_strok_strok < 2 || kol_vo_strok_strok > 25) {
                System.out.println("Вы ввели: " + kol_vo_strok_strok + ", а можно вводить только числа от 1 до 25-ти.");
                System.out.println("Попробуйте ещё разик, количество строк от 2 до 25");
                return;
            }
            System.out.println("Теперь введите на сколько n элементов сместить все элементы массива, число от -100 до 100.");
            System.out.printf("Если число отрицательное, то сдвигаем элементы влево, если положительное, то сдвигаем вправо: ");
            int na_skolko_elementov_smestit = (int) (in.nextInt());//Фиг его знает, как здесь сделать защиту от Дурака на тот случай, если пользователь вводит не целое число, а букву или какую-то другую хрень. Думаю, что Тимофей нам позже про это расскажет
            if (na_skolko_elementov_smestit == 0) {
                System.out.println("Вы ввели: " + na_skolko_elementov_smestit + ", нет ни какого смысла сдвигать элементы массива на ноль элементов.");
                System.out.println("Попробуйте ещё разик, количество элементов массива, на которое будем сдвигать может быть от -100 до 100");
                return;
            }
            if (na_skolko_elementov_smestit < -100 || na_skolko_elementov_smestit > 100) {
                System.out.println("Вы ввели: " + na_skolko_elementov_smestit + ", а можно вводить только числа от 1 до 100.");
                System.out.println("Попробуйте ещё разик, количество элементов массива, на которое будем сдвигать может быть от -100 до 100");
                return;
            }
            Smestit_elementy_massiva(kol_vo_strok_strok, na_skolko_elementov_smestit);
        }
        if (nomer_zadaniya > 7 || nomer_zadaniya < 1) {
            System.out.println();
            System.out.println("Вы ввели: " + nomer_zadaniya + " - такого номера задания нет в списке.");
            System.out.println("Попробуйте ещё разик, указав номер задания от 1 до 7");
        }


        in.close();//Необходимо закрыть объект in
    }

    //1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
    private static void Zadat_tselochislennyy_massiv() {
        int[] massiv_int = new int[10];//создаём целочисленный массив
        massiv_int[0] = 1;
        massiv_int[1] = 1;
        massiv_int[2] = 0;
        massiv_int[3] = 0;
        massiv_int[4] = 1;
        massiv_int[5] = 0;
        massiv_int[6] = 1;
        massiv_int[7] = 1;
        massiv_int[8] = 0;
        massiv_int[9] = 0;
        System.out.println();
        System.out.println("Задан целочисленный массив, состоящий из элементов 0 и 1.");
        System.out.printf("[");
        for (int i = 0; i < massiv_int.length; i++) {
            System.out.printf(" " + massiv_int[i]);
        }
        System.out.println("]");
        System.out.println("Сейчас, с помощью цикла и условия мы заменим в массиве 0 на 1, а 1 на 0.");
        for (int i = 0; i < massiv_int.length; i++) {
            if (massiv_int[i] == 0) {
                massiv_int[i] = 1;
            } else if (massiv_int[i] == 1) {
                massiv_int[i] = 0;
            }
        }
        System.out.println("Вот, что у нас получилось:");
        System.out.printf("[");
        for (int i = 0; i < massiv_int.length; i++) {
            System.out.printf(" " + massiv_int[i]);
        }
        System.out.println("]");
        int[] massiv_int_2 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};//Можно и так задавать массив и сразу заполнять его значениями
        System.out.printf("Массив, сразу заполненный значениями [");//Эта мысль мне прищла в голову после внимательного прочтения задания № 2 и перечитывания задания № 1
        for (int i = 0; i < massiv_int_2.length; i++) {
            System.out.printf(" " + massiv_int_2[i]);
        }
        System.out.println("]");
    }

    //2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    private static void Zadat_tselochislennyy_massiv_8() {
        int[] massiv_int = new int[8];//создаём целочисленный массив размером 8
        int i1 = 0;
        for (int i = 0; i < massiv_int.length * 3; i = i + 3) {
            massiv_int[i1] = i;
            i1 = i1 + 1;
        }
        System.out.println();
        System.out.printf("Заполненный с помощью цикла массив размером 8: [");
        for (int i = 0; i < massiv_int.length; i++) {
            System.out.printf(" " + massiv_int[i]);
        }
        System.out.println("]");
    }


    //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    private static void Zadat_massiv_proyti_tsiklom() {
        int[] massiv_int = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};//Можно и так задавать массив и сразу заполнять его значениями
        System.out.println();
        System.out.printf("Исходный массив [");
        for (int i = 0; i < massiv_int.length; i++) {
            System.out.printf(" " + massiv_int[i]);
        }
        System.out.println("], сейчас мы пройдёмся по массиву циклом и все числа меньше 6-ти будут умножим на 2.");
        for (int i = 0; i < massiv_int.length; i++) {
            if (massiv_int[i] < 6) {
                massiv_int[i] = massiv_int[i] * 2;
            }
        }
        System.out.println("Вот, что у нас получилось:");
        System.out.printf("[");
        for (int i = 0; i < massiv_int.length; i++) {
            System.out.printf(" " + massiv_int[i]);
        }
        System.out.println("]");
    }


    //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
    private static void Sozdat_kvadratnyy_dvumernyy_tselochislennyy_massiv(int kol_vo_strok_stolbtsov) {
        System.out.println("Все элементы массива, размером " + kol_vo_strok_stolbtsov + "х" + kol_vo_strok_stolbtsov + " заполнены нулями:");
        int[][] massiv_int = new int[kol_vo_strok_stolbtsov][kol_vo_strok_stolbtsov];//При создании целочисленого массива все его элементы заполняются системой нулями или надо их в явном виде заполнить???
        for (int i = 0; i < massiv_int.length; i++) {
            for (int j = 0; j < massiv_int[i].length; j++) {
                massiv_int[i][j] = 0;
            }
        }
        for (int i = 0; i < massiv_int.length; i++) {
            System.out.printf("[");
            for (int j = 0; j < massiv_int[i].length; j++) {
                System.out.printf(" " + massiv_int[i][j]);
            }
            System.out.println(" ]");
        }
        System.out.println("Теперь диагональные элементы массива, размером " + kol_vo_strok_stolbtsov + "х" + kol_vo_strok_stolbtsov + " мы заполним единицами:");
        for (int i = 0; i < kol_vo_strok_stolbtsov; i++) {
            massiv_int[i][i] = 1;
        }
        for (int i = 0; i < massiv_int.length; i++) {
            System.out.printf("[");
            for (int j = 0; j < massiv_int[i].length; j++) {
                System.out.printf(" " + massiv_int[i][j]);
            }
            System.out.println(" ]");
        }
    }

    //5. Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
    private static void Zadat_odnomernyy_massiv(int kol_vo_strok_strok) throws InterruptedException {
        int[] massiv_int = new int[kol_vo_strok_strok];
        System.out.println("Одномерный массив, размером " + kol_vo_strok_strok + ", заполненный нулями:");
        System.out.printf("[");
        for (int i = 0; i < massiv_int.length; i++) {
            System.out.printf(" " + massiv_int[i]);
        }
        System.out.println(" ]");
        System.out.println("Заполняем массив случайными числами от 0 до 100:");
        for (int i = 0; i < massiv_int.length; i++) {
            massiv_int[i] = (int) (Math.random() * 100);
        }
        System.out.printf("[");
        for (int i = 0; i < massiv_int.length; i++) {
            System.out.printf(" " + massiv_int[i]);
        }
        System.out.println(" ]");
        System.out.println("Думаю .....");
        Thread.sleep(1000);//Задержка в 1000 миллисекунд
        int min_znachenie = 100;
        int max_znachenie = 0;
        for (int i = 0; i < massiv_int.length; i++) {
            if (massiv_int[i] > max_znachenie) {
                max_znachenie = massiv_int[i];
            }
            if (massiv_int[i] < min_znachenie) {
                min_znachenie = massiv_int[i];
            }
        }
        System.out.println("А вот и ответ: минимальный элемент: 0, максимальный элемент: " + kol_vo_strok_strok);
        System.out.println("А заодно мы вычислили минимальное значение из всех элементов массива: " + min_znachenie + " и максимальное значение: " + max_znachenie);
        System.out.println("И да, это всё было сделано без помощи интернета.");
    }

    //6. Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.
    //Не буду тут усложнять всё, сделаю в лоб
    public static boolean Levaya_i_pravaya_chast_massiva_ravny(int lev_prav_ravno_ili_ne_ravno) throws InterruptedException {
        int[] massiv_int = {2, 2, 2, 1, 2, 2, 10, 1};
        if (lev_prav_ravno_ili_ne_ravno == 1) {
        }
        if (lev_prav_ravno_ili_ne_ravno == 2) {
            massiv_int[7] = 100;//почему-то я не понял, как задать сразу все значения массива и вышел из положения таким образом
        }
        //то, что левая и правая часть элементов массива может быть равна может быть только один раз
        System.out.println();
        System.out.printf("Заполненный ручками массив размером 8: [");
        for (int i = 0; i < massiv_int.length; i++) {
            System.out.printf(" " + massiv_int[i]);
        }
        System.out.println(" ]");
        System.out.println("Ищем место, где левая и правая часть массива равны .....");
        Thread.sleep(500);//Задержка в 500 миллисекунд
        int levaya_chast = 0;
        int pravaya_chast = 0;
        boolean levo_pravo_ravno = false;
        int nomer_elementa_massiva = 0;
        for (int i = 0; i < massiv_int.length; i++) {
            levaya_chast += massiv_int[i];
            pravaya_chast = 0;
            for (int j = i + 1; j < massiv_int.length; j++) {
                pravaya_chast += massiv_int[j];
            }
//            System.out.println("levaya_chast " + levaya_chast + "   pravaya_chast " + pravaya_chast + "  " + i);
            if (levaya_chast == pravaya_chast) {
                levo_pravo_ravno = true;
                nomer_elementa_massiva = i;
                break;
            } else if (levaya_chast != pravaya_chast) {
            }
        }
        if (levo_pravo_ravno == true) {
            System.out.println();
            System.out.println("Ура! Есть такое место в массиве, где сумма левой и правой части массива равны,");
            System.out.println("место это мы отметим двумя палками || и выведем весь массив на экран");
            System.out.printf("Массив, где левая и правая части равны: [");
            for (int i = 0; i < massiv_int.length; i++) {
                System.out.printf(" " + massiv_int[i]);
                if (i == nomer_elementa_massiva) {
                    System.out.printf(" ||");
                }
            }
            System.out.println(" ]");
        } else {
            System.out.println();
            System.out.println("Жаль, но нет такого места в массиве, куда можно было бы засунуть две палки ||");
        }
        return levo_pravo_ravno;//Пока я не разобрался, как метод возвращает значение. В метод могу передавать значения, а из метода наружу нет
//        System.out.println("levaya_chast " + levaya_chast + " nomer_elementa_massiva " + nomer_elementa_massiva);
    }

    //7. Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен сместить все элементы массива на n позиций. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
    private static void Smestit_elementy_massiva(int kol_vo_strok_strok, int na_skolko_elementov_smestit) throws InterruptedException {
        int[] massiv_int = new int[kol_vo_strok_strok];
        System.out.println("Одномерный массив, размером " + kol_vo_strok_strok + ", заполненный нулями:");
        System.out.printf("[");
        for (int i = 0; i < massiv_int.length; i++) {
            System.out.printf(" " + massiv_int[i]);
        }
        System.out.println(" ]");
        System.out.println("Заполняем массив случайными числами от 0 до 100:");
        for (int i = 0; i < massiv_int.length; i++) {
            massiv_int[i] = (int) (Math.random() * 100);
        }
        System.out.printf("[");
        for (int i = 0; i < massiv_int.length; i++) {
            System.out.printf(" " + massiv_int[i]);
        }
        System.out.println(" ]");
        System.out.println("Смещаю на " + na_skolko_elementov_smestit + " шт. позиций .....");
        Thread.sleep(1000);//Задержка в 1000 миллисекунд
        int element_massiva;
        if (na_skolko_elementov_smestit < 0) {
            na_skolko_elementov_smestit = -1 * na_skolko_elementov_smestit;
            for (int i = 0; i < na_skolko_elementov_smestit; i++) {
                element_massiva = massiv_int[0];
                for (int j = 0; j < massiv_int.length - 1; j++) {
                    massiv_int[j] = massiv_int[j + 1];
                }
                massiv_int[massiv_int.length - 1] = element_massiva;
            }
        }
        if (na_skolko_elementov_smestit > 0) {
            for (int i = 0; i < na_skolko_elementov_smestit; i++) {
                element_massiva = massiv_int[massiv_int.length - 1];
                for (int j = massiv_int.length - 2; j > -1; j--) {
                    massiv_int[j+1] = massiv_int[j];
                }
                massiv_int[0] = element_massiva;
            }
        }
        System.out.println("Вот, что получилось:");
        System.out.printf("[");
        for (int i = 0; i < massiv_int.length; i++) {
            System.out.printf(" " + massiv_int[i]);
        }
        System.out.println(" ]");
    }
}


