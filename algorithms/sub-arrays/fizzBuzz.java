public static List<String> fizzBuzz(List<Integer> list){
    List<String> fizzBuzzList = new ArrayList<String>();

    for (int i = 0; i < list.size(); i++) {
        int num = list.get(i);
        if ( num % 3 == 0 ) fizzBuzzList.add("fizz");
        else if( num % 5 == 0 )fizzBuzzList.add("buzz");
        else fizzBuzzList.add(num + " ");
    }
    return fizzBuzzList;
}