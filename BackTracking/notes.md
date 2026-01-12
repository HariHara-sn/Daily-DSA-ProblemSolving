🌱 What is Backtracking?

Backtracking is a way to explore all possible choices step-by-step.

Think of it as:

“Try a choice → go deeper →
if you hit a dead end or finish one possibility → go back (backtrack) → try the next choice.”

It’s like exploring all possible paths in a decision tree.

Backtracking is a strategy for exploring possibilities and undoing choices when they lead to dead ends. 
## You can think of it like navigating a maze:

You walk forward until you hit a wall.

If you can’t continue, you backtrack to the last point where another choice was possible.

Then you try the next option.

Repeat until you either find a solution or exhaust all paths.

Backtracking is commonly used for:

- Solving puzzles (Sudoku, crosswords)

- Generating combinations/permutations

- Finding paths (maze-solving)

- Constraint satisfaction problems (N-Queens, graph coloring)

🔄 **Backtracking Pattern (General Template)**

def backtrack(state):
    if state is complete:
        record solution
        return

    for each valid choice:
        make the choice
        backtrack(updated state)
        undo the choice  # <— this is the magic


This pattern stays consistent across almost all backtracking solutions.