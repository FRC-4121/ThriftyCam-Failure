# Thriftybot camera failure

This is tested on a Raspberry Pi, with failures on both a Pi 4 and 5.
This needs OpenCV 4.6.0, which was installed through APT.

To make the camera see color, run `v4l2-ctl -c saturation=100` (with the camera plugged in). After this is run, opening the camera with any other application shows color, even across restarts and on other computers.

This program can be run with Gradle and shows a minimal example of the camera hanging on configuration.
