# OnGloballyPositionedTest
OnGloballyPositionedTest is a GitHub repository designed to observe and test the behavior of the `.onGloballyPositioned` modifier in Jetpack Compose. This project includes a custom modifier, `.trackable`, which collects and manages the coordinates of UI elements displayed on the screen.

## Features
By applying the `.trackable` modifier, you can retrieve the on-screen coordinates of UI elements.
The collected coordinates are stored in a `ConcurrentHashMap`, enabling real-time management of UI element positions.
When a UI element is removed from the screen, it is automatically removed from the map using `onDispose`, optimizing resource usage.
Using the stored map of UI elements, a real-time overlay outline is dynamically updated and displayed around each tracked UI element.

## Example Usage
```kotlin
@Composable
fun TrackableBox() {
    Box(
        modifier = Modifier
            .size(100.dp)
            .trackable() // Applying the custom modifier
    ) {
        // Content
    }
}
```

## Demo
The following GIF demonstrates the real-time tracking and overlay rendering of UI elements in action.

| HorizontalPager | Zoom |
|----|----|
| <img src="https://github.com/user-attachments/assets/e460bd31-1bab-445d-9043-847a15ee961a"> | <img src="https://github.com/user-attachments/assets/d49829c1-8fb6-4b82-a0c6-2c080e1f0086"> |


## License
This project is licensed under the [MIT License](https://mit-license.org/).
