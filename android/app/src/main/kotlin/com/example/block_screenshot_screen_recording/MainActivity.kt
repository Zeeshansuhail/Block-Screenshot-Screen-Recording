package com.example.block_screenshot_screen_recording

import io.flutter.embedding.android.FlutterActivity
import io.fluter.embedding.engine.FlutterEngine
import android.view.WindowManager.LayoutParams

class MainActivity: FlutterActivity() {
    override fun congigureFlutterEngine(flutterEngine: FlutterEngine) {
        window.addFlag(LayoutParams.FLAG_SECURE)
        super.configureFlutterEngine(flutterEngine)
    }

}
