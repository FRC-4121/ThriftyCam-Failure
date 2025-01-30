package frc.failure;

import org.opencv.core.*;
import org.opencv.highgui.HighGui;
import org.opencv.videoio.*;

class Main {
    public static void main(String[] args) {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

        VideoCapture cap = new VideoCapture(0);
        cap.set(Videoio.CAP_PROP_FRAME_WIDTH, 640);
        cap.set(Videoio.CAP_PROP_FRAME_HEIGHT, 480);

        System.out.println("We made it!");

        Mat frame = new Mat();
        cap.read(frame);
        HighGui.imshow("Frame", frame);
        HighGui.waitKey(0);
    }
}
