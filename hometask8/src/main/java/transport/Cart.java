package transport;

public class Cart {
    private int resources = 0;
    private int maxValue = 100;
    private boolean full = false;
    private boolean onPlace = false;

    public int getResources(int count) {
        if (count <= resources) {
            resources -= count;
            return count;
        } else if (count > resources && resources > 0) {
            System.out.println("Cart is empty");
            full = false;
            int temp = resources;
            resources = 0;
            notifyAll();
            return temp;
        } else if (resources == 0) {
            System.out.println("Cart is empty");
            full = false;
            notifyAll();
            return 0;
        }

        notifyAll();
        return 0;
    }

    public void setResources(int count) {
        if (resources + count <= maxValue) {
            resources += count;

            if (resources == maxValue) {
                full = true;
                notifyAll();
            }
        }
    }

    public boolean isFull() {
        return full;
    }

    public boolean isEmpty(){
        return !full;
    }

    public boolean isOnPlace() {
        if(!onPlace){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return onPlace;
    }

    public void setOnPlace(boolean onPlace) {
        this.onPlace = onPlace;
        notifyAll();

        if(onPlace){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
