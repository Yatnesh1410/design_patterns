package Observer;

import Observer.entities.Channel;
import Observer.entities.Observer;
import Observer.entities.Subject;
import Observer.entities.Subscriber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws IOException {
        Subject youtubeChannel = new Channel();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            System.out.println("Type 1 to upload a new video.");
            System.out.println("Type 2 to subscribe.");
            System.out.println("Type 3 to unsubscribe.");
            System.out.println("Type 4 to exit.");

            Integer choice = Integer.parseInt(bufferedReader.readLine());
            Boolean exit = false;

            switch(choice){
                case 1:
                    System.out.println("Please provide video title: ");
                    String videoTitle = bufferedReader.readLine();
                    youtubeChannel.notifyAllSubscribers(videoTitle);
                    break;

                case 2:
                    System.out.println("Please provide your name");
                    String subscriberName = bufferedReader.readLine();
                    Observer observerToSubscribe = new Subscriber(subscriberName);
                    youtubeChannel.subscribe(observerToSubscribe);
                    System.out.println("Total number of subscribers: " + youtubeChannel.getNumberOfSubscribers());
                    break;

                case 3:
                    System.out.println("Please provide your name");
                    String unsubscriberName = bufferedReader.readLine();
                    youtubeChannel.unsubscribe(unsubscriberName);
                    System.out.println("Total number of subscribers: " + youtubeChannel.getNumberOfSubscribers());
                    break;

                case 4:
                    System.out.println("Thank you");
                    exit = true;
                    break;

                default :
                    break;
            }

            if(exit){
                break;
            }
        }
    }
}
