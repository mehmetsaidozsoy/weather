import java.util.Scanner;

public class weather {

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Hava sıcaklığını girin  :");
        byte heat=inp.nextByte();
        if (heat<5){
            System.out.print("Kayak yapabilirsiniz.");

        }else if(heat>5&& heat<10){
            System.out.println("Sinemaya gidebilirsiniz.");

        }else if(heat>10&&heat<=15){
            System.out.println("Sinemaya gidebilir ya da piknik yapabilirsiniz.");
        }else if(heat>15&&heat<=25){
            System.out.println("Pikniğe gidebilirsiniz.");
        }else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }



    }
}