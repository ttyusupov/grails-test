package org.tyusupov

import org.hibernate.annotations.OptimisticLock

/**
 * @author Timur
 * @date 2016-10-25.
 */
class Component {
    String name
    Integer version

    @OptimisticLock(excluded = true)
    Set<Ticket> tickets

    static hasMany = [tickets: Ticket]
    static belongsTo = [Ticket]
}
