# LiveCapture

LiveCapture is a Kotlin Multiplatform Mobile application template that shares business logic across Android 12+, iOS 17+, and HarmonyOS 5.x systems.

## Modules
- `shared` – common Kotlin code compiled for Android and iOS.
- `androidApp` – Android entry point using the shared module.
- `harmonyApp` – HarmonyOS entry point built on the Android stack.
- `iosApp` – SwiftUI application consuming the shared framework.

## Building
Use the Gradle wrapper to build Android and shared components:

```bash
./gradlew build
```

The iOS app can be opened in Xcode and linked against the generated `shared` framework.
