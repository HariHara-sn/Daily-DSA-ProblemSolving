<!-- # ✅ **Full BFS Code**

```java
void bfs(int start, ArrayList<ArrayList<Integer>> graph) {
    int n = graph.size();
    boolean[] visited = new boolean[n];
    Queue<Integer> q = new LinkedList<>();

    q.add(start);
    visited[start] = true;

    while (!q.isEmpty()) {
        int node = q.poll();
        System.out.print(node + " ");

        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                visited[neighbor] = true;
                q.add(neighbor);
            }
        }
    }
}
```

---

# 🔥 **What BFS is trying to do**

BFS = **visit nodes level by level**
and it uses a **Queue (FIFO)** to do this.

Let’s break the code into blocks.

---

# 🔹 **1. Read number of nodes**

```java
int n = graph.size();
```

If you have 6 nodes, `n = 6`.

`graph` is an **adjacency list**, something like:

```
0 → [1, 2]
1 → [0, 3]
2 → [0, 4]
3 → [1]
4 → [2, 5]
5 → [4]
```

---

# 🔹 **2. Create a visited array**

```java
boolean[] visited = new boolean[n];
```

Initially:

```
visited = [false, false, false, false, false, false]
```

This prevents infinite loops in graphs.

---

# 🔹 **3. Create an empty queue**

```java
Queue<Integer> q = new LinkedList<>();
```

Queue will help BFS take nodes **in order**.

---

# 🔹 **4. Add start node to queue**

```java
q.add(start);
visited[start] = true;
```

If start = 1:

```
Queue: [1]
visited = [false, true, false, false, false, false]
```

We marked 1 as visited.

---

# 🔥 THE REAL BFS STARTS HERE

# 🔹 **5. Loop until queue becomes empty**

```java
while (!q.isEmpty()) {
```

As long as we have nodes to process.

---

# 🔹 **6. Remove front node (FIFO)**

```java
int node = q.poll();
```

This means:

* take first element from queue
* remove it
* call it "node"

Example:

```
Queue: [1, 2, 3]
node = 1
Queue becomes: [2, 3]
```

This is BFS’s MOST IMPORTANT STEP.

---

# 🔹 **7. Print the node**

```java
System.out.print(node + " ");
```

Means: "I visited this node".

---

# 🔹 **8. Visit all neighbors of that node**

```java
for (int neighbor : graph.get(node)) {
```

If graph.get(1) = [2,3] → neighbors are 2 and 3.

---

# 🔹 **9. Add neighbors to queue if not visited**

```java
if (!visited[neighbor]) {
    visited[neighbor] = true;
    q.add(neighbor);
}
```

This does 2 things:

### ✔ mark neighbor as visited

(so we don’t visit again)

### ✔ add to queue

(so we will process it later)

--- -->

# 🔥 FULL DRY RUN (IMPORTANT)

Take this graph:

```
1 -- 2 -- 4
|    |
3 -- 5
```

Adj list (0 unused):

```
1: [2,3]
2: [1,4,5]
3: [1,5]
4: [2]
5: [2,3]
```

Start = **1**

---

### Initial

```
Queue: [1]
Visited: 1
```

---

### Step 1:

Pop 1
Add neighbors (2, 3)

```
Visited: 1 2 3
Queue: [2, 3]
Output: 1
```

---

### Step 2:

Pop 2
Add neighbors (4, 5)

```
Visited: 1 2 3 4 5
Queue: [3, 4, 5]
Output: 1 2
```

---

### Step 3:

Pop 3
Neighbors (already visited)

```
Queue: [4, 5]
Output: 1 2 3
```

---

### Step 4:

Pop 4

```
Queue: [5]
Output: 1 2 3 4
```

---

### Step 5:

Pop 5

```
Queue: []
Output: 1 2 3 4 5
```

---

# 🎉 Final BFS Output:

```
1 2 3 4 5
```

---

# 🧠 Summary of the Code (very simple)

* Use `visited[]` → avoid revisiting nodes
* Use `queue` → maintain order
* Process each node → then add its neighbors
* Continue until queue is empty

---