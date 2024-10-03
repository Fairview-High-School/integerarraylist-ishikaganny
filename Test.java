public class Test 
{
    public static void main(String[] args) 
    {
        IntegerArrayList list = new IntegerArrayList();

        System.out.println("Test add(val)");
        System.out.println("Expected: 10 20 30 40 50");
        for (int val = 10; val<=50; val+=10)
        {
            list.add(val);
        }
        System.out.println("Output: " + list);
        for (int i=0; i<5; i++)
        {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        System.out.println("Test add(val): add the 11th item to the list");
        System.out.println("Expected: 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110");
        for (int val = 60; val<=110; val+=10)
        {
            list.add(val);
        }
        System.out.println("Output: "+list);

        System.out.println("Test add(index, val): add item to position 0");
        System.out.println("Expected: 1, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110");
        list.add(0,1);
        System.out.println("Output: "+list);

        System.out.println("Test add(index, val): add item to position 5");
        System.out.println("Expected: 1, 10, 20, 30, 40, 45, 50, 60, 70, 80, 90, 100, 110");
        list.add(5, 45);
        System.out.println("Output: "+list);


        //try
        //{
            //System.out.println(list.get(11));
       // }
        //catch(IndexOutOfBoundsException e)
        //{
           // System.out.println(e);
        //}

        /* 
        System.out.println("Test getIndex: Try to get the item at invlid index (position -1) from the list");
        System.out.println("Expected: IndexOutofBoundsException: -1");
        try
        {
            System.out.println(list.get(-1));
        }
        catch(IndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        list.add(3, 2);
        System.out.println(list);
       
    }
    */
}
