class listofExceptions {

    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");


        for(int i = 0; i < myList.size(); i++) {
            for{
                Integer=(Integer) myList.get(i);
            } catch(ClassCastException) {
                System.out.println(i);
            }
        }
    }