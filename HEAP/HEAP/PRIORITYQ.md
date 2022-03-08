# **HEAP**

A heap or priority queue has the same functionality as a queue but it stores values according to a certain priority.(By default it stores the smallest value in its peak).

</br>

> The order in which Priority Queue stores values is randomized just like HashMaps.

</br>

> ## DECLARATION OF HEAP

```java
PriorityQueue<Integer> pq = new PriorityQueue<>();

int [] ranks = {22, 99, 3, 11, 88, 4, 1};

for(int val: ranks){
  pq.add(val);
}

//Complexity O(NlogN)j
// Automatically sorts the ranks in ascending order


while(pq.size() > 0){
  System.out.println(pq.peek());
  pq.remove();
}
```

</br>

### Operations of Priority Queue

1. add(); // O(logN) complexity

2. remove();// O(log N) complexity

3. peek();// O(1) complexity

4. size();

</br>

// TO sort ranks in descending order

` PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());`
