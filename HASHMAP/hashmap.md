# HASHMAP

It is a data structure which is used for storing key value pairs, but it stores in a random order, the advantage of using hashmap is that all operations used within a hashmap occur in **O(1)** complexity.

---

## Implementation of Hashamp

To implement a Hashmap we use the syntax in java:-

> Hashmap<String, Integer> hm = new Hashmap<>();

## **Operations which can be used on hashmap**:-

## 1. Put Method

- put method
  - hm.put("India", 200);
  - hm.put("NewZealand", 20);
  - hm.put("China", 300);

If there is a key already present in the hashmap, and we use the put function again with the same key but with a different value then it will update the previous value and replace it with a new value.

For eg:-

> hm.put("NewZealand", 45); --> will update the value of newzealand from 20 to 45.

</br>

## 2. Get Method

</br>

- get method
  -hm.get("India");

This will return the value present in that key.

-containsKey();
hm.containsKey("India");

This will give a boolean value true/false if it is present in the hash table.

## 3. Set Function

Used for looping and traversals in hashmap

```java
Set<String> keys = hm.keySet();
System.out.println(keys);//This will print all the keys
```

> ### Implementation of set in loops

</br>

```java
for(String key: hm.keySet()){
  Integer value = hm.get(key);
  System.out.println(key + "-->" + value);
}

// This will print all the keys along with their respected values one by one but the order will be randomized.

```

## 4. Remove Method

```java
hm.remove("India");
removes a paticular key along with its value
```
