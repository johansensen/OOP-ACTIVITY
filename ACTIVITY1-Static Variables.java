public class InstanceCounter {
    private static int instanceCount = 0;

    public InstanceCounter() {
        instanceCount++;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }

    public static void main(String[] args) {
        InstanceCounter obj1 = new InstanceCounter();
        InstanceCounter obj2 = new InstanceCounter();
        InstanceCounter obj3 = new InstanceCounter();

        int count = InstanceCounter.getInstanceCount();
        System.out.println("Number of instances created: " + count);
    }
}
