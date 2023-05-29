package combination;

public class comb {

    public static void main(String[] args) {

//
        int[] arr = {21000,16800,15300,14400, 13500, 12600, 11400,10200,9600,9000, 8700,8100, 7500, 7200,6600,6000,5700,5100,4800,4500};
        int target = 48000;
        entry_4(arr, target);
        entry_5(arr,target);
        entry_6(arr,target);

//        int[] combAll = {14000, 11200, 10200, 9600,9000, 8400, 7600, 6800,6400,6000,5800,5400,5000,4800,44000,4000,3800,3400,3200,3000};
//        int target = 50000;
//        System.out.println("Combinations of given array that add up to target ");
//        findCombinations(combAll, target);

    }
    static void entry_4(int[] comb, int target){
        for (int i = 0; i < comb.length; i++) {
            for (int j = i + 1; j < comb.length; j++) {
                for (int k = i + 2; k < comb.length; k++) {
                    for (int l = i + 3; l < comb.length; l++) {
                        if (comb[i] + comb[j] + comb[k] +comb[l] == target) {
                            System.out.println("entry 4 (" + comb[i] + "," + comb[j] + ',' + comb[k] + ','+comb[l]+ ")");
                        }
                    }
                }
            }
        }
    }
    static void entry_5(int[] comb, int target){
        for (int i = 0; i < comb.length; i++) {
            for (int j = i + 1; j < comb.length; j++) {
                for (int k = i + 2; k < comb.length; k++) {
                    for (int l = i + 3; l < comb.length; l++) {
                        for (int h = i + 4; h < comb.length; h++) {
                            if (comb[i] + comb[j] + comb[k] + comb[l] + comb[h] == target) {
                                System.out.println("entry 5 (" + comb[i] + "," + comb[j] + ',' + comb[k] + ',' + comb[l] + ','+comb[h]+ ")");
                            }
                        }
                    }
                }
            }
        }
    }
    static void entry_6(int[] comb, int target){
        for (int i = 0; i < comb.length; i++) {
            for (int j = i + 1; j < comb.length; j++) {
                for (int k = i + 2; k < comb.length; k++) {
                    for (int l = i + 3; l < comb.length; l++) {
                        for (int h = i + 4; h < comb.length; h++) {
                            for (int g = i + 5; g < comb.length; g++) {
                                if (comb[i] + comb[j] + comb[k] + comb[l] + comb[h] + comb[g]== target) {
                                    System.out.println("entry 6 (" + comb[i] + ","
                                            + comb[j] + ','
                                            + comb[k] + ',' + comb[l] + ',' + comb[h] + ','+comb[g]+ ")");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    static void findCombinations(int[] combAll, int target) {
        int n = combAll.length;
        for (int i = 0; i < (1 << n); i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0)
                    sum += combAll[j];
            }
            if (sum == target) {
                System.out.print("{ ");
                for (int j = 0; j < n; j++) {
                    if ((i & (1 << j)) > 0)
                        System.out.print(combAll[j] + " ");
                }
                System.out.println("}");
            }
        }
    }
}
