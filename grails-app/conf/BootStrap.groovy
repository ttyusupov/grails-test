import org.codehaus.groovy.grails.orm.hibernate.cfg.GrailsDomainBinder
import org.codehaus.groovy.grails.orm.hibernate.cfg.Mapping
import org.hibernate.SessionFactory
import org.tyusupov.Component

class BootStrap {
    SessionFactory sessionFactory

    def init = { servletContext ->
        sessionFactory.getC
        Mapping mapping = GrailsDomainBinder.getMapping(Component.class)
        mapping.getco
    }
    def destroy = {
    }
}
