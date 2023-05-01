# Collections-practice

This is my repository for the works I've done while undergoing Pluralsight's Java 11 Fundamental Collections


### Lists: Collection with Iteration

Summary: Lists are the most popular form of collection that defines iteration order. Lists are collections that defines iteration order.

Each element in the List has an index, which represents its position in the list

Key Features:

```
- void add(int index, E e);
- E get(int index)
- E remove(int index)
- E set(int index, E element)
- boolean addAll(int index, Collection c)
- List<E> sublist(int fromIndex, int toIndex)
```

Implementations: ArrayList and linkedList

### Maps: Collection of Pairs

Summary: Maps are collections of key and value pairs. Map, unlike other collections, is the only collection that dont
extend or implement the Java Collections Interface

- keys have to be unique
- values doesnt have to be unique

Key features:
```
- V put(K key, V value)
- void putAll(Map<? extends K, ? extends V> values)
- V get(Object key) // look up elements
- boolean containsKey(Object key)
- boolean containsValue(Object value)
- V remove(Object key)
- void clear() 
- int size() 
- boolean isEmpty()

// Immutable Map Factories
- Map.Entry<String, Integer> entry = Map.entry("alexo", 27);
- Map<String, Integer> personToAge = Map.of("Alexo", 27);
- personToAge = Map.ofEntries(Map.entry("Alexo", 28));
- Map<String, Integer> copy = Map.copyOf(personToAge);
```

Adding and replacing -> use put for a single value, putAll for another Map
Null keys and values are implementation specific
