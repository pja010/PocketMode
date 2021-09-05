# PocketMode
## What and why ##
PocketMode is an Android mobile application that automates the process of switching to vibration mode from ringing mode when you put the phone in your pocket. This is to prevent interrupting others with unwished beeps and sounds during classes, meetings, and social interactions (but still be notified by vibrations). When the phone is not in use and placed on, say, a table, incoming calls and messages will be heard again.

## How it works ##
The app connects to the phone's light sensor and toggles from ringer to vibration mode when it detects a light level of less than 5 lux (a number chosen for no other reason than that it appears low enough for pockets).   
It runs as a background service on the device and does not interfere with active use of the phone.

## Run instructions ##
Most easily done by installing Android SDK in IntellJ (if you haven't yet) as well as the appropriate OEM USB Driver, if using a Windows machine (https://developer.android.com/studio/run/oem-usb).
Then simply connect the phone with a USB cable and run the app from the studio to install it on your device.
