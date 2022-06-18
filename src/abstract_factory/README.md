# Abstract factory

Abstract factory allows you to group the creation of multiple factory methods into a dedicated class where the subtypes
of the created objects are linked to each other.

As an example, we look at a `MilkFactory` where you can get `FatMilk` or `RegularMilk` but the factory serves either
chocolate milk or regular milk.

The `MainMilk` shows a use case of this system.

## The pattern

The naming of methods in this description is arbitrary but descriptive.

### The factory

- Must declare a `create()` method for each family of products that can be created.

### The factory implementations

- Must implement the `create()` method for each family.
- The `create()` method must return a subtype of the product interface specified in the method signature. This subtype
  must be consistent across the family.

## Benefits of using the pattern

- Decouples the creation of object families from using those objects.
- Maintains the consistency of the family of objects.