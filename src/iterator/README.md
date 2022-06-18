# Iterator pattern

The iterator pattern is used to decouple the logic of iterating over objects from the way they are stored.
`PurchaseHistory` is a custom collection of `Purchase`s.
Even though it stores more properties that just a collection of purchases, it allows you to iterate over instances of
the class.

The `MainPurchase` shows a use case of this system.

## The pattern

The naming of methods in this description is arbitrary but descriptive.
The pattern uses generics to allow iterating over the strongly typed collection rather than an ``Object`` collection.

### The Iterable interface

- Must declare an `iterator()` method.
- Describes the method that external classes use to retrieve an iterator for the class.

### The Iterator interface

- Must declare a `hasNext()` method.
- Describes the method that lets using classes know whether there is a next element to iterate over.
- Must declare a `next()` method.
- Describes the method that returns the next element in the iteration.

### Iterables

- Must implement the `Iterable` interface.
- Will often return an anonymous class that implements the `Iterator` interface.

## Benefits of using the pattern

- The class that iterates over the objects does not need to know how the objects are stored.

