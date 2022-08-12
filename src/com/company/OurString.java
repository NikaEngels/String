package com.company;

public class OurString {

    private char[] str;


    private int len;


    public OurString() {
        len = 0;
        str = new char[len];


    }

    //Конструктор копирования
    public OurString(OurString зук) {
        this.str = зук.str;

        this.len = str.length;
    }


    public OurString(char[] string) {
        this.str = string;
        len = string.length;
    }

    public static OurString make(char[] string) {
        return new OurString(string);
    }

    public OurString(String string) {

        str = string.toCharArray();
        len = str.length;


    }


    public int indexOf(int ch) {
        for (int i = 0; i < len; i++) {
            if (str[i] == ch) {
                return i;
            }
        }
        return -1;
    }

    //Символ под индексом (экзепшен АутОфИндекс если нет)
    public char charAt(int index) {
       /* Обработка исключения, ниже вызов исключения
       char[] symb = this.str;

       return symb[index];

       try{
           if (index > len)
       }
       catch(ArrayIndexOutOfBoundsException e){
           System.out.println("Индекс не существует");
       }
    }
*/
        if (index > this.str.length) {
            throw new ArrayIndexOutOfBoundsException("Индекс не существует");
        }
        return this.str[index];
    }

    //Возвращает подстроку, начиная с индекса стартИНдекс длинной лен (аутОфИндекс если вышли за пределы массива)
    public OurString subString(int startIndex, int len) {

        if (startIndex + len > this.str.length) {
            throw new ArrayIndexOutOfBoundsException("Выход за пределы массива");
        }

        char[] mas = new char[startIndex + len];
        for (int i = 0; i < mas.length; i++) {
            int count = startIndex;
            mas[i] = this.str[count];
            count += 1;
        }
        return new OurString(mas);
    }

    //Возвращает сабстрик начиная с нуля длинной лен (экщепшен)
    public OurString subString(int len) {

        if (len > this.str.length) {
            throw new ArrayIndexOutOfBoundsException("Выход за пределы массива");
        }

        char[] mas = new char[len + 1];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = this.str[i];

        }
        return new OurString(mas);
    }


    //Заменяет подстроку в текущей строке
    public OurString replace(OurString currentStr, OurString endStr) {

        return null;
    }

    public OurString conteins(OurString str) {
        String stroke = String.valueOf(str);
        for (int i = 0; i < str.len; i++) {
            for (int j = 0; j < str.len; j++) {
                if (this.str[i] == stroke.charAt(j)) {
                    
                }

            }
        }
    }



    public int getLength () {
        int sum = 0;
        for (int i = 0; i < str.length; i++) {
            sum += 1;
        }
        return len;
    }

    public OurString trim () {
        return null;
    }

    //Rezhet stroku po stroke i vozvrashaet massiv (simvol virezaet)
    public OurString[] split (OurString str,char symb){
        return null;
    }


    //contatination string with another string
    public OurString concat (OurString str){

        char[] sum = new char[str.len + this.str.length];
        int count = 0;
        for (int i = 0; i < str.len; i++) {
            sum[i] = str.charAt(i);
            count += 1;
        }
        for (int j = 0; j < this.str.length; j++) {
            sum[count] = this.str[j];
            count += 1;
        }

        return new OurString(sum);
    }

    public int parseToInt () {
        String string = String.valueOf(this.str);

        return -1;
    }

    public OurString reverse () {
        char[] count = new char[str.length];
        int j = str.length - 1;
        for (int i = 0; i < str.length; i++) {
            count[i] = str[j];
            j--;
        }

        return new OurString(count);
    }

    @Override
    public String toString () {
        return String.valueOf(this.str);
    }

    @Override
    public int hashCode() {
        return System.identityHashCode(this.str);
    }

    @Override
    public boolean equals (Object another){
        String a = String.valueOf(another);
        String b = String.valueOf(this.str);
        return (a.equals(b));
    }
}


