# Collections-practice

This is my repository for the works I've done while undergoing Pluralsight's Java 11 Fundamental Collections


### Lists: Collection with Iteration

Summary: Lists are the most popular form of collection that defines iteration order. Lists are collections that defines iteration order.

Each element in the List has an index, which represents its position in the list

Key Features:

```kotlin
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
```kotlin 
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


Views over Maps
- has a bidirectional relationship

```kotlin
var ids = idToProduct.keySet(); // returns unique set of KEYS
var values = idToProduct.values(); // returns collection of values
```

Advance operations added in java 8 and 17 range
- replace(key, value) -> update a single value.
  - put will add in a key and value pair into the map, even if it isnt there
  - replace will not do anything if the object is not in the map
- replaceAll(BiFunction<K,V,V)) -> replace elements using a function
- removes(key, value) -> removes a key only if it has a value
- getOrDefault -> returns a default value if get is null
- computeIfAbsent -> takes a function that lets you compute a value if the key is not associated with a value
  - or if the value is null
- putIfAbsent
- computeIfPresent
- compute
- merge -> takes a key and value and a remapping function
- forEach