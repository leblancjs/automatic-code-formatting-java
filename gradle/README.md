# Automatic Code Formatting - Java - Gradle

This project uses the [Spotless](https://github.com/diffplug/spotless/tree/main/plugin-gradle#google-java-format) plugin to format the code according to the Google Java Format, and a copy task defined in the [build.gradle.kts](build.gradle.kts) file to configure a pre-commit hook that formats before the changes are committed.

The plugin checks the code style by adding the `spotlessJavaCheck` task to the build lifecycle and fails the build when it finds non-compliant files. Use the following command to fix them:

```sh
./gradlew :app:spotlessApply
```

Use the following command to configure the pre-commit hook:

```sh
./gradlew :initializeGitHooks
```
