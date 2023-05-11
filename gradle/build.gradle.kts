tasks.register<Copy>("initializeGitHooks") {
    from(layout.projectDirectory.file("hooks/pre-commit"))
    // No need to do '../' when the project is at the root of the Git repository.
    into(layout.projectDirectory.dir("../.git/hooks"))
}
