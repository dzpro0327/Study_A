class Tv {
    boolean power;
    int channel;

    void power() {
        power = !power;  // on/off를 말한다..
    }

    void channelUp() {
        ++channel;
    }

    void channelDown() {
        --channel;
    }
}

class SmartTv extends Tv {
    boolean caption;  // 캡션기능 on/off

    void displayCaption(String text) {
        if (caption) {
            System.out.println(text);
        }
    }
}

public class Ex7_1 {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        smartTv.channel = 10;
        smartTv.channelUp();
        System.out.println(smartTv.channel);

        smartTv.displayCaption("Hello, World");   // 캡션기능이 off 면 출력이 되지않는다.
        smartTv.caption = true; // 캡션기능 on
        smartTv.displayCaption("Hello!!!!!!, World");
    }
}
