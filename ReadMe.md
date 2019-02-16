# Abstract
This project show you how to create fragment in OSGi for extending bundles that exist.

<b>Common</b> bundle contains two interfaces, UserServiceFragment is not exported and not accessible by other bundle to
provide service according to it.

<b>Fragment</b> bundle is a fragment for <b>Common</b> bundle to exporting another package of it.

<b>Host</b> bundle is a provider that implement all interfaces that exported by <b>Common</b> and <b>Fragment</b>

<b>Client</b> bundle get services of <b>Host</b> and use them.  

# Install
## Compile Project

```$xslt
$ mvn install
```

## Deploy Bundles

* Install aries-blueprint

```$xslt
$ karaf@root()> feature:install aries-blueprint
```

* Deploy <b>Common</b> bundle

```$xslt
$ karaf@root()> bundle:install -s mvn:com.khtm.test/common/1.0.0-SNAPSHOT
```

* Deploy <b>Fragment</b> bundle

```
$ karaf@root()> bundle:install mvn:com.khtm.test/fragment/1.0.0-SNAPSHOT
```

* Deploy <b>Host</b> bundle

```
$ karaf@root()> bundle:install -s mvn:com.khtm.test/host/1.0.0-SNAPSHOT
```

* Deploy <b>Client</b> bundle

```
$ karaf@root()> bundle:install -s mvn:com.khtm.test/client/1.0.0-SNAPSHOT
```

## Output

after installing <b>Client</b> bundle output display as follow:

```$xslt
User(id=1, firstName=alireza, lastName=khatami doost)
User(id=2, firstName=majid, lastName=vakili)
User(id=3, firstName=morteza, lastName=mosavi)
``` 


> Repository Address: https://github.com/alirezakhtm/karaf-blueprint-fragment