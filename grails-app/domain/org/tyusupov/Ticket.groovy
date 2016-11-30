package org.tyusupov

import org.hibernate.annotations.OptimisticLock

/**
 * @author Timur
 * @date 2016-10-25.
 */
class Ticket {
    String title
    Integer version

    @OptimisticLock(excluded = true)
    Set<Component> components

    static hasMany = [components: Component]
}
