# Planets App: Mastering Android ListView & Adapters

# 🌌 PlanetsApp

A modern Android app that showcases planets in our solar system with their **images** and **moon counts**.  
Built with **Java**, **Material Design**, and a **custom ListView adapter**.

---

## 🖼️ Preview & Screenshots

---

## ✨ Features

- 📜 Scrollable **ListView** with custom adapter
- 🪐 Planet details: **name**, **moons**, and **image**
- 🎨 Modern **Material CardView** UI design
- ⚡ Smooth performance with **ViewHolder pattern**
- 🛠️ Simple, clean project structure

---

## 🛠️ Tech Stack

- **Language:** Java ☕
- **UI:** XML + Material Components
- **List Rendering:** `ListView` + Custom `ArrayAdapter`
- **Architecture:** Lightweight MVC

---

## 📂 Project Structure

# File Tree: Planets App - 2

Generated on: 8/31/2025, 11:24:18 PM
Root path: `e:\Full-Stack Mobile App Development\Android App Development by Abbass Masri\Section 17 Planets App - Mastering ListView & Adapters\Planets App - 2`

```
├── 📁 .git/ 🚫 (auto-hidden)
├── 📁 .gradle/ 🚫 (auto-hidden)
├── 📁 .idea/ 🚫 (auto-hidden)
├── 📁 app/
│   ├── 📁 build/ 🚫 (auto-hidden)
│   ├── 📁 src/
│   │   ├── 📁 androidTest/
│   │   │   └── 📁 java/
│   │   │       └── 📁 com/
│   │   │           └── 📁 example/
│   │   │               └── 📁 planetsapp/
│   │   │                   └── ☕ ExampleInstrumentedTest.java
│   │   ├── 📁 main/
│   │   │   ├── 📁 java/
│   │   │   │   └── 📁 com/
│   │   │   │       └── 📁 example/
│   │   │   │           └── 📁 planetsapp/
│   │   │   │               ├── ☕ MainActivity.java
│   │   │   │               ├── ☕ MyCustomAdapter.java
│   │   │   │               └── ☕ Planet.java
│   │   │   ├── 📁 res/
│   │   │   │   ├── 📁 drawable/
│   │   │   │   │   ├── 🖼️ default_image.png
│   │   │   │   │   ├── 🖼️ earth.png
│   │   │   │   │   ├── 📄 ic_launcher_background.xml
│   │   │   │   │   ├── 📄 ic_launcher_foreground.xml
│   │   │   │   │   ├── 🖼️ jupiter.png
│   │   │   │   │   ├── 🖼️ mars.png
│   │   │   │   │   ├── 🖼️ mercury.png
│   │   │   │   │   ├── 🖼️ neptune.png
│   │   │   │   │   ├── 🖼️ pluto.png
│   │   │   │   │   ├── 🖼️ saturn.png
│   │   │   │   │   ├── 🖼️ uranus.png
│   │   │   │   │   └── 🖼️ venus.png
│   │   │   │   ├── 📁 layout/
│   │   │   │   │   ├── 📄 activity_main.xml
│   │   │   │   │   └── 📄 item_list_layout.xml
│   │   │   │   ├── 📁 mipmap-anydpi-v26/
│   │   │   │   │   ├── 📄 ic_launcher.xml
│   │   │   │   │   └── 📄 ic_launcher_round.xml
│   │   │   │   ├── 📁 mipmap-hdpi/
│   │   │   │   │   ├── 🖼️ ic_launcher.webp
│   │   │   │   │   └── 🖼️ ic_launcher_round.webp
│   │   │   │   ├── 📁 mipmap-mdpi/
│   │   │   │   │   ├── 🖼️ ic_launcher.webp
│   │   │   │   │   └── 🖼️ ic_launcher_round.webp
│   │   │   │   ├── 📁 mipmap-xhdpi/
│   │   │   │   │   ├── 🖼️ ic_launcher.webp
│   │   │   │   │   └── 🖼️ ic_launcher_round.webp
│   │   │   │   ├── 📁 mipmap-xxhdpi/
│   │   │   │   │   ├── 🖼️ ic_launcher.webp
│   │   │   │   │   └── 🖼️ ic_launcher_round.webp
│   │   │   │   ├── 📁 mipmap-xxxhdpi/
│   │   │   │   │   ├── 🖼️ ic_launcher.webp
│   │   │   │   │   └── 🖼️ ic_launcher_round.webp
│   │   │   │   ├── 📁 values/
│   │   │   │   │   ├── 📄 colors.xml
│   │   │   │   │   ├── 📄 strings.xml
│   │   │   │   │   └── 📄 themes.xml
│   │   │   │   ├── 📁 values-night/
│   │   │   │   │   └── 📄 themes.xml
│   │   │   │   └── 📁 xml/
│   │   │   │       ├── 📄 backup_rules.xml
│   │   │   │       └── 📄 data_extraction_rules.xml
│   │   │   └── 📄 AndroidManifest.xml
│   │   └── 📁 test/
│   │       └── 📁 java/
│   │           └── 📁 com/
│   │               └── 📁 example/
│   │                   └── 📁 planetsapp/
│   │                       └── ☕ ExampleUnitTest.java
│   ├── 🚫 .gitignore
│   ├── 🟦 build.gradle.kts 🚫 (auto-hidden)
│   └── 📄 proguard-rules.pro
├── 📁 gradle/
│   ├── 📁 wrapper/
│   │   ├── ☕ gradle-wrapper.jar 🚫 (auto-hidden)
│   │   └── 📄 gradle-wrapper.properties 🚫 (auto-hidden)
│   └── ⚙️ libs.versions.toml
├── 🚫 .gitignore
├── 📖 README.md
├── 🟦 build.gradle.kts 🚫 (auto-hidden)
├── 📄 gradle.properties
├── 📄 gradlew
├── 🐚 gradlew.bat
├── 📄 local.properties 🚫 (auto-hidden)
└── 🟦 settings.gradle.kts
```

---

## _Generated by FileTree Pro Extension_

## 🚀 Getting Started

### Prerequisites

- Android Studio **Giraffe+**
- Min SDK: **21 (Lollipop)**
- Target SDK: **33+**

### Installation

```bash
# Clone the repository
git clone https://github.com/your-username/PlanetsApp.git

# Open in Android Studio and run
```

---

## 🔮 Roadmap

- [ ] Migrate from **ListView → RecyclerView**
- [ ] Add **planet detail screen** on item click
- [ ] Enable **dark mode** 🌙
- [ ] Fetch planet data from a **REST API** instead of hardcoding
- [ ] Add **animations & transitions**

---

## 👨‍💻 Author

Made with ❤️ by Satinder Singh Sall
