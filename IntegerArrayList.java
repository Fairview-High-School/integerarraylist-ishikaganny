public class IntegerArrayList implements IntegerList
{
    private Integer[] data;
    private int size;
    public IntegerArrayList()
    {
        data = new Integer[10];
        size = 0;
    }

    public void add(Integer val)
    {
        if (size>=data.length)
        {
            Integer[] biggerArray =  new Integer[data.length*2];
            for(int i=0; i<data.length; i++)
            {
                biggerArray[i] = data[i];
            }
            data = biggerArray;
        }
        data[size] = val;
        size++;
    }

    public void add(int index, Integer val)
    {
        if (size>=data.length)
        {
            Integer[] biggerArray =  new Integer[data.length*2];
            for(int i=0; i<data.length; i++)
            {
                biggerArray[i] = data[i];
            }
            data = biggerArray;
        }
        for (int i = size+1; i>index; i--)
        {
            data[i] = data[i-1];
        }
        data[index]=val;
        size++;
    }
    public void set(int index, Integer val);
    {
        data[index] = val;
    }

    public void clear()
    {
        size = 0;
    }
    public void remove(int index)
    {
        for (int i = index; i<size-1; i--)
        {
            data[i] = data[i+1];
        }
        size--;
    }
    public Integer get(int index)
    {
        if (index<0 || index>= size)
        {
            throw new IndexOutOfBoundsException("index: "+ index);
        }
        return data[index];
    }
    public int size()
    {
        return size;
    }
    public boolean isEmpty()
    {
        if (size==0)
            return true;
        else
            return false;
    }
    public boolean contains(Integer val)
    {
        boolean contain = false;
        for(int i=0; i<size; i++)
        {
            if (data[i]== val)
                contain = true;
        }
        return contain;
        
    }
    public int indexOf(Integer val)
    {
        for(int i=0; i<size; i++)
        {
            if (data[i]== val)
                return i;
        }
        return -1;
    }
    public boolean equals(List<Integer> other)
    {
        if (size != other.size())
            return false;
        boolean equal = true;
        for (int i=0; i<size; i++)
        {
            if (data[i] != other.get(i))
            {
                equal = false;
            }
        }
        return equal;
    }
    public String toString()
    {
        String result = "[";
        for(int i=0; i<size-1; i++)
        {
            result += data[i] + ",";
        }
        result += data[size-1] + "]";
        return result;
    }

}
