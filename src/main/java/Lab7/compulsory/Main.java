package Lab7.compulsory;

public class Main{
    public static void main(String[] args) {

        /**
         *  creates an instance of the Exploration class
         */
        Exploration exploration = new Exploration(10, 5);
        exploration.startExploration();

        try {
            /**
             * pauses execution for 5 seconds using the Thread.sleep() method
             */
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        exploration.stopExploration();
    }

}