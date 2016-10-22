package org.tyusupov

class Child {
    Parent parent
    String name
    Integer counter

    static belongsTo = [parent: Parent]
}
