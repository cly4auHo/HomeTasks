package transport;

public class Source {

    private int source = 100;

    public int getSource(int count) {
        if (count <= source) {
            source -= count;
            return count;
        } else if (count > source && source > 0) {
            System.out.println("Source is empty");
            int temp = source;
            source = 0;
            return temp;
        }

        return 0;
    }
}