package miscellaneous.immutablecollections;

/*
What are Immutable Collections?
An immutable collection, as the name suggests, is a collection that cannot be modified
after its creation. In other words, once an immutable collection is created with its
initial set of elements, you cannot add, remove, or alter those elements. Instead of
modifying an existing collection, any operation that would modify the collection returns a
new collection with the desired modifications.

Benefits of immutable collections include:
Thread Safety: Immutable collections can be safely shared among multiple threads without
the need for synchronization. Since the collection's state is fixed, there's no risk of
concurrent modification issues.
Predictability: Immutability ensures that once an object is created, its state remains unchanged,
leading to more predictable and reliable code behavior.
Simpler Debugging: Bugs related to accidental modifications of collections are eliminated,
making debugging easier.
Functional Programming: Immutable collections align well with functional programming principles,
enabling you to write more expressive and concise code.

Limitations and Considerations
While immutable collections offer numerous advantages, it's important to be aware of their
limitations and considerations:

Memory Usage: Since immutable collections create new instances for each modification, they can
lead to increased memory usage, especially for large collections.
Performance: The creation of new instances during modifications can impact performance,
especially in scenarios where frequent modifications are required.
Builder Pattern: The creation syntax for immutable collections can become cumbersome when
dealing with a large number of elements. In such cases, using the builder pattern or mutable
collections initially might be more practical.
 */

import java.util.*;


public class ImmutableCollectionsEx {
    public static void main(String[] args)
    {
        /*
        Unmodifiable collections are usually read-only views (wrappers) of other collections.
        You can't add, remove or clear them, but the underlying collection can change.

        Immutable collections can't be changed at all - they don't wrap another collection
        - they have their own elements.
         */


        final List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");

        final List<String> im = List.of(list.toArray(new String[]{}));
        //im.add("four");
        list.add("four");
        System.out.println(list);
        System.out.println(im);



    }
}
