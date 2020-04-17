/**
     * your grouping words together that have the same anagram eg
     * [cat,mat,dat],["lot","olt"] and son on
     * how this is solved is ,you looop over the string,sort the 
     * current string and used a hash map to check if the sorted 
     * stirng exits and add the current string item to the map
     * then at the end you get all the list of string in the map
     * and return it
     * 
     */
    public static String[][] groupAnagram(String[] list){
        Map<String,String[]> store = new HashMap<String,String[]>();
        for (int i = 0; i < list.length; i++) {
            char[] chars = list[i].toCharArray();
            String currentWord = chars.toString();
            char[] SortedWordList = chars.clone(); 
            Arrays.sort(SortedWordList);
            String sortedWord = SortedWordList.toString();
            if(!store.containsKey(sortedWord)){
                store.put(sortedWord,new String[] {currentWord});
            }else{
                String[] tempList = store.get(sortedWord);
                tempList[tempList.length] = currentWord;
            }
        }
        String[][] result = new String[store.size()][];
        int idx = 0;
        for (String item : store.keySet()) {
            result[idx] = store.get(item);
            idx++;
        }
        return result;
    }