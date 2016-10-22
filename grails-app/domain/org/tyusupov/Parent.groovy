package org.tyusupov

class Parent {
    String name

    static hasMany = [
        childs: Child
    ]
}
