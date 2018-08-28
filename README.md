# service-loader-example
Service Loader Example in Java

# steps to Run

```
cd service-loader-example
cd service-interface-example
mvn clean compile install
cd ..
cd service-provider-1
mvn clean compile install
cd ..
cd service-provider-2
mvn clean compile install
cd ..
cd service-example
mvn clean compile assembly:single
cd target
java -cp "../../service-provider-1/target/service-provider-example-1-1.0-SNAPSHOT.jar:../../service-provider-2/target/service-provider-example-2-1.0-SNAPSHOT.jar:service-example-1.0-SNAPSHOT-jar-with-dependencies.jar" sukumaar.ServiceLoaderExample asgardThor Sukumaar
java -cp "../../service-provider-1/target/service-provider-example-1-1.0-SNAPSHOT.jar:../../service-provider-2/target/service-provider-example-2-1.0-SNAPSHOT.jar:service-example-1.0-SNAPSHOT-jar-with-dependencies.jar" sukumaar.ServiceLoaderExample earthThor Sukumaar
```