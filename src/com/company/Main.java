package com.company;

public class Main {

    public static int[] array = {0, 5, 3, 1, 2, 7};

    public static void main(String[] args) {

        heapsort();
        print();


    }


    public static void heapsort(){

        int l=array.length;
        int _temp;
        heapify();

      while (l>1){

          _temp=array[1];
          array[1]=array[l-1];
          array[l-1]=_temp;

          versickern(1,l);
          l--;

      }




    }

    public static void heapify() {

        int index = array.length / 2;
        int l=array.length;
        for (; index > 0; index--) {

            versickern(index,l);
        }

    }

    public static int versickern(int index,int l) {

        int erg;

        erg = checkChildren(index,l);
        //System.out.println(erg);

        if (erg != 0) {

            versickern(erg,l);
        } else {
            return 0;
        }

        return 0;
    }

    public static int checkChildren(int index,int l) {

        int a;
        if (2 * index > l-1) {
            return 0;
        } else if (2 * index == l-1) {

            if (array[index] < array[2 * index]) {
                a = array[2 * index];
                array[2 * index] = array[index];
                array[index] = a;
                return 2 * index;
            }

        } else {
            if (array[2 * index + 1] > array[2 * index] && array[index] < array[index * 2 + 1]) {


                a = array[2 * index+1];
                array[2 * index+1] = array[index];
                array[index] = a;

                return 2 * index;

            } else if (array[2 * index] >= array[index]) {

                a = array[2 * index];
                array[2 * index] = array[index];
                array[index] = a;
                return 2 * index;

            }
        }
        return 0;
    }


    public static void print() {

        for (int i = 1; i < 6; i++) {

            System.out.print(array[i]);

        }

    }


}
