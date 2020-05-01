package algorithms.algs;

public class CombinationSum {
    public static void main(final String[] args) {
        List<List<Integer>> result = new ArrayList<>();
        int[] list = new int[] {1,2,3,4,3};
        int target = 7;
        Arrays.sort(list);

        combinationSum(list,0,new ArrayList<Integer>(),result,target);

        System.out.println(result.toString());
    }
    /**
     *  list = [1,2,3,4,3]
     * target = 7
     * output = [
     *      [3,3,1],
     *      [4,3],
     *      [4,2,1],
     * ]
     * 
     * NOTE:there must be no duplucate
     * 
     * using dfs we are going to walk though the array
     * and simulate taking and not take every item in 
     * the list .
     */
    public static void combinationSum(int[] list ,int idx,List<Integer> currentList,List<List<Integer>> result,int target){
        if(target == 0){
            /**
             * this means that the currentList is sums up 
             * to the target
             */
            result.add(new ArrayList<>(currentList));
            return;
        }
        /**
         * this means that the curentList is less than our target
         * so we can't add it to our list
         */
        if(target < 0) return;

        for (int i = idx; i < list.length; i++) {
            /**
             * the second || conditions is preventing duplicate
             * if it has check the prevoius number it should
             * not check the next
             */
            if( i == idx || list[i] != list[i -1]){
                currentList.add(list[i]);
                combinationSum(list,idx + 1,currentList,result,target - list[i]);
                if (!currentList.isEmpty()) currentList.remove( currentList.size() - 1 );
            }
        }
    }
}