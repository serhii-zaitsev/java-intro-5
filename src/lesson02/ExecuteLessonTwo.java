package lesson02;

public class ExecuteLessonTwo {
    public static String eachNth(String str, int n){
        int count = 0;
        char[] mas = str.toCharArray();
        String res = "" + mas[0];
        for(int x = 1; x < mas.length - n; x++)
            {
                if(count < mas.length - n)
                    {
                        res = res + mas[count = count + n];
                    }
            }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(eachNth("Maspild",2));
        System.out.println(eachNth("MaspildA",2));
        System.out.println(eachNth("MaspildAa",2));
        System.out.println(eachNth("Abcdefghl",3));
        System.out.println(eachNth("Abcdefghl",4));
    }
}
