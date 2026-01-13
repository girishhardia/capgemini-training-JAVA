/*
Collection framework:
     It provides a machenism to perform CRUD operations, searching operations, sorting operations on group of objects. 

Collection:
     Group of objects stored in a single unit is called collection.



[ I ] = Interface (Blue Box)

( C ) = Class (Red Box)

──> = Extends (Solid Green Arrow)

- - > = Implements (Dashed Orange Arrow)

                                                   [ I ] Iterable
                                                            │
                                                            │ ──> (extends)
                                                            ▼
                                                    [ I ] Collection
                                                            │
                                        ┌─────────────────┼─────────────────┐
                                        │                 │                 │
                                        │ ──>             │ ──>             │ ──>
                                        ▼                 ▼                 ▼
                                    [ I ] List         [ I ] Set        [ I ] Queue
                                        │                 │                 │
                                        │ - - >           │ - - >           │ - - >
                                        │                 │                 │
                                        ├── (C) ArrayList ├── (C) HashSet   ├── (C) PriorityQueue
                                        │                 │                 │
                                        ├── (C) LinkedList├── (C) LinkedHashSet
                                        │                 │                 └── (C) LinkedList
                                        └── (C) Vector    └── (C) TreeSet
                                                │
                                                │ ──> (extends)
                                                ▼
                                            (C) Stack




     In all the classes collection  heirarchy toString(), hashcode(), equals() methods are already override.

     In java we have two types of collections.

     1. generic collections :
            in generic collections we can create collections of specific type, we can store only same type of objects.
            we can create generic collections by using < >.
            
     2. non generic collections : 
            in non generic collections we can create collections of specific type, we can store different type of objects.
            we can create non generic collections by not using < >.

     */