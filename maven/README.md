# Automatic Code Formatting - Java - Maven

This project uses Spotify's [fmt-maven-plugin](https://github.com/spotify/fmt-maven-plugin) to format the code according to the Google Java Format, and the [git-build-hook](https://github.com/rudikershaw/git-build-hook) maven plugin to configure a pre-commit hook that formats before the changes are committed.

The plugin checks the code style at the `verify` phase and fails the build when it finds non-compliant files. Use the following command to fix them:

```sh
./mvnw com.spotify.fmt:fmt-maven-plugin:format
```

Use the following command to configure the pre-commit hook:

```sh
./mvnw initialize
```
