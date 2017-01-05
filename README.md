# WitAI Model POJOs

The purpose of this repository is to provide a library for the different model objects required for the [WitAI Platform](https://www.witai.com).

These POJOs can be serialized or deserialized using [GSON](https://github.com/google/gson) or [Jackson JSON libraries](https://github.com/FasterXML/jackson).

## Building the code

The mvn POM file requires two parameters passed.

```
mvn clean install -Dproject.version=1.0.0 -Dbuild.number=$BUILD_NUMBER
```

## Getting started

Add the most recent JAR to your project.

All objects are created using builders. The builders perform some validation, to ensure the JSON created will be accepted by the Facebook Messenger platform.

Here's an example for sending a simple message using JAX-RS and GSON.

```

```

## Contributions

If you wish to contribute to any issues you find in the source code, please [issue a pull request](https://github.com/deege/witai-model/pulls).

You can also [create a new issue](https://github.com/deege/witai-model/issues) and submit it. Please include as much detail as you can for the issue.
