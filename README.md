# 🏠 Smart Home Control – Android IoT Automation Project

A complete IoT-based home automation system that enables users to remotely control and monitor home appliances using an Android application connected with NodeMCU (ESP8266) over MQTT protocol.

---

## 📘 ABSTRACT  
In the era of smart technology, home automation has become crucial for enhancing comfort, safety, and energy efficiency.  
The project **“Android App for Smart Home Control”** focuses on building a powerful IoT-based automation system where users can operate various household appliances through an Android app named **Smart Home**.

The system uses a **NodeMCU (ESP8266)** microcontroller as the central unit which communicates with the mobile app using the **MQTT protocol**, ensuring fast and reliable real-time communication.  
Users can control devices such as:

- Main Gate & Parking Gate  
- Lights  
- Fans  
- Air Conditioner  
- Cooler  
- Television  
- Security & Door Lock System  
- Temperature Monitoring  

The app includes **secure login**, **role-based permissions**, **real-time device state tracking**, and **activity logs** showing which user controlled what device and at what time.  
This project delivers a cost-effective, secure, scalable, and user-friendly system that integrates multiple automation features under one mobile interface—turning any normal home into a smart connected environment.

---

## 📖 INTRODUCTION  

The rise of IoT (Internet of Things) has transformed conventional homes into intelligent systems capable of automation, monitoring, and remote control.  
In most homes, appliances like lights, fans, AC, security systems, and gates are still manually operated, which limits convenience and energy efficiency.

This project addresses these issues by providing:

✔ Remote access to appliances  
✔ Real-time monitoring  
✔ Highly secure user authentication  
✔ Scalable and low-cost IoT infrastructure  

This Android application works seamlessly with NodeMCU and MQTT to create a complete smart home ecosystem.

---

## 🎯 OBJECTIVES

- Develop a user-friendly Android app to control multiple home appliances.  
- Enable real-time communication using the MQTT protocol.  
- Provide secure login and user access control.  
- Maintain complete operation history for audit and tracking.  
- Display real-time device ON/OFF status.  
- Ensure low power consumption and minimal hardware cost.  
- Integrate smart features such as automation and monitoring.

---

## 📌 KEY FEATURES

### 🏠 Device Control
- ON/OFF control for lights, fans, AC, cooler, TV, etc.  
- Motorized main gate and parking gate operation.  

### 🌐 Real-Time Communication
- High-speed MQTT protocol  
- Instant command execution  
- Status update within milliseconds  

### 🔐 Secure User Login
- Username & password authentication  
- Role-based access for different categories of users  

### ⏱ Device Operation History
- Logs every action taken  
- Shows user name, device name, and timestamp  

### 📡 Real-Time Monitoring
- Temperature sensor integration  
- Live status of ON/OFF devices  

### 🎨 Modern UI & UX
- Material Grid Dashboard  
- Card-based UI  
- Smooth fragment navigation  

---

## 🧠 SYSTEM ARCHITECTURE
```
Android App (Kotlin)
│
│ MQTT Publish/Subscribe
▼
Cloud MQTT Broker (HiveMQ / Mosquitto)
│
▼
NodeMCU ESP8266
│
├─ Relay 1 → Light
├─ Relay 2 → Fan
├─ Relay 3 → AC
├─ Relay 4 → Cooler
├─ Gate Motor Driver
└─ Sensors → Temperature, Door Sensor
```

---

## 🔄 WORKING PRINCIPLE (FLOW)

1️⃣ User logs into the Android app  
2️⃣ App connects to the MQTT broker  
3️⃣ User taps on a device button  
4️⃣ App publishes MQTT command (ex: `home/light/on`)  
5️⃣ NodeMCU receives the command and switches the relay  
6️⃣ NodeMCU publishes response topic (ex: `home/light/status/on`)  
7️⃣ App updates the device status in real time  
8️⃣ Operation stored in history database  

---

## 🧩 FLOWCHART
```
    ┌─────────────┐
    │   User App   │
    └──────┬────────┘
           │
    Login / Control
           │
           ▼
   MQTT Publish/Subscribe
           │
           ▼
   Cloud MQTT Broker
           │
           ▼
      NodeMCU ESP8266
           │
    Executes Command
           │
           ▼
   Sends Status Update
           │
           ▼
    Android App Updates
```
---

## 🛠 HARDWARE REQUIREMENTS

- NodeMCU ESP8266  
- 4/8-Channel Relay Module  
- Temperature Sensor (DHT11/22)  
- Motor Driver (for gate control)  
- AC Bulb, Fan, Cooler, TV  
- Power Supply 5V/12V  
- Wi-Fi Router  

---

## 💻 SOFTWARE REQUIREMENTS

- Android Studio (Kotlin)  
- MQTT Android Library (Paho)  
- Cloud MQTT Broker (HiveMQ / Mosquitto)  
- Arduino IDE  
- Firebase / SQLite (Optional for login/history)  

---

## 📂 PROJECT DIRECTORY STRUCTURE
```
SmartHomeControl/
├── app/
│ ├── java/com.rajkishorbgp.smarthomecontrol/
│ │ ├── HomeFragment.kt
│ │ ├── LoginActivity.kt
│ │ ├── ElectricalActivity.kt
│ │ ├── HistoryActivity.kt
│ │ ├── adapter/
│ │ │ └── HomeGridViewAdapter.kt
│ │ ├── model/
│ │ │ └── CardItem.kt
│ │ └── mqtt/
│ │ └── MqttClientHelper.kt
│ │
│ └── res/
│ ├── layout/
│ ├── drawable/
│ └── values/
│
└── nodemcu/
└── smart_home.ino

```
---

## 📡 MQTT TOPICS USED

home/light
home/fan
home/ac
home/cooler
home/gate/main
home/gate/parking
home/temperature
home/status/#
home/control/#

---

## 🧾 SAMPLE MOSQUITTO COMMANDS

Turn ON a light:

Turn OFF a fan:

NodeMCU status response:

---

## ▶ HOW TO RUN THE PROJECT

### 📱 Android App
1. Import project in Android Studio  
2. Connect mobile or use emulator  
3. Configure MQTT broker URL in MqttClientHelper.kt  
4. Run the app  

### ⚙️ NodeMCU Setup
1. Open Arduino IDE  
2. Install ESP8266 Board  
3. Enter MQTT broker details  
4. Upload code to NodeMCU  
5. Connect relays and sensors  

---

## 📊 ADVANTAGES

- Fast communication via MQTT  
- Extremely low hardware cost  
- Easy to expand (add more devices anytime)  
- Highly secure system  
- Real-time monitoring & history  

---

## 🔮 FUTURE SCOPE

- Integration with Google Assistant / Alexa  
- AI-based energy saving  
- Predictive appliance automation  
- Gesture-based control  
- Advanced security (OTP, Face login)  
- CCTV Live Streaming inside the app  

---

## 🧑‍💻 AUTHOR  
**Raj Kishor**  
Android Developer | IoT Engineer  

---

## 📄 LICENSE  
This project is open-source and free for learning, research, and modification.

MIT License
```
Copyright (c) 2025 Raj Kishor

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights  
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell  
copies of the Software, and to permit persons to whom the Software is  
furnished to do so, subject to the following conditions:  

The above copyright notice and this permission notice shall be included in  
all copies or substantial portions of the Software.  

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR  
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,  
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE  
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER  
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING  
FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS  
IN THE SOFTWARE.
```
