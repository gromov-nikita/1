public class С4 {
    public static void main(String[] args) {
        System.out.println(1);
        cycle:
        for(int i = 2; i < 100; i++){
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    continue cycle;
                }
            }
            System.out.println(i);
        }
    }
}
