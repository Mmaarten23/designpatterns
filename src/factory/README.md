# Factory method

The factory method pattern is used to decouple client code from instantiating a specific subtype of an object.
As an example, we look at a `Breeder` where you can get a `Dog` or `Cat` depending on the type of breeder you go to.

The `MainBreeder` shows a use case of this system.

## The pattern

The naming of methods in this description is arbitrary but descriptive.

### The factory

- Must declare a `create()` method.

### The factory implementations

- Must implement the `create()` method.
- The `create()` method must return a subtype of the product interface specified in the method signature.

### The product interface

- Declares the common functionality of the products produced by all factories.

## Benefits of using the pattern

- Decouples the creation of objects from using those objects.
- Allows the substitution of implementations in a larger project.
- Allows the dynamic decision whether to create new objects or use existing ones.
