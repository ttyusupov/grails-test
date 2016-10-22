# grails-test
Testing deadlock when adding childs to parent concurrently

In order to test you can use grails shell:
```sh
grails shell
```

And then try different scenarios:
```
ctx.getBean("testService").testSameParentWithUpdate()
ctx.getBean("testService").testDifferentParentsWithUpdate()
ctx.getBean("testService").testSameParentWithoutUpdate()
ctx.getBean("testService").testSameParentWithUpdateLock()
```
