# Automatic Code Formatting - Java - Gradle

This project uses the [Spotless](https://github.com/diffplug/spotless/tree/main/plugin-gradle#google-java-format) plugin to format the code according to the Google Java Format.

The plugin checks the code style by adding the `spotlessJavaCheck` task to the build lifecycle and fails the build when it finds non-compliant files. Use the following command to fix them:

```sh
./gradlew :app:spotlessApply
```
