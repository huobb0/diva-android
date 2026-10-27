# DIVA Android

DIVA (Damn Insecure and Vulnerable App) is a deliberately insecure Android app
used to teach secure coding and app penetration testing. This checkout is a
maintenance fork of the Payatu original, kept building and running on current
Android Studio and Android releases; the exercises themselves are unchanged.

## Requirements

- Android Studio Rabbit (2026.2) or newer
- JDK 17 or newer (Android Studio's bundled JBR works)
- Android SDK platform 37 and build-tools 37.0.0
- A device or emulator running Android 8.1 (API 27) or newer

## Build and install

```sh
./gradlew assembleDebug
adb install -r app/build/outputs/apk/debug/app-debug.apk
```

Or open the project in Android Studio and run the `app` configuration.

## Challenges

Thirteen exercises, grouped by theme:

1. Insecure logging
2. Hardcoded secrets, part 1 (Java)
3. Insecure data storage, part 1 (shared preferences)
4. Insecure data storage, part 2 (SQLite)
5. Insecure data storage, part 3 (app-private file)
6. Insecure data storage, part 4 (external storage)
7. Input validation, part 1 (SQL injection)
8. Input validation, part 2 (WebView URI handling)
9. Access control, part 1 (implicit intent)
10. Access control, part 2 (implicit intent with an extra)
11. Access control, part 3 (PIN and content provider)
12. Hardcoded secrets, part 2 (native code)
13. Input validation, part 3 (native code)

## Status on current Android

The app builds and installs on the current platform. A few exercises no longer
reproduce unchanged on recent Android releases because the platform moved
underneath them; the affected areas are being revisited separately rather than
silently reshaped. Treat a failing exercise as a platform change, not as a bug
in the app.

## Attribution and licence

Original DIVA by Payatu (Aseem Jakhar). This fork keeps the original licence:
GPLv3, see `LICENSE`.
