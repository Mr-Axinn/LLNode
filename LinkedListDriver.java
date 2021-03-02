public class LinkedListDriver
{
    public static void main(){
        LLNode myList = new LLNode();
        
        //add items
        myList.add("item1");
        myList.add("item2");
        myList.add("item3");
        myList.add("item4");
        
        
        //make sure size is 4 (all items successfully added)
        if(!(myList.size() == 4)){
            System.out.println("ERROR 1");
        }
        
        //get object at index 2 and test to make sure it is "item3"
        String x = (String)(myList.get(2));
        if(!(x.equals("item3"))){
            System.out.println("ERROR 2");
        }
        
        //remove "item2" and test to make sure it was returned correctly
        x = (String)(myList.remove(1));
        if(!(x.equals("item2"))){
            System.out.println("ERROR 3");
        }
        
        //get object at index 1 and make sure it is "item3", since "item2" was removed
        x = (String)(myList.get(1));
        if(!(x.equals("item3"))){
            System.out.println("ERROR 4");
        }
        
        //set a new object in index 2, and make sure that "item4" was returned
        x = (String)(myList.set(2, "item5"));
        if(!(x.equals("item4"))){
            System.out.println("ERROR 5");
        }
        
        //make sure the object was successfully set above
        x = (String)(myList.get(2));
        if(!(x.equals("item5"))){
            System.out.println("ERROR 6");
        }
        
        //check to see if the list contains "item5", which it should, at index 2
        if(!(myList.contains(x))){
            System.out.println("ERROR 7");
        }
        
        //print all items as final check. Should be item1, item3, item5
        System.out.println("Items in list after execution (should be 1, 3, and 5):");
        for(int i=0; i<myList.size(); i++){
            System.out.println(myList.get(i));
        }
        
        x = (String)(myList.remove(0));
        if(!(x.equals("item1"))){
            System.out.println("ERROR 8");
        }
        
        myList.add(0, "item 7");
        x = (String)(myList.get(0));
        
        if(!(x.equals("item 7"))){
            System.out.println("ERROR 9");
        }
    }
}