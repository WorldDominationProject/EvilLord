# EvilLord


## Setup Workspace

Windows: `gradlew setupDecompWorkspace` (`./gradlew setupDecompWorkspace` if you are on Mac/Linux)

## Setup Eclipse

For Eclipse, run `gradlew eclipse` (`./gradlew eclipse` if you are on Mac/Linux)

Open Eclipse and switch your workspace to /eclipse/

## Setup IDEA

If you prefer to use IntelliJ, steps are a little different.

1. Open IDEA, and import project.
2. Select your build.gradle file and have it import.
3. Once it's finished you must close IntelliJ and run the following command:

`gradlew genIntellijRuns` (`./gradlew genIntellijRuns` if you are on Mac/Linux)
