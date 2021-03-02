public class LLNode
{
    private LLNode next;
    private Object obj;
    public LLNode()
    {
        obj = null;
        next = null;
    }
    public LLNode(Object o)
    {
        obj = o;
        next = null;
    }
    public LLNode getNext()
    {
        return next; 
    }
    public void setNext(LLNode llNode)
    {
        next = llNode;
    }
    public Object getObj()
    {
        return obj;
    }
    public void setObj(Object o)
    {
        obj = o;
    }
    public Object get(int index)
    {
        if(index == 0)
        {
            return this.getObj();
        }
        else
        {
            return next.get(index - 1);
        }
    }
    public Object set(int index, Object o)
    {
        if(index == 0)
        {
            Object temp = obj;
            obj = o;
            return temp;
        }
        else
        {
            return next.set(index - 1, o);
        }
    }
    public int size()
    {
        if(next == null)
        {
            return 1;
        }
        else 
        {
            return next.size() + 1;
        }
    }
    public void add(Object o)
    {
        if(this.getObj() == null)
        {
            this.setObj(o);
        }
        else if(next == null)
        {
            LLNode llNode = new LLNode(o);
            next = llNode;
        }
        else
        {
            next.add(o);
        }
    }
    public void add(int index, Object o)
    {
        if(index == 1)
        {
            LLNode llNode = new LLNode(o);
            llNode.setNext(next);
            next = llNode;
        }
        else if(index == 0)
        {
            LLNode llNode = new LLNode(this.getObj());
            this.setObj(o);
            llNode.setNext(this.getNext());
            next = llNode;
        }
        else
        {
            next.add(index - 1, o);
        }
    }
    public boolean contains(Object o)
    {
        if(this.getObj().equals(o))
        {
            return true;
        }
        else if(next != null)
        {
            return next.contains(o);
        }
        else
        {
            return false;
        }
    }
    public Object remove(int index)
    {
        if(index == 1)
        {
            Object nextObj = next.getObj();
            this.setNext(next.getNext());
            return nextObj;
        }
        if(index == 0)
        {
            Object myObj = this.getObj();
            this.setObj(next.getObj());
            this.setNext(next.getNext());
            return myObj;
        }
        else
        {
            return next.remove(index - 1);
        }
    }
}