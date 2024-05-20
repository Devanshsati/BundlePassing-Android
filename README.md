# BundlePassing

BundlePassing is an Android application that demonstrates how to pass data between activities using intents and bundles. The app captures user input in `MainActivity` and displays it in `SecondActivity`.

## Features

- Capture user input (name, email, phone, and address) in `MainActivity`.
- Pass the captured data to `SecondActivity`.
- Display the data in `SecondActivity` using string resources with placeholders.

## Getting Started

### Prerequisites

- Android Studio (latest version recommended)
- Android SDK

### Installation

1. Clone the repository:
    ```sh
    git clone https://github.com/your-username/BundlePassing.git
    ```
2. Open the project in Android Studio.
3. Sync the project with Gradle files.

## Usage

1. **MainActivity**: The main screen where the user inputs their name, email, phone, and address.
    - Input fields for name, email, phone, and address.
    - A button to submit the data.

2. **SecondActivity**: The screen that displays the data passed from `MainActivity`.
    - Displays the user's name, email, phone, and address using string resources with placeholders.

## Contributing

Contributions are welcome! Please open an issue or submit a pull request for any bugs or enhancements.

## License

This project is licensed under the MIT License. See the LICENSE file for details.

## Acknowledgments

- [Android Documentation](https://developer.android.com/docs)
