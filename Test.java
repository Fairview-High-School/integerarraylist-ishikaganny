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

        System.out.println("Test add(index, val): add item to position size");
        System.out.println("Expected: 1, 10, 20, 30, 40, 45, 50, 60, 70, 80, 90, 100, 110, 120");
        list.add(list.size(), 120);
        System.out.println("Output: "+list);

        System.out.println("Test add(index, val): add item to position -1");
        System.out.println("Expected: IndexOutOfBoundsException: -1");
        System.out.print("Output:");
        try
        {
             list.add(-1, 120);
        }
        catch(IndexOutOfBoundsException e)
        {
           System.out.println(e);
        }

        System.out.println("Test add(index, val): add item to position size + 1");
        System.out.println("Expected: IndexOutOfBoundsException: 15");
        System.out.print("Output:");
        try
        {
             list.add(15, 120);
        }
        catch(IndexOutOfBoundsException e)
        {
           System.out.println(e);
        }
     

        System.out.println("Test get(index): get all values");
        System.out.println("Expected: 1, 10, 20, 30, 40, 45, 50, 60, 70, 80, 90, 100, 110, 120");
        System.out.print("Output:");
        for(int i=0; i<list.size(); i++)
        { 
            System.out.print(list.get(i) + " ");
        }     
        
        System.out.println("Test get(index): invalid index (pos 14)");
        System.out.println("Expected: IndexOutOfBoundsException: 14");
        System.out.print("Output:");     
        try
        {
            System.out.println(list.get(list.size()));
        }
        catch(IndexOutOfBoundsException e)
        {
           System.out.println(e);
        }

        System.out.println("Test getIndex: invlid index (pos -1)");
        System.out.println("Expected: IndexOutofBoundsException: -1");
        System.out.print("Output:");
        try
        {
            System.out.println(list.get(-1));
        }
        catch(IndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        
        System.out.println("Test set(index, value): set position 0");
        System.out.println("Expected: 5, 1, 10, 20, 30, 40, 45, 50, 60, 70, 80, 90, 100, 110, 120");
        list.set(0, 5);
        System.out.println("Output:" + list);

        System.out.println("Test set(index, value): set position 5");
        System.out.println("Expected: 5, 1, 10, 20, 30, 40, 55, 50, 60, 70, 80, 90, 100, 110, 120");
        list.set(5, 55);
        System.out.println("Output:" + list);

        System.out.println("Test set(index, value): set position size()");
        System.out.println("Expected: IndexOutOfBoundsException: 14");
        System.out.print("Output:");     
        try
        {
            list.set(list.size(), 115);
        }
        catch(IndexOutOfBoundsException e)
        {
           System.out.println(e);
        }

        System.out.println("Test remove(index): remove item 0");
        System.out.println("Expected: 10, 20, 30, 40, 55, 50, 60, 70, 80, 90, 100, 110, 120");
        list.remove(0);
        System.out.println("Output:" + list);

        System.out.println("Test remove(index): remove item index 5");
        System.out.println("Expected: 10, 20, 30, 40, 55, 60, 70, 80, 90, 100, 110, 120");
        list.remove(5);
        System.out.println("Output:" + list);

        System.out.println("Test remove(index): remove item -1");
        System.out.println("Expected: IndexOutofBoundsException: -1");
        try
        {
            list.remove(-1);
        }
        catch(IndexOutOfBoundsException e)
        {
            System.out.println(e);
        }

        System.out.println("Test remove(index): remove item index size");
        System.out.println("Expected: IndexOutofBoundsException: 12");
        System.out.println("Output:");
        try
        {
            list.remove(list.size());
        }
        catch(IndexOutOfBoundsException e)
        {
            System.out.println(e);
        }

        System.out.println("Test contains(val) on non-empty list when item is not in list");
        System.out.println("Expected: False");
        System.out.println("Output:" + list.contains(7));

        System.out.println("Test contains(val) on non-empty list when item is in list");
        System.out.println("Expected: True");
        System.out.println("Output:" + list.contains(100));

        System.out.println("Test indexOf(val) on non-empty list when item is not in list");
        System.out.println("Expected: -1");
        System.out.println("Output:" + list.indexOf(7));

        System.out.println("Test indexOf(val) on non-empty list when item is in list");
        System.out.println("Expected: 0");
        System.out.println("Output: " + list.indexOf(10));
        
        System.out.println("Test isEmpty() on non-empty list");
        System.out.println("Expected: false");
        System.out.println("Output:" + list.isEmpty());

        System.out.println("Test equals on two non-empty equal lists");
        IntegerArrayList l = new IntegerArrayList();
        for (int i = 0; i < list.size(); i++) 
        {
            l.add(list.get(i)); 
        }
        System.out.println("Expected: true");
        System.out.println("Output: " + list.equals(l));

        System.out.println("Test equals on two non-empty unequal length lists with same values");
        System.out.println("Expected: false");
        list.add(1);
        System.out.println("Output: " + list.equals(l));
        list.remove(12);

        System.out.println("Test equals on two non-empty equal length lists with different values");
        l.set(5,300);
        System.out.println("Expected: false");
        System.out.println("Output: " + list.equals(l));

        System.out.println("Test size() on list length 12");
        System.out.println("Expected: 12");
        System.out.println("Output: " + list + " size: " + list.size());

        System.out.println("Test clear() on a non-empty list: " + list);
        System.out.println("Expected: [] size: 0");
        list.clear();
        System.out.println("Output: "+ list + " size: " + list.size());

        System.out.println("Test clear() on an empty list: " + list);
        System.out.println("Expected: [] size: 0");
        list.clear();
        System.out.println("Output: "+ list + " size: " + list.size());

        System.out.println("Test size() on empty list");
        System.out.println("Expected: 0");
        System.out.println("Output: " + list + " size: " + list.size());

        System.out.println("Test isEmpty() on empty list");
        System.out.println("Expected: true");
        System.out.println("Output:" + list.isEmpty());

        System.out.println("Test contains(val) on empty list");
        System.out.println("Expected: False");
        System.out.println("Output:" + list.contains(7));

        System.out.println("Test indexOf(val) on empty list");
        System.out.println("Expected: -1");
        System.out.println("Output:" + list.indexOf(7));

        System.out.println("Test equals on two empty lists");
        IntegerArrayList b = new IntegerArrayList();
        System.out.println("Expected: true");
        System.out.println("Output: " + list.equals(b));


       
    }
    
}
