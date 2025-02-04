# Thriftybot camera failure

This is tested on a Raspberry Pi, with failures on both a Pi 4 and 5.
This needs OpenCV 4.6.0, which was installed through APT.

To make the camera see color, run `v4l2-ctl -c saturation=100` (with the camera plugged in). After this is run, opening the camera with any other application shows color, even across restarts and on other computers.

This program can be run with Gradle and shows a minimal example of the camera hanging on configuration. It doesn't fail every time, but it failed on the second time I ran it and fails somewhat regularly.
To do that with the tools bundled with WPILib:
- Open the repository in the WPILib VS Code
- Press Ctrl-Shift-P to open the command palette
- Find the command called "WPILib: Run a command in Gradle"
- Type `run` as the command
