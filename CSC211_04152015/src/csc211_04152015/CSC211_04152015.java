package csc211_04152015;

/**
 * Class Exercise
 *
 * @topic
 * @name
 * @datek 04152015
 * @author Chohee Kim
 */
public class CSC211_04152015 {

    public static void main(String[] args) {

    }

}

class Remote {

    int channel = 1;
    int volume = 1;

    int getChannel() {
        return channel;
    }

    int getVolume() {
        return volume;
    }
    
    void setChannelCtr(int num) {
        if(num >= 0 || num <= 100) {
           channel = num; 
        } 
    }

    void setChannelUp() {
        channel++;
        if(channel == 100) {
            channel = 0;
        }
    }

    void setChannelDown() {
        channel--;
        if(channel == 0) {
            channel = 100;
        }
    }

    void setVolumUp() {
       volume++;
        if (volume == 50) {
            System.out.println("The max volume is 50, it can't go up anymore.");
        }
    }

    void setVolumDown() {
        volume--;
        if (volume == 00) {
            System.out.println("The min volume is 0, it can't go down anymore.");
        }
    }

}
