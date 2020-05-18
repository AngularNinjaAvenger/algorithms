    /**
     * 
     * @param peopleToSave
     * @param limit
     * given a list of ints your going to pair int to determine who can be saved
     * the goal is to get the minum number of list parts to save the int and each 
     * pir must not exceed a limit 
     * 
     * we re going to be using a 2 pointer to solve this
     * 
     * we pair by the people by seeing if we can air the smaller numbes with the 
     * larger one and it's less than the limit
     */
    public int peopleToSave(int[] peopleToSave , int limit){
        int numOfBoats = 0;
        int i = 0;
        int j = peopleToSave.length;
        while(i <= j){
            if(peopleToSave[i] + peopleToSave[j] <= limit){
                j--;
                i++;
            }else{
                // remmber the list is sorted so , so wehn we add the current small[i] with the
                // larget at index [j] adn we see it's more than our limit we just take only the 
                // lage number by -- and move the large pointer
                j--;
            }
            numOfBoats++;
        }
        return numOfBoats;
    }