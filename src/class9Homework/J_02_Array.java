package class9Homework;

public class J_02_Array {
    public static void main(String[] args) {
        /*
        Create an array of names and store all names of your group. Then print your name from that array.
        (use 2 different ways of creating an array).
         */
        // Method 1:
        System.out.println("Method 1:");
        String[] names = new String[11];
        names[0] = "Abdul Nasir";
        names[1] = "Adem";
        names[2] = "Abeera";
        names[3] = "Asli";
        names[4] = "Daria";
        names[5] = "Dena";
        names[6] = "Hiral";
        names[7] = "Natalia";
        names[8] = "Nelson";
        names[9] = "Tarik";
        names[10] = "Slava";
        for (int i = 0; i < names.length; i++) {
            if (i == 6) {
                System.out.println(i+" Hiral");
            }
        }
        System.out.println("Method 2:");
        String [] name={"Abdul Nasir","Abeera","Asli","Daria","Dena","Hiral","Natalia","Nelson","Tarik","Slava"};
        System.out.println(names[6]);
    }
}
