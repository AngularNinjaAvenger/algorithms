public static String reArrangeString(String s){
    // calclulate how much times any characters present in the string
    Map<Character, Integer> counter = new HashMap();
    for(Character c : s.toCharArray()) {
        if(counter.containsKey(c)) {
            counter.put(c, counter.get(c) + 1);
        } else {
            counter.put(c, 1);
        }
    }
    
    // add them to priority queue to make able to get them according to characters repeating count
    PriorityQueue<Pair<Character, Integer>> queue = new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());
    for(Map.Entry<Character, Integer> entry : counter.entrySet()) {
        queue.add(new Pair(entry.getKey(), entry.getValue()));
    }
    
    // out buffer
    StringBuilder sb = new StringBuilder();
    
    // disasemble queue to create a result string
    while(!queue.isEmpty()) {
        // get two characters from the top
        Pair<Character, Integer> max = queue.poll();
        Pair<Character, Integer> preMax =  null;
        
        if(!queue.isEmpty()) {
            preMax = queue.poll();
        }
        
        // edge case: if more we have just one character but it repeaded more than one time in original string
        if(preMax == null && max.getValue() > 1) {
            return "";
        }
        
        // decrease counter for each pari and add them to the queue again (otherwice we've already removed them)
        if(max != null && max.getValue() > 1) {
            queue.add(new Pair(max.getKey(), max.getValue() - 1));
        }
        if(preMax != null && preMax.getValue() > 1) {
            queue.add(new Pair(preMax.getKey(), preMax.getValue() - 1));
        }
        
        // add first characters to the sting
        sb.append(max.getKey());
        // add second characters to the sting
        if(preMax != null) {
            sb.append(preMax.getKey());
        }
    }
    
    return sb.toString();
}