package l2_2;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {

            public static void main(String[] args) {

                String[][] Example1 = new String[][]{
                        {"56", "4", "2", "10"},
                        {"56", "4", "2", "10"},
                        {"56", "4", "2", "10"},
                        {"12", "22", "32", "44"}

                };
                String[][] Example2 = {
                        {"123", "22", "32", "44"},
                        {"56", "4", "2"},
                        {"56", "4", "2", "10"},
                        {"56", "4", "2", "10"}
                };
                String[][] Example3 = {
                        {"12", "22", "32", "44"},
                        {"56", "4", "2", "3"},
                        {"6", "8", "2", "11"},
                        {"123", "10", "2", "word"}
                };

                try {
                try {
                    System.out.println( "Сумма переданного массива: "+chekArr(Example2));// можно выбрать один из трех примеров массивов

                } catch (MyArraySizeExeption e) {
                    System.out.println("переданный массив оказался не верной длинны" /* e.getNumber()*/);
                    e.printStackTrace();
                }
                catch (MyArrayDataExeption e) {
                    System.out.println("Переданный массив содержит элемент не верного формата" /*+e.getNumber()*/);
                    e.printStackTrace();
                }

                } finally {
                    System.out.println("Если на экране не отобразился результат вычисления, это не ошибка в программе, просто Вам следует перепроверить содержание входных данных");

                }
            }

    public static int chekArr (String [][] MyArray) throws MyArraySizeExeption, MyArrayDataExeption {

        for (int i=0; i<(MyArray.length); i++) {
            if (MyArray[i].length !=4) {
                throw new MyArraySizeExeption("Массив не верной длинны");}

            }


        int arrSum=0;
        for (int i=0; i<MyArray.length; i++) {
            for (int n=0; n<MyArray[i].length; n++) {
                try {
                    arrSum=arrSum+(Integer.parseInt(MyArray[i][n]));
                    //if(Integer.parseInt(MyArray[i][n])==123)
                }
                    catch (NumberFormatException e)
                    {throw new MyArrayDataExeption("Элемент массива не верного формата в ячейке с индексом "+i+"  "+n );
                    }

            }
        }
        return arrSum;
        }






        }



