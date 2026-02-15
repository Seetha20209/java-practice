public class Store {
    public static void main(String[] args) {
        int itemsTotal = 50;
        int total = 0;

        for (int i = 1; i <= itemsTotal ; i++) {
            if(i%10==0){
                continue;
            }
            total += 1;
        }
        System.out.println(total);
    }
}
