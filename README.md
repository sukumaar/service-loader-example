# service-loader-example
Service Loader Example in Java

# steps to Run

```
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
mvn clean compile install
cd ..
cd service-example
mvn exec:java -Dexec.mainClass="sukumaar.ServiceLoaderExample" -Dexec.args="asgardThor Sukumaar"
mvn exec:java -Dexec.mainClass="sukumaar.ServiceLoaderExample" -Dexec.args="earthThor Sukumaar"
```