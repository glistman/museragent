Mobil User Agent Parser
======================


## Getting Started

To get started, you can add museragent as a dependency in your project:

* sbt
  ```scala
  libraryDependencies += "com.github.glistman" %% "museragent" % "1.0.0"
  ```
* Gradle
  ```
  compile group: 'com.github.glistman', name: 'museragent', version: '1.0.0'
  ```
* Maven
  ```xml
  <dependency>
    <groupId>com.github.glistman</groupId>
    <artifactId>museragent</artifactId>
    <version>1.0.0</version>
  </dependency>
  ```
## Usage

```
        UserAgentParser userAgentParser= new UserAgentParser();
        UserAgent userAgent = userAgentParser.parse("Dalvik/2.1.0 (Linux; U; Android 7.1.1; moto x4 Build/NPW26.83-41)");
        System.out.println(userAgent.getOperatingSystem());
        System.out.println(userAgent.getOperatingSystemVersion());
        System.out.println(userAgent.getDeviceVendor());
        System.out.println(userAgent.getDeviceModel());
        System.out.println(userAgent.isMobile());
        System.out.println(userAgent.getUserAgentRaw());
```
## Output
```
        Android 
        7.1.1
        Motorola
        moto x4 Build/NPW26.83-41
        true
        Dalvik/2.1.0 (Linux; U; Android 7.1.1; moto x4 Build/NPW26.83-41)
```

## License

Mobil User Agent Parser is licensed under the MIT license.