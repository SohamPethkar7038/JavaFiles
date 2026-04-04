
import java.util.ArrayList;
import java.util.List;


// Java collection framework provides a set of interfaces and classes to 
// implement various data structure and algorithms. These interfaces include
// several methods to perform different operations on collections.



// 😎😎😎😎😎 java collections interface 😎😎😎😎😎😎

// The collection interface include various methods that can be used to perform
// different operations on objects.

// int size() : Returns the number of elements in the collections

// boolean isEmpty : Returns true if the collection contains no element

// boolean contains(Object o) : Returns true if the collection contains the 
//                              specified elements

// boolean add(E e) : Adds the specified element to the collection. Returns
//                    true if the collection changed as result.

// boolean remove(Object o) : Removes the single instancce of the specified 
//                            element from the collections, if it present.
//                            Give the index in paranthesis

// boolean containsAll(Collection<> c) : Returns true if the collection contains
//                                      all elements of the specified collections.

// boolean addALl(Collection<> c) : Adds all element from the specified 
//                                  collection to other collection

// boolean removeAll(Collection<> c) : Remove all element in the collection that are
//                                     also contained in specified collection.

// boolean retainAll(Collection<> c) : Remove all elements from the collection that
//                                     are not present in specified collection

// void clear() : Removes all element from the collection

// Object[] toArray() : Returns an array containing all elements in collection.
//                                      



// ************************** ArrayList ****************************************
public class _1List{
    public static void main(String[] args) {

       // int a[] = new int[5];
        
        List<Integer> list = new ArrayList<>();

        List<Integer> list2 = new ArrayList<>();

        list.add(20);       //  add element in end
        list.add(40);
        list.add(60);
        list.add(80);
        list.add(100);


        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(20);
        list2.add(40);


        // list.remove(2);  // remove by the index

        // list.remove(Integer.valueOf(40));  // remove by object

        // System.out.println(list);

        // System.out.println(list.size());  // give size
        // System.out.println( list.contains(20));  // true if value is present
        
        
        //list.addAll(list2); // add elements to end of another list


        //list2.removeAll(list); // here element from list is remove which are in list2

        //list2.retainAll(list); // remove list2 element which are not present in list

        list2.clear();  // clearing all elements

        
       // System.out.println(list2); 

        
       Object a[] = list.toArray();   //
      
        for(Object e : a) {
            Integer temp = (Integer) e;
            System.out.println(e);
        }
    }
}