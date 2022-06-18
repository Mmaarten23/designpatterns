# Composite pattern

The composite pattern is used (mostly) with tree-like data structures. It allows the leaf and non-leaf nodes to have
shared functionality where possible.
As an example, we look at a mockup of Java's internal system. `AbstractClass` is a non-leaf node and `Class` is the leaf
node representation.
In this example, we assume that a specific class can have a maximum amount of instances. The maximum amount of instances
of an abstract class can thus be calculated by summing up the maximum number of instances of all its children.

The `MainClass` shows a use case of this system.

## The pattern

### The superclass

- Must abstract the common functionality of the (non-)leaf nodes

## Benefits of using the pattern

- Both leaf and non-leaf nodes can be treated as a single unit
- Classes that deal with the tree as a whole do not need to know the difference between leaf and non-leaf nodes

